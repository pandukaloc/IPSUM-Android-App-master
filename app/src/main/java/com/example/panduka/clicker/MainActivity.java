/*
package com.example.panduka.clicker;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class MainActivity extends AppCompatActivity {
    public Button Btn1,btn2;
    public final String TAG = "Main";
    private Bluetooth bt;
    private TextView status;
    private CircleProgressView mCircleView1,mCircleView2,mCircleView3,mCircleView4;
    String[] msgArr=new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status= (TextView) findViewById(R.id.status);
        mCircleView1 = (CircleProgressView) findViewById(R.id.circleView);
        mCircleView2 = (CircleProgressView) findViewById(R.id.circleView2);
        mCircleView3 = (CircleProgressView) findViewById(R.id.circleView3);
        mCircleView4 = (CircleProgressView) findViewById(R.id.circleView4);
        Btn1 = (Button)findViewById(R.id.btn2);
        btn2= (Button) findViewById(R.id.btnbluetooth);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                bt = new Bluetooth(this,mHandler);
                connectService();
            }
        });
    }
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case Bluetooth.MESSAGE_STATE_CHANGE:
                    Log.d(TAG, "MESSAGE_STATE_CHANGE: " + msg.arg1);
                    break;
                case Bluetooth.MESSAGE_WRITE:
                    Log.d(TAG, "MESSAGE_WRITE ");
                    break;
                case Bluetooth.MESSAGE_READ:
                    Log.d(TAG, "MESSAGE_READ ");
                    //Extract the string from the Message
                    String message = (String) msg.obj;
                    msgArr=message.split("#");
                    mCircleView1.setValueAnimated(Float.valueOf(message), 1500);
                    break;
                case Bluetooth.MESSAGE_DEVICE_NAME:
                    Log.d(TAG, "MESSAGE_DEVICE_NAME "+msg);
                    break;
                case Bluetooth.MESSAGE_TOAST:
                    Log.d(TAG, "MESSAGE_TOAST "+msg);
                    break;
            }
        }
    };
    public void connectService(){
        try {
            status.setText("Connecting...");
            BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            if (bluetoothAdapter.isEnabled()) {
                bt.start();
                bt.connectDevice("HC-06");
                Log.d(TAG, "Btservice started - listening");
                status.setText("Connected");

            } else {
                Log.w(TAG, "Btservice started - bluetooth is not enabled");
                status.setText("Bluetooth Not enabled");
            }
        } catch(Exception e){
            Log.e(TAG, "Unable to start bt ",e);
            status.setText("Unable to connect " +e);
        }
    }
}
*/
