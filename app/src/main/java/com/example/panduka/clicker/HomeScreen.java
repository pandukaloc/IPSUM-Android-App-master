package com.example.panduka.clicker;


import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import at.grabner.circleprogress.CircleProgressView;

/**
 * Created by pandukaloc on 07/03/2017.
 */

    /**
     * A simple {@link Fragment} subclass.
     */
    public class HomeScreen extends Activity {

        public Button Btn1,Btn2;
        private TextView status;
        private CircleProgressView soilPercentage, intensityPercentage,temperaturePercentage,humidityPercentage;
        Handler bluetoothIn;

        final int handlerState = 0;
        private BluetoothAdapter btAdapter = null;
        private BluetoothSocket btSocket = null;
        private StringBuilder recDataString = new StringBuilder();

        private ConnectedThread mConnectedThread;

        // SPP UUID service - this should work for most devices
        private static final UUID BTMODULEUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    // String for MAC address, passed from the previous intent
    private static String address;

    public HomeScreen() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1 = (Button)findViewById(R.id.btn1);
        Btn2= (Button) findViewById(R.id.btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);
            }
        });
       Intent intent = getIntent();
        address = intent.getStringExtra("IPSUM_MAC_ADDRESS");
        Toast.makeText(getBaseContext(),"Connected to "+address, Toast.LENGTH_SHORT).show();

        status= (TextView) findViewById(R.id.status);
        soilPercentage = (CircleProgressView) findViewById(R.id.soilCircleView);
        intensityPercentage = (CircleProgressView) findViewById(R.id.intensityCircleView);
        temperaturePercentage = (CircleProgressView) findViewById(R.id.temperatureCircleView);
        humidityPercentage = (CircleProgressView) findViewById(R.id.humidityCircleView);
        Btn1 = (Button)findViewById(R.id.btn2);

        bluetoothIn = new Handler() {
            public void handleMessage(android.os.Message msg) {
                if (msg.what == handlerState) {
                    String readMessage = (String) msg.obj;
                    recDataString.append(readMessage);//keep appending to string until ~
                    int endOfLineIndex = recDataString.indexOf("~");// determine the end-of-line
                    if (endOfLineIndex > 0) { // make sure there data before ~
                        String dataInPrint = recDataString.substring(0, endOfLineIndex);// extract string

                        int dataLength = dataInPrint.length(); //get length of data received

                        if (recDataString.charAt(0) == '#')                             //if it starts with # we know it is what we are looking for
                        {
                            String[] msgArray = recDataString.toString().split(",");
                            String soilLevel = msgArray[0];           //get sensor value from string between indices 1-5
                            String lightLevel = msgArray[1];
                            String tempLevel = msgArray[2];
                            String humidityLevel = msgArray[3];

                            //remove the # from the soil string
                            String soilNew = soilLevel.replaceAll("[#]","");

  // ---------------------------------------------------------------------------------------------------------------------------- //

                            //Methana ena values percentage walata convert karanna
                            // example - soilLevel = soilLevel * 100 %;


// ---------------------------------------------------------------------------------------------------------------------------- //


                            //pass the values to the progress bars
                            soilPercentage.setValueAnimated(Float.valueOf(soilNew), 1500);
                            intensityPercentage.setValueAnimated(Float.valueOf(lightLevel), 1500);
                            temperaturePercentage.setValueAnimated(Float.valueOf(tempLevel), 1500);
                            humidityPercentage.setValueAnimated(Float.valueOf(humidityLevel), 1500);


                        }
                        recDataString.delete(0, recDataString.length());                    //clear all string data
                        // strIncom =" ";
                        dataInPrint = " ";
                    }
                }
            }
        };

        btAdapter = BluetoothAdapter.getDefaultAdapter();       // get Bluetooth adapter
        checkBTState();
    }
    private BluetoothSocket createBluetoothSocket(BluetoothDevice device) throws IOException {

        return  device.createRfcommSocketToServiceRecord(BTMODULEUUID);
        //creates secure outgoing connecetion with BT device using UUID
    }

    @Override
    public void onResume() {
        super.onResume();

        Intent intent = getIntent();
        address = intent.getStringExtra("IPSUM_MAC_ADDRESS");
        //create device and set the MAC address
        BluetoothDevice device = btAdapter.getRemoteDevice(address);

        try {
            btSocket = createBluetoothSocket(device);
        } catch (IOException e) {
            Toast.makeText(getBaseContext(), "Socket creation failed", Toast.LENGTH_LONG).show();
        }
        // Establish the Bluetooth socket connection.
        try
        {
            btSocket.connect();
        } catch (IOException e) {
            try
            {
                btSocket.close();
            } catch (IOException e2)
            {
                //insert code to deal with this
            }
        }
        mConnectedThread = new ConnectedThread(btSocket);
        mConnectedThread.start();

        //I send a character when resuming.beginning transmission to check device is connected
        //If it is not an exception will be thrown in the write method and finish() will be called
        mConnectedThread.write("x");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        try
        {
            //Don't leave Bluetooth sockets open when leaving activity
            btSocket.close();
        } catch (IOException e2) {
            //insert code to deal with this
        }
    }

    //Checks that the Android device Bluetooth is available and prompts to be turned on if off
    private void checkBTState() {

        if(btAdapter==null) {
            Toast.makeText(getBaseContext(), "Device does not support bluetooth", Toast.LENGTH_LONG).show();
        } else {
            if (btAdapter.isEnabled()) {
            } else {
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent, 1);
            }
        }
    }

    //create new class for connect thread
    private class ConnectedThread extends Thread {
        private final InputStream mmInStream;
        private final OutputStream mmOutStream;

        //creation of the connect thread
        public ConnectedThread(BluetoothSocket socket) {
            InputStream tmpIn = null;
            OutputStream tmpOut = null;

            try {
                //Create I/O streams for connection
                tmpIn = socket.getInputStream();
                tmpOut = socket.getOutputStream();
            } catch (IOException e) { }

            mmInStream = tmpIn;
            mmOutStream = tmpOut;
        }

        public void run() {
            byte[] buffer = new byte[256];
            int bytes;

            // Keep looping to listen for received messages
            while (true) {
                try {
                    bytes = mmInStream.read(buffer);            //read bytes from input buffer
                    String readMessage = new String(buffer, 0, bytes);
                    // Send the obtained bytes to the UI Activity via handler
                    bluetoothIn.obtainMessage(handlerState, bytes, -1, readMessage).sendToTarget();
                } catch (IOException e) {
                    break;
                }
            }
        }
        //write method
        public void write(String input) {
            byte[] msgBuffer = input.getBytes();           //converts entered String into bytes
            try {
                mmOutStream.write(msgBuffer);                //write bytes over BT connection via outstream
            } catch (IOException e) {
                //if you cannot write, close the application
                Toast.makeText(getBaseContext(), "Connection Failure", Toast.LENGTH_LONG).show();
                //finish();

            }
        }

    }
}
