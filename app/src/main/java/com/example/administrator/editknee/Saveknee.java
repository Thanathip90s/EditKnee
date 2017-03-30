package com.example.administrator.editknee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase2.Phase2;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.pagePhase4.Phase4;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase6.Phase6;

public class Saveknee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saveknee);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ท่าบริหารเข่า");
    }

    public void Oc_phase(View view) {
        switch (view.getId()) {
            case R.id.btn_phase1:
                Intent p1 = new Intent(this, Phase1.class);
                startActivity(p1);
                break;
            case R.id.btn_phase2:
                Intent p2 = new Intent(this, Phase2.class);
                startActivity(p2);
                break;
            case R.id.btn_phase3:
                Intent p3 = new Intent(this, Phase3.class);
                startActivity(p3);
                break;
            case R.id.btn_phase4:
                Intent p4 = new Intent(this, Phase4.class);
                startActivity(p4);
                break;
            case R.id.btn_phase5:
                Intent p5 = new Intent(this, Phase5.class);
                startActivity(p5);
                break;
            case R.id.btn_phase6:
                Intent p6 = new Intent(this, Phase6.class);
                startActivity(p6);
                break;
        }
    }
}

 /* Button btn_phase1 = (Button) findViewById(R.id.btn_phase1);
        btn_phase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase1.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p1 = new Intent(Saveknee.this, Phase1.class);
                startActivity(p1);
            }
        });

        Button btn_phase2 = (Button) findViewById(R.id.btn_phase2);
        btn_phase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase2.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p2 = new Intent(Saveknee.this, Phase2.class);
                startActivity(p2);
            }
        });

        Button btn_phase3 = (Button) findViewById(R.id.btn_phase3);
        btn_phase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase3.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p3 = new Intent(Saveknee.this, Phase3.class);
                startActivity(p3);
            }
        });

        Button btn_phase4 = (Button) findViewById(R.id.btn_phase4);
        btn_phase4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase4.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p4 = new Intent(Saveknee.this, Phase4.class);
                startActivity(p4);
            }
        });

        Button btn_phase5 = (Button) findViewById(R.id.btn_phase5);
        btn_phase5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase5.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p5 = new Intent(Saveknee.this, Phase5.class);
                startActivity(p5);
            }
        });

        Button btn_phase6 = (Button) findViewById(R.id.btn_phase6);
        btn_phase6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(Saveknee.this, Phase6.class);
                PendingIntent pintent = PendingIntent.getActivities(Saveknee.this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(Saveknee.this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                Intent p6 = new Intent(Saveknee.this, Phase6.class);
                startActivity(p6);
            }
        });*/

