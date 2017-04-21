package com.example.administrator.editknee.pagePhase6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase6;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity6;
import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase6_1 extends UsageBaseActivity6 {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE6_ID = "phase6Id";
    private TextView number6_1Input, showValue;
    private EditText note6_1Input;
    private int mPhase6Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6_1);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);

        showValue = (TextView) findViewById(R.id.number6_1);
        number6_1Input = (TextView) findViewById(R.id.number6_1);
        note6_1Input = (EditText) findViewById(R.id.editText_note6_1);

        if (getIntent().hasExtra(EXTRA_PHASE6_ID)) {
            mPhase6Id = getIntent().getIntExtra(EXTRA_PHASE6_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase6 dbPhase6 = DatabaseManager.getInstance(this)
                .getDBPhase6(mPhase6Id);
        if (dbPhase6 != null) {
            number6_1Input.setText(String.valueOf(dbPhase6.getNumber6_1()));
            note6_1Input.setText(dbPhase6.getNote1());
        }
    }

    // @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase6:
                if (counter >= 0 && counter <= 29 && note6_1Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 29 && note6_1Input != null) {
                    saveDbPhase6();
                } else {
                    saveDbPhase6();
                }
        }
    }

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

    private void saveDbPhase6() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase6
        DBPhase6 dbPhase6 = DatabaseManager.getInstance(this)
                .getDBPhase6(mPhase6Id);
        dbPhase6.setNumber6_1(Integer.parseInt(number6_1Input.getText().toString()));
        dbPhase6.setNote1(note6_1Input.getText().toString());

        // Store DBPhase6
        Intent intent = new Intent(Phase6_1.this, Phase6_2.class);
        intent.putExtra(EXTRA_PHASE6_ID, mPhase6Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase6(dbPhase6);
        finish();

    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}


