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
import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase2_4 extends UsageBaseActivity2 {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE2_ID = "phase2Id";
    private TextView number2_4Input, showValue;
    private EditText note2_4Input;
    private int mPhase2Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_4);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);

        showValue = (TextView) findViewById(R.id.number2_4);

        number2_4Input = (TextView) findViewById(R.id.number2_4);
        note2_4Input = (EditText) findViewById(R.id.editText_note2_4);

        if (getIntent().hasExtra(EXTRA_PHASE2_ID)) {
            mPhase2Id = getIntent().getIntExtra(EXTRA_PHASE2_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase2 dbPhase2 = DatabaseManager.getInstance(this)
                .getDBPhase2(mPhase2Id);
        if (dbPhase2 != null) {
            number2_4Input.setText(String.valueOf(dbPhase2.getNumber2_4()));
            note2_4Input.setText(dbPhase2.getNote4());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase2:
                if (counter >= 0 && counter <= 14 && note2_4Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 14 && note2_4Input != null) {
                    saveDbPhase2();
                } else {
                    saveDbPhase2();
                }
        }
    }


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
        dbPhase2.setNumber2_4(Integer.parseInt(number2_4Input.getText().toString()));
        dbPhase2.setNote4(note2_4Input.getText().toString());

        // Store DBPhase2
        Intent intent = new Intent(Phase2_4.this, Phase2_5.class);
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
