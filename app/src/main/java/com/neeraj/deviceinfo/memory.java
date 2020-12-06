package com.neeraj.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

public class memory extends AppCompatActivity {
    TextView memo;
    Toolbar t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        t=findViewById(R.id.t);
        t.setTitle("Memory Infomation");
        setSupportActionBar(t);
        memo=findViewById(R.id.memo);
        memo.setText(getMemory());
    }
    public String getMemory()
    {
        ActivityManager.MemoryInfo memoryInfo=new ActivityManager.MemoryInfo();
        ActivityManager activityManager=(ActivityManager)getSystemService(ACTIVITY_SERVICE);
        activityManager.getMemoryInfo(memoryInfo);
        Runtime runtime=Runtime.getRuntime();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Avaliable Memory:").append(memoryInfo.availMem).append("\n");
        stringBuilder.append("Total Memory:").append(memoryInfo.totalMem).append("\n");
        stringBuilder.append("Max Memory:").append(runtime.maxMemory()).append("\n");
        stringBuilder.append("Availble Processors:").append(runtime.availableProcessors()).append("\n");
        return stringBuilder.toString();


    }
}
