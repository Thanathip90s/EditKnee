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
import com.example.administrator.editknee.pagePhase6.Phase6;

public class CompletePhase6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase6);
    }
    public void Oc_closePhase6 (View view){
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(this, Phase6.class);
        PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
        notificationManager.cancelAll();
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("บันทึกเข่า,ระยะที่ 6")
                .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                .setContentIntent(pintent)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(0, notification);

        Intent cp6 = new Intent(CompletePhase6.this,Menu.class);
        startActivity(cp6);
        finish();
    }
}
