package com.example.administrator.editknee.pagePhase2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase1.Phase1_1;
import com.example.administrator.editknee.picPhase2.PicPhase2_1;
import com.example.administrator.editknee.R;

import java.text.DateFormat;
import java.util.Date;

public class Phase2 extends AppCompatActivity {
    public static int REQUEST_UPDATE2 = 99;
    public static String EXTRA_PHASE2_ID = "phase2Id";
    private TextView date2Input, time2Input;
    private int mPhase2Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 2");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date2);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time2);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date2Input = (TextView) findViewById(R.id.txt_Date2);
        time2Input = (TextView) findViewById(R.id.txt_Time2);

        Button nextButton = (Button) findViewById(R.id.btn_phase2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_phase2:
                        saveDbPhase2();
                        break;
                }
            }
        });
    }

    private void saveDbPhase2() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase2
        mPhase2Id = databaseManager.getLatestId2();
        DBPhase2 dbPhase2 = new DBPhase2();
        dbPhase2.setId(mPhase2Id);
        dbPhase2.setDate2(date2Input.getText().toString());
        dbPhase2.setTime2(time2Input.getText().toString());

        // Store DBPhase2
        Intent intent = new Intent(Phase2.this, Phase2_1.class);
        intent.putExtra(EXTRA_PHASE2_ID, mPhase2Id);
        startActivityForResult(intent, REQUEST_UPDATE2);
        databaseManager.storeDBPhase2(dbPhase2);
        finish();
    }
}


