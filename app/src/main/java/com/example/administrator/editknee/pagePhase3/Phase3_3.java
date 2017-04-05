package com.example.administrator.editknee.pagePhase3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity3;
import admin.stateprogress.StateProgressBar;

public class Phase3_3 extends UsageBaseActivity3 {
    public static int REQUEST_UPDATE3 = 99;
    public static String EXTRA_PHASE3_ID = "phase3Id";
    private TextView number3_3Input, showValue;
    private EditText note3_3Input;
    private int mPhase3Id;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_3);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);

        showValue = (TextView) findViewById(R.id.number3_3);

        number3_3Input = (TextView) findViewById(R.id.number3_3);
        note3_3Input = (EditText) findViewById(R.id.editText_note3_3);

        if (getIntent().hasExtra(EXTRA_PHASE3_ID)) {
            mPhase3Id = getIntent().getIntExtra(EXTRA_PHASE3_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase3 dbPhase3 = DatabaseManager.getInstance(this)
                .getDBPhase3(mPhase3Id);
        if (dbPhase3 != null) {
            number3_3Input.setText(String.valueOf(dbPhase3.getNumber3_3()));
            note3_3Input.setText(dbPhase3.getNote3());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase3:
               /* if (counter >= 0 && counter <= 9 && note1_1Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 9 && note1_1Input != null) {
                    saveDbPhase1();
                } else {*/
                saveDbPhase3();
        }
    }
    //}

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 20)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 20;
        }
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 20)
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
        dbPhase3.setNumber3_3(Integer.parseInt(number3_3Input.getText().toString()));
        dbPhase3.setNote3(note3_3Input.getText().toString());

        // Store DBPhase3
        Intent intent = new Intent(Phase3_3.this, Phase3_4.class);
        intent.putExtra(EXTRA_PHASE3_ID, mPhase3Id);
        startActivityForResult(intent, REQUEST_UPDATE3);
        databaseManager.storeDBPhase3(dbPhase3);
        finish();

    }
}

