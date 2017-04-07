package com.example.administrator.editknee.pageCompleteAll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase4;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity4;
import com.example.administrator.editknee.pagePhase4.Phase4;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CompletePhase4 extends UsageBaseActivity4 {
    public static String EXTRA_PHASE4_ID = "phase4Id";
    private int mPhase4Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase4);

        stateprogressbar.setAllStatesCompleted(true);
        stateprogressbar.enableAnimationToCurrentState(false);

        if (getIntent().hasExtra(EXTRA_PHASE4_ID)) {
            mPhase4Id = getIntent().getIntExtra(EXTRA_PHASE4_ID, 0);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase4:
                DatabaseManager databaseManager = DatabaseManager.getInstance(this);

                // Set DBPhase4
                DBPhase4 dbPhase4 = DatabaseManager.getInstance(this)
                        .getDBPhase4(mPhase4Id);

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Intent intent = new Intent(this, Phase4.class);
                PendingIntent pintent = PendingIntent.getActivities(this, (int) System.currentTimeMillis(), new Intent[]{intent}, 0);
                notificationManager.cancelAll();
                Notification notification = new Notification.Builder(this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("บันทึกเข่า,ระยะที่ 4")
                        .setContentText("อย่าลืมกลับมาทำอีกครั้งนะคะ ^^")
                        .setContentIntent(pintent)
                        .setAutoCancel(true)
                        .build();

                notificationManager.notify(0, notification);

                databaseManager.storeDBPhase4(dbPhase4);
                Intent cp4 = new Intent(CompletePhase4.this, HistoryFirstPhase4.class);
                startActivity(cp4);
                finish();
        }
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
