package com.example.administrator.editknee.pagePhase5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity5;
import admin.stateprogress.StateProgressBar;

public class Phase5_1 extends UsageBaseActivity5 {
    public static int REQUEST_UPDATE5 = 99;
    public static String EXTRA_PHASE5_ID = "phase5Id";
    private TextView number5_1Input, showValue;
    private EditText note5_1Input;
    private int mPhase5Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase5_1);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);

        showValue = (TextView) findViewById(R.id.number5_1);
        number5_1Input = (TextView) findViewById(R.id.number5_1);
        note5_1Input = (EditText) findViewById(R.id.editText_note5_1);

        if (getIntent().hasExtra(EXTRA_PHASE5_ID)) {
            mPhase5Id = getIntent().getIntExtra(EXTRA_PHASE5_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase5 dbPhase5 = DatabaseManager.getInstance(this)
                .getDBPhase5(mPhase5Id);
        if (dbPhase5 != null) {
            number5_1Input.setText(String.valueOf(dbPhase5.getNumber5_1()));
            note5_1Input.setText(dbPhase5.getNote1());
        }
    }

    // @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase5:
               /* if (counter >= 0 && counter <= 9 && note1_1Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 9 && note1_1Input != null) {
                    saveDbPhase1();
                } else {*/
                saveDbPhase5();
        }
    }
    //}

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 30)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 30;
        }
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 30)
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
        dbPhase5.setNumber5_1(Integer.parseInt(number5_1Input.getText().toString()));
        dbPhase5.setNote1(note5_1Input.getText().toString());

        // Store DBPhase5
        Intent intent = new Intent(Phase5_1.this, Phase5_2.class);
        intent.putExtra(EXTRA_PHASE5_ID, mPhase5Id);
        startActivityForResult(intent, REQUEST_UPDATE5);
        databaseManager.storeDBPhase5(dbPhase5);
        finish();

    }
}

