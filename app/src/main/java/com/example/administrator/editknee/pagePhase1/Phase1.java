package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.pagePerson.FirstRecord;
import com.example.administrator.editknee.picPhase1.PicPhase1_1;
import com.example.administrator.editknee.R;

import java.text.DateFormat;
import java.util.Date;


public class Phase1 extends AppCompatActivity {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private TextView date1Input, time1Input;
    private int mPhase1Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 1");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date1);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time1);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date1Input = (TextView) findViewById(R.id.txt_Date1);
        time1Input = (TextView) findViewById(R.id.txt_Time1);

        Button nextButton = (Button) findViewById(R.id.btn_Phase1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_Phase1:
                        saveDbPhase1();
                        break;
                }
            }
        });
    }

    private void saveDbPhase1() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase1
        mPhase1Id = databaseManager.getLatestId();
        DBPhase1 dbPhase1 = new DBPhase1();
        dbPhase1.setId(mPhase1Id);
        dbPhase1.setDate1(date1Input.getText().toString());
        dbPhase1.setTime1(time1Input.getText().toString());

        // Store DBPhase1
        Intent intent = new Intent(Phase1.this, Phase1_1.class);
        intent.putExtra(EXTRA_PHASE1_ID, mPhase1Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase1(dbPhase1);
        finish();
    }

}

