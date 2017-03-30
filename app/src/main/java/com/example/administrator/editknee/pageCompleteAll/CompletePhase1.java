package com.example.administrator.editknee.pageCompleteAll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1;

public class CompletePhase1 extends AppCompatActivity {
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private int mPhase1Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase1);

        if (getIntent().hasExtra(EXTRA_PHASE1_ID)) {
            mPhase1Id = getIntent().getIntExtra(EXTRA_PHASE1_ID, 0);
        }
    }
    public void Oc_closePhase1 (View view){
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase1
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(this, Phase1.class);
        PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
        notificationManager.cancelAll();
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("บันทึกเข่า,ระยะที่ 1")
                .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                .setContentIntent(pintent)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(0, notification);

        databaseManager.storeDBPhase1(dbPhase1);
        Intent cp1 = new Intent(CompletePhase1.this,MenuFragActivity.class);
        startActivity(cp1);
        finish();
    }
}
