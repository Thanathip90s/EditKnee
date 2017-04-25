package com.example.administrator.editknee.pagePhase2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity2;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase2;

import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase2_5 extends UsageBaseActivity2 {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE2_ID = "phase2Id";
    private TextView number2_5Input, showValue;
    private EditText note2_5Input, editNum;
    private int mPhase2Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_5);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.FIVE);

        showValue = (TextView) findViewById(R.id.number2_5);
        number2_5Input = (TextView) findViewById(R.id.number2_5);
        note2_5Input = (EditText) findViewById(R.id.editText_note2_5);
        editNum = (EditText) findViewById(R.id.edtNum);

        if (getIntent().hasExtra(EXTRA_PHASE2_ID)) {
            mPhase2Id = getIntent().getIntExtra(EXTRA_PHASE2_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase2 dbPhase2 = DatabaseManager.getInstance(this)
                .getDBPhase2(mPhase2Id);
        if (dbPhase2 != null) {
            number2_5Input.setText(String.valueOf(dbPhase2.getNumber2_5()));
            note2_5Input.setText(dbPhase2.getNote5());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase2:
                int intEdt = Integer.parseInt(editNum.getText().toString());
                if (counter >= 0 && counter <= intEdt - 1 && note2_5Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= intEdt - 1 && note2_5Input != null) {
                    saveDbPhase2();
                } else {
                    saveDbPhase2();
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

    private void saveDbPhase2() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase2
        DBPhase2 dbPhase2 = DatabaseManager.getInstance(this)
                .getDBPhase2(mPhase2Id);
        dbPhase2.setNumber2_5(Integer.parseInt(number2_5Input.getText().toString()));
        dbPhase2.setNote5(note2_5Input.getText().toString());

        // Store DBPhase2
        Intent intent = new Intent(Phase2_5.this, CompletePhase2.class);
        intent.putExtra(EXTRA_PHASE2_ID, mPhase2Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase2(dbPhase2);
        finish();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
