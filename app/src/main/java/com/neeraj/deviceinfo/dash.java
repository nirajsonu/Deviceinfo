package com.neeraj.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.hardware.Sensor.TYPE_ALL;

public class dash extends AppCompatActivity {
Toolbar t;
    ListView l;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        t=findViewById(R.id.t);
        t.setTitle("Sensor information");
        setSupportActionBar(t);
        l=findViewById(R.id.l);
        arrayList=new ArrayList<String>();
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        l.setAdapter(adapter);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> list=sm.getSensorList(TYPE_ALL);
        for(Sensor sensor:list)
        {
            arrayList.add(""+sensor.getName());
        }
    }
}
