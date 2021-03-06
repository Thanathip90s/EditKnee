package com.example.administrator.editknee.pagePhase1;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.UsageBaseActivity;
import com.example.administrator.editknee.R;

public class Phase1_2 extends UsageBaseActivity {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private TextView number1_2Input, showValue;
    private EditText note1_2Input, editNum;
    private int mPhase1Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_2);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);

        showValue = (TextView) findViewById(R.id.number1_2);
        number1_2Input = (TextView) findViewById(R.id.number1_2);
        note1_2Input = (EditText) findViewById(R.id.editText_note1_2);
        editNum = (EditText) findViewById(R.id.edtNum);

        if (getIntent().hasExtra(EXTRA_PHASE1_ID)) {
            mPhase1Id = getIntent().getIntExtra(EXTRA_PHASE1_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);
        if (dbPhase1 != null) {
            number1_2Input.setText(String.valueOf(dbPhase1.getNumber1_2()));
            note1_2Input.setText(dbPhase1.getNote2());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase1:
                int intEdt = Integer.parseInt(editNum.getText().toString());
                if (counter >= 0 && counter <= intEdt - 1 && note1_2Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= intEdt - 1 && note1_2Input != null) {
                    saveDbPhase1();
                } else {
                    saveDbPhase1();
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

    private void saveDbPhase1() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase1
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);
        dbPhase1.setNumber1_2(Integer.parseInt(number1_2Input.getText().toString()));
        dbPhase1.setNote2(note1_2Input.getText().toString());

        // Store DBPhase1
        Intent intent = new Intent(Phase1_2.this, Phase1_3.class);
        intent.putExtra(EXTRA_PHASE1_ID, mPhase1Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase1(dbPhase1);
        finish();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
