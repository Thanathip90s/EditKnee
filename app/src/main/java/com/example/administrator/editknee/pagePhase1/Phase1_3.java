package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.UsageBaseActivity;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase1;
import com.example.administrator.editknee.R;

import admin.stateprogress.StateProgressBar;

public class Phase1_3 extends UsageBaseActivity {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private TextView number1_3Input, showValue;
    private EditText note1_3Input;
    private int mPhase1Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_3);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);

        showValue = (TextView) findViewById(R.id.number1_3);

        number1_3Input = (TextView) findViewById(R.id.number1_3);
        note1_3Input = (EditText) findViewById(R.id.editText_note1_3);

        if (getIntent().hasExtra(EXTRA_PHASE1_ID)) {
            mPhase1Id = getIntent().getIntExtra(EXTRA_PHASE1_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);
        if (dbPhase1 != null) {
            number1_3Input.setText(String.valueOf(dbPhase1.getNumber1_3()));
            note1_3Input.setText(dbPhase1.getNote3());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase1:
                /*if (counter >= 0 && counter <= 9 && note1_3Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 9 && note1_3Input != null) {
                    saveDbPhase1();
                } else {*/
                    saveDbPhase1();
                }
        }
   // }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter));
        else {
            counter=10;
        }
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter));
        else {
            counter=0;
        }
    }

    private void saveDbPhase1() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase1
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);
        dbPhase1.setNumber1_3(Integer.parseInt(number1_3Input.getText().toString()));
        dbPhase1.setNote3(note1_3Input.getText().toString());

        // Store DBPhase1
        Intent intent = new Intent(Phase1_3.this, CompletePhase1.class);
        intent.putExtra(EXTRA_PHASE1_ID, mPhase1Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase1(dbPhase1);
        finish();
    }
}
