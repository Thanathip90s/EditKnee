package com.example.administrator.editknee.pageCompleteAll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity2;
import com.example.administrator.editknee.pagePhase2.Phase2;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CompletePhase2 extends UsageBaseActivity2 {
    public static String EXTRA_PHASE2_ID = "phase2Id";
    private int mPhase2Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase2);

        stateprogressbar.setAllStatesCompleted(true);
        stateprogressbar.enableAnimationToCurrentState(false);

        if (getIntent().hasExtra(EXTRA_PHASE2_ID)) {
            mPhase2Id = getIntent().getIntExtra(EXTRA_PHASE2_ID, 0);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase2:
                DatabaseManager databaseManager = DatabaseManager.getInstance(this);

                // Set DBPhase2
                DBPhase2 dbPhase2 = DatabaseManager.getInstance(this)
                        .getDBPhase2(mPhase2Id);

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(this, Phase2.class);
                PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า,ระยะที่ 2")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                databaseManager.storeDBPhase2(dbPhase2);
                Intent cp2 = new Intent(CompletePhase2.this, MenuFragActivity.class);
                startActivity(cp2);
                finish();
        }
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
