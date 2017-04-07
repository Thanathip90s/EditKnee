package com.example.administrator.editknee.pagePhase4;

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
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;
import com.example.administrator.editknee.picPhase4.PicPhase4_1;

import java.text.DateFormat;
import java.util.Date;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase4 extends AppCompatActivity {
    public static int REQUEST_UPDATE4 = 99;
    public static String EXTRA_PHASE4_ID = "phase4Id";
    private TextView date4Input, time4Input;
    private int mPhase4Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 4");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date4);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time4);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        date4Input = (TextView) findViewById(R.id.txt_Date4);
        time4Input = (TextView) findViewById(R.id.txt_Time4);

        Button nextButton = (Button) findViewById(R.id.btn_phase4);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_phase4:
                        saveDbPhase4();
                        break;
                }
            }
        });
    }

    private void saveDbPhase4() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase4
        mPhase4Id = databaseManager.getLatestId4();
        DBPhase4 dbPhase4 = new DBPhase4();
        dbPhase4.setId(mPhase4Id);
        dbPhase4.setDate4(date4Input.getText().toString());
        dbPhase4.setTime4(time4Input.getText().toString());

        // Store DBPhase4
        Intent intent = new Intent(Phase4.this, Phase4_1.class);
        intent.putExtra(EXTRA_PHASE4_ID, mPhase4Id);
        startActivityForResult(intent, REQUEST_UPDATE4);
        databaseManager.storeDBPhase4(dbPhase4);
        finish();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}