package com.example.administrator.editknee.pagePhase3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity3;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase3;

import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase3_5 extends UsageBaseActivity3 {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE3_ID = "phase3Id";
    private TextView number3_5Input, showValue;
    private EditText note3_5Input, editNum;
    private int mPhase3Id;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_5);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.FIVE);

        showValue = (TextView) findViewById(R.id.number3_5);
        number3_5Input = (TextView) findViewById(R.id.number3_5);
        note3_5Input = (EditText) findViewById(R.id.editText_note3_5);
        editNum = (EditText) findViewById(R.id.edtNum);

        if (getIntent().hasExtra(EXTRA_PHASE3_ID)) {
            mPhase3Id = getIntent().getIntExtra(EXTRA_PHASE3_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase3 dbPhase3 = DatabaseManager.getInstance(this)
                .getDBPhase3(mPhase3Id);
        if (dbPhase3 != null) {
            number3_5Input.setText(String.valueOf(dbPhase3.getNumber3_5()));
            note3_5Input.setText(dbPhase3.getNote5());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase3:
                int intEdt = Integer.parseInt(editNum.getText().toString());
                if (counter >= 0 && counter <= intEdt - 1 && note3_5Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= intEdt - 1 && note3_5Input != null) {
                    saveDbPhase3();
                } else {
                    saveDbPhase3();
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

    private void saveDbPhase3() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase3
        DBPhase3 dbPhase3 = DatabaseManager.getInstance(this)
                .getDBPhase3(mPhase3Id);
        dbPhase3.setNumber3_5(Integer.parseInt(number3_5Input.getText().toString()));
        dbPhase3.setNote5(note3_5Input.getText().toString());

        // Store DBPhase3
        Intent intent = new Intent(Phase3_5.this, CompletePhase3.class);
        intent.putExtra(EXTRA_PHASE3_ID, mPhase3Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase3(dbPhase3);
        finish();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}

