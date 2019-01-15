package com.example.man2332.alarmmanagerdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    //Start notification when this receiver is called
    @Override
    public void onReceive(Context context, Intent intent) {
        //for now we will just send a toast message
        Toast.makeText(context,"ALERT ALERT ALERT!!", Toast.LENGTH_LONG).show();
    }

}
