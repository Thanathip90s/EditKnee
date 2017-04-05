package com.example.administrator.editknee.pagePhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.R;

import java.text.DateFormat;
import java.util.Date;

public class Phase3 extends AppCompatActivity {
    public static int REQUEST_UPDATE3 = 99;
    public static String EXTRA_PHASE3_ID = "phase3Id";
    private TextView date3Input, time3Input;
    private int mPhase3Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 3");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date3);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time3);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date3Input = (TextView) findViewById(R.id.txt_Date3);
        time3Input = (TextView) findViewById(R.id.txt_Time3);

        Button nextButton = (Button) findViewById(R.id.btn_phase3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_phase3:
                        saveDbPhase3();
                        break;
                }
            }
        });
    }

    private void saveDbPhase3() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase3
        mPhase3Id = databaseManager.getLatestId3();
        DBPhase3 dbPhase3 = new DBPhase3();
        dbPhase3.setId(mPhase3Id);
        dbPhase3.setDate3(date3Input.getText().toString());
        dbPhase3.setTime3(time3Input.getText().toString());

        // Store DBPhase3
        Intent intent = new Intent(Phase3.this, Phase3_1.class);
        intent.putExtra(EXTRA_PHASE3_ID, mPhase3Id);
        startActivityForResult(intent, REQUEST_UPDATE3);
        databaseManager.storeDBPhase3(dbPhase3);
        finish();
    }
}