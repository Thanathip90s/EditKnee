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
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;
import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity3;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase3.Phase3;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CompletePhase3 extends UsageBaseActivity3 {
    public static String EXTRA_PHASE3_ID = "phase3Id";
    private int mPhase3Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase3);

        stateprogressbar.setAllStatesCompleted(true);
        stateprogressbar.enableAnimationToCurrentState(false);

        if (getIntent().hasExtra(EXTRA_PHASE3_ID)) {
            mPhase3Id = getIntent().getIntExtra(EXTRA_PHASE3_ID, 0);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase3:
                DatabaseManager databaseManager = DatabaseManager.getInstance(this);

                // Set DBPhase3
                DBPhase3 dbPhase3 = DatabaseManager.getInstance(this)
                        .getDBPhase3(mPhase3Id);

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

                databaseManager.storeDBPhase3(dbPhase3);
                Intent cp3 = new Intent(CompletePhase3.this, HistoryFirstPhase3.class);
                startActivity(cp3);
                finish();
        }
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
