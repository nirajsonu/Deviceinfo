package com.neeraj.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;

import java.util.Formatter;

public class network extends AppCompatActivity {
Toolbar toolbar;
TextView textView;
TelephonyManager tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        toolbar=findViewById(R.id.Network);
        textView=findViewById(R.id.tee);
        tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        toolbar.setTitle("Network information");
        setSupportActionBar(toolbar);
        getwifi();
    }
    public void getwifi()
    {
        WifiManager wifiManager=(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo=wifiManager.getConnectionInfo();
        int ip=wifiInfo.getIpAddress();
        String macAddress=wifiInfo.getMacAddress();
        String bssid=wifiInfo.getBSSID();
        int resi=wifiInfo.getRssi();
        int linkspeed=wifiInfo.getLinkSpeed();
        String ssid=wifiInfo.getSSID();
        int networkid=wifiInfo.getNetworkId();
        String networkop=tm.getNetworkOperatorName();
        String info="IpAddress:"+ip+
        "\n"+"MacAddress:"+macAddress+
                "\n"+"bssid:"+bssid+
                "\n"+"resi:"+resi+
                "\n"+"linkspeed:"+linkspeed+
                "\n"+"ssid:"+ssid+
                "\n"+"networkid:"+networkid+
                "\n"+"network operator:"+networkop;
                textView.setText(info);
    }
}
