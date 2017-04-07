package com.example.administrator.editknee.pagePhase5;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase4.Phase4;
import com.example.administrator.editknee.pagePhase4.Phase4_1;
import com.example.administrator.editknee.picPhase4.PicPhase4_1;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;

import java.text.DateFormat;
import java.util.Date;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase5 extends AppCompatActivity {
    public static int REQUEST_UPDATE5 = 99;
    public static String EXTRA_PHASE5_ID = "phase5Id";
    private TextView date5Input, time5Input;
    private int mPhase5Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 5");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date5);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time5);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date5Input = (TextView) findViewById(R.id.txt_Date5);
        time5Input = (TextView) findViewById(R.id.txt_Time5);

        Button nextButton = (Button) findViewById(R.id.btn_phase5);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_phase5:
                        saveDbPhase5();
                        break;
                }
            }
        });
    }

    private void saveDbPhase5() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase5
        mPhase5Id = databaseManager.getLatestId5();
        DBPhase5 dbPhase5 = new DBPhase5();
        dbPhase5.setId(mPhase5Id);
        dbPhase5.setDate5(date5Input.getText().toString());
        dbPhase5.setTime5(time5Input.getText().toString());

        // Store DBPhase5
        Intent intent = new Intent(Phase5.this, Phase5_1.class);
        intent.putExtra(EXTRA_PHASE5_ID, mPhase5Id);
        startActivityForResult(intent, REQUEST_UPDATE5);
        databaseManager.storeDBPhase5(dbPhase5);
        finish();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
