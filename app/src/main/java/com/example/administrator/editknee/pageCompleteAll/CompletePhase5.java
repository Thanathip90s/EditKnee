package com.example.administrator.editknee.pageCompleteAll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase5.Phase5;

public class CompletePhase5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase5);
    }
    public void Oc_closePhase5 (View view){
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(this, Phase5.class);
        PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
        notificationManager.cancelAll();
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("บันทึกเข่า,ระยะที่ 5")
                .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                .setContentIntent(pintent)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(0, notification);

        Intent cp5 = new Intent(CompletePhase5.this,MenuFragActivity.class);
        startActivity(cp5);
        finish();
    }
}
