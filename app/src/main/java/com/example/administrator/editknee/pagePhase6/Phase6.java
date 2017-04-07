package com.example.administrator.editknee.pagePhase6;

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
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.ModelPhase.DBPhase6;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;
import com.example.administrator.editknee.picPhase6.PicPhase6_1;

import java.text.DateFormat;
import java.util.Date;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase6 extends AppCompatActivity {
    public static int REQUEST_UPDATE6 = 99;
    public static String EXTRA_PHASE6_ID = "phase6Id";
    private TextView date6Input, time6Input;
    private int mPhase6Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 6");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date6);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time6);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date6Input = (TextView) findViewById(R.id.txt_Date6);
        time6Input = (TextView) findViewById(R.id.txt_Time6);

        Button nextButton = (Button) findViewById(R.id.btn_phase6);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_phase6:
                        saveDbPhase6();
                        break;
                }
            }
        });
    }

    private void saveDbPhase6() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase6
        mPhase6Id = databaseManager.getLatestId6();
        DBPhase6 dbPhase6 = new DBPhase6();
        dbPhase6.setId(mPhase6Id);
        dbPhase6.setDate6(date6Input.getText().toString());
        dbPhase6.setTime6(time6Input.getText().toString());

        // Store DBPhase6
        Intent intent = new Intent(Phase6.this, Phase6_1.class);
        intent.putExtra(EXTRA_PHASE6_ID, mPhase6Id);
        startActivityForResult(intent, REQUEST_UPDATE6);
        databaseManager.storeDBPhase6(dbPhase6);
        finish();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
