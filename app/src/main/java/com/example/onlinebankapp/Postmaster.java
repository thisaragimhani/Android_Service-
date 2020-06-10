package com.example.onlinebankapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;


public class Postmaster extends Service {
    @androidx.annotation.Nullable

    private static final String TAG = "17020621";

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle extras = intent.getExtras();
        String tmp = extras.getString("name");
        System.out.println("=====================================================");
        System.out.println(tmp);
        System.out.println("=====================================================");
        return super.onStartCommand(intent, flags, startId);


    }


}

