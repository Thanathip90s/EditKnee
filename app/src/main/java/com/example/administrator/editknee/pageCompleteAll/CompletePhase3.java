package com.example.administrator.editknee.pageCompleteAll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase3.Phase3;

public class CompletePhase3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase3);
    }
    public void Oc_closePhase3 (View view){
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(this, Phase3.class);
        PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
        notificationManager.cancelAll();
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("บันทึกเข่า,ระยะที่ 3")
                .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                .setContentIntent(pintent)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(0, notification);

        Intent cp3 = new Intent(CompletePhase3.this,Menu.class);
        startActivity(cp3);
        finish();
    }

}
