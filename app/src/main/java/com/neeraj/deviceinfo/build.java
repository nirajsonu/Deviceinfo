package com.neeraj.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class build extends AppCompatActivity {
    TextView t;
    Build build;
    Build.VERSION version;
    String information;
    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
        t=findViewById(R.id.inf);
        tool=findViewById(R.id.too);
        tool.setTitle("Build Information");
        setSupportActionBar(tool);
        saveinfo();
        t.setText(information);


    }
    public void saveinfo()
    {
        information="Brand:"+build.BRAND+"\n"+
                "Product:"+build.PRODUCT+"\n"+
                "Hardware:"+build.HARDWARE+"\n"+
                "Device:"+build.DEVICE+"\n"+
                "Manufacture:"+build.MANUFACTURER+"\n"+
                "Model:"+build.MODEL+"\n"+
                "Security patch:"+version.SECURITY_PATCH+"\n"+
                "Release:"+version.RELEASE+"\n"+
                "SDK:"+version.SDK_INT+"\n"+
                "Host:"+build.HOST+"\n";


    }
    }

