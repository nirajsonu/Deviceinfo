package com.neeraj.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;

public class display extends AppCompatActivity {
TextView t,t1,t2,t3;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        t=findViewById(R.id.width);
        t1=findViewById(R.id.high);
        t2=findViewById(R.id.inch);
        t3=findViewById(R.id.desity);
        toolbar=findViewById(R.id.disp);
        toolbar.setTitle("Display information");
        setSupportActionBar(toolbar);
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth=dm.widthPixels;
        int screenHeight=dm.heightPixels;
        float screendensity=dm.density;
        double x=Math.pow(screenWidth/dm.xdpi,2);
        double y=Math.pow(screenHeight/dm.xdpi,2);
        double screenInches=Math.sqrt(x+y);
        screenInches=(double)Math.round(screenInches *10)/10;
        t.setText("Screen Width:"+screenWidth);
        t1.setText("Screen Hight"+screenHeight);
        t2.setText("Screen inches"+screenInches);
        t3.setText("Screen Destity"+screendensity);
    }
}
