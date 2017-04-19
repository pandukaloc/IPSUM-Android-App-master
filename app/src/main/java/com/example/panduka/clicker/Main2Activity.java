package com.example.panduka.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends Activity  {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//    }
    ListView listview;
    private static String PLANT_DETAILS;

    String[] mobileArray = {"Sugarcane","Barley","Date Palm","Papaya",
            "Guava","Apple","Orange","Potato","Pepper"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listview = (ListView)findViewById(R.id.mobile_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        //ListView listView = (ListView) findViewById(R.id.mobile_list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(mDeviceClickListener);


    }
    private AdapterView.OnItemClickListener mDeviceClickListener = new AdapterView.OnItemClickListener()
    {
        public void onItemClick(AdapterView<?> av, View v, int arg2, long arg3)
        {
            String info = ((TextView) v).getText().toString();
            String plant = info.substring(arg2);

            // Make an intent to start next activity while taking an extra which is the MAC address.
            Intent i = new Intent(Main2Activity.this, ThirdActivity.class);
            i.putExtra("PLANT_DETAILS",plant);
            startActivity(i);

        }
    };
}
