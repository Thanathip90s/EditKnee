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
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase5;
import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity5;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase5.Phase5;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CompletePhase5 extends UsageBaseActivity5 {
    public static String EXTRA_PHASE5_ID = "phase5Id";
    private int mPhase5Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase5);

        stateprogressbar.setAllStatesCompleted(true);
        stateprogressbar.enableAnimationToCurrentState(false);

        if (getIntent().hasExtra(EXTRA_PHASE5_ID)) {
            mPhase5Id = getIntent().getIntExtra(EXTRA_PHASE5_ID, 0);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase5:
                DatabaseManager databaseManager = DatabaseManager.getInstance(this);

                // Set DBPhase5
                DBPhase5 dbPhase5 = DatabaseManager.getInstance(this)
                        .getDBPhase5(mPhase5Id);

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

                databaseManager.storeDBPhase5(dbPhase5);
                Intent cp5 = new Intent(CompletePhase5.this, MenuFragActivity.class);
                startActivity(cp5);
                finish();
        }
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
