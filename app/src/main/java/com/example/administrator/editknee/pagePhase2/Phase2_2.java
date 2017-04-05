package com.example.administrator.editknee.pagePhase2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity2;
import admin.stateprogress.StateProgressBar;

public class Phase2_2 extends UsageBaseActivity2 {
    public static int REQUEST_UPDATE2 = 99;
    public static String EXTRA_PHASE2_ID = "phase2Id";
    private TextView number2_2Input, showValue;
    private EditText note2_2Input;
    private int mPhase2Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_2);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);

        showValue = (TextView) findViewById(R.id.number2_2);

        number2_2Input = (TextView) findViewById(R.id.number2_2);
        note2_2Input = (EditText) findViewById(R.id.editText_note2_2);

        if (getIntent().hasExtra(EXTRA_PHASE2_ID)) {
            mPhase2Id = getIntent().getIntExtra(EXTRA_PHASE2_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase2 dbPhase2 = DatabaseManager.getInstance(this)
                .getDBPhase2(mPhase2Id);
        if (dbPhase2 != null) {
            number2_2Input.setText(String.valueOf(dbPhase2.getNumber2_2()));
            note2_2Input.setText(dbPhase2.getNote2());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase2:
               /* if (counter >= 0 && counter <= 9 && note1_2Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 9 && note1_2Input != null) {
                    saveDbPhase1();
                } else {*/
                saveDbPhase2();
        }
    }
    // }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 15)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 15;
        }
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 15)
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
        dbPhase2.setNumber2_2(Integer.parseInt(number2_2Input.getText().toString()));
        dbPhase2.setNote2(note2_2Input.getText().toString());

        // Store DBPhase2
        Intent intent = new Intent(Phase2_2.this, Phase2_3.class);
        intent.putExtra(EXTRA_PHASE2_ID, mPhase2Id);
        startActivityForResult(intent, REQUEST_UPDATE2);
        databaseManager.storeDBPhase2(dbPhase2);
        finish();

    }
}