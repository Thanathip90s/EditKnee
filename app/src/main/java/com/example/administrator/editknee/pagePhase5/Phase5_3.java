package com.example.administrator.editknee.pagePhase5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity5;

import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase5_3 extends UsageBaseActivity5 {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE5_ID = "phase5Id";
    private TextView number5_3Input, showValue;
    private EditText note5_3Input, editNum;
    private int mPhase5Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase5_3);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);

        showValue = (TextView) findViewById(R.id.number5_3);
        number5_3Input = (TextView) findViewById(R.id.number5_3);
        note5_3Input = (EditText) findViewById(R.id.editText_note5_3);
        editNum = (EditText) findViewById(R.id.edtNum);

        if (getIntent().hasExtra(EXTRA_PHASE5_ID)) {
            mPhase5Id = getIntent().getIntExtra(EXTRA_PHASE5_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase5 dbPhase5 = DatabaseManager.getInstance(this)
                .getDBPhase5(mPhase5Id);
        if (dbPhase5 != null) {
            number5_3Input.setText(String.valueOf(dbPhase5.getNumber5_3()));
            note5_3Input.setText(dbPhase5.getNote3());
        }
    }

    // @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase5:
                int intEdt = Integer.parseInt(editNum.getText().toString());
                if (counter >= 0 && counter <= intEdt - 1 && note5_3Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= intEdt - 1 && note5_3Input != null) {
                    saveDbPhase5();
                } else {
                    saveDbPhase5();
                }
        }
    }

    public void countIN(View view) {
        counter++;
        int intEdt = Integer.parseInt(editNum.getText().toString());
        if (counter >= 0 && counter <= intEdt)
            showValue.setText(Integer.toString(counter));
        else {
            counter = intEdt;
        }
    }

    public void countDE(View view) {
        counter--;
        int intEdt = Integer.parseInt(editNum.getText().toString());
        if (counter >= 0 && counter <= intEdt)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 0;
        }
    }

    private void saveDbPhase5() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase5
        DBPhase5 dbPhase5 = DatabaseManager.getInstance(this)
                .getDBPhase5(mPhase5Id);
        dbPhase5.setNumber5_3(Integer.parseInt(number5_3Input.getText().toString()));
        dbPhase5.setNote3(note5_3Input.getText().toString());

        // Store DBPhase5
        Intent intent = new Intent(Phase5_3.this, Phase5_4.class);
        intent.putExtra(EXTRA_PHASE5_ID, mPhase5Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase5(dbPhase5);
        finish();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}

