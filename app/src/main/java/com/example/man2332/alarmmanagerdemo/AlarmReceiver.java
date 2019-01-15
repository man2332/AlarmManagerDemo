package com.example.man2332.alarmmanagerdemo;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import static com.example.man2332.alarmmanagerdemo.NotificationChannelSetUp.CHANNEL_1_ID;


public class AlarmReceiver extends BroadcastReceiver {
    //NotificationManager used for adding Notification objects to Notification channels
    private NotificationManagerCompat notificationManagerCompat;

    //Start notification when this receiver is called
    @Override
    public void onReceive(Context context, Intent intent) {
        //-this notification builder only works on API under 26
        notificationManagerCompat = NotificationManagerCompat.from(context);

        Notification notification = new NotificationCompat.Builder(context,CHANNEL_1_ID)
                .setContentTitle("CONTENT TITLE HERE")
                .setContentText("MESSAGE HERE")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setColor(Color.BLUE)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .build();

        notificationManagerCompat.notify(1, notification);

    }

}
