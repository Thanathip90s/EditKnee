package com.example.administrator.editknee.pagePhase4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.UsageBaseActivity4;
import admin.stateprogress.StateProgressBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Phase4_4 extends UsageBaseActivity4 {
    public static int REQUEST_UPDATE4 = 99;
    public static String EXTRA_PHASE4_ID = "phase4Id";
    private TextView number4_4Input, showValue;
    private EditText note4_4Input;
    private int mPhase4Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_4);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);

        showValue = (TextView) findViewById(R.id.number4_4);

        number4_4Input = (TextView) findViewById(R.id.number4_4);
        note4_4Input = (EditText) findViewById(R.id.editText_note4_4);

        if (getIntent().hasExtra(EXTRA_PHASE4_ID)) {
            mPhase4Id = getIntent().getIntExtra(EXTRA_PHASE4_ID, 0);
            updateFormView();
        }
    }

    private void updateFormView() {
        DBPhase4 dbPhase4 = DatabaseManager.getInstance(this)
                .getDBPhase4(mPhase4Id);
        if (dbPhase4 != null) {
            number4_4Input.setText(String.valueOf(dbPhase4.getNumber4_4()));
            note4_4Input.setText(dbPhase4.getNote4());
        }
    }

     @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nextPhase4:
               /* if (counter >= 0 && counter <= 9 && note1_1Input.getText().toString().equals("")) {
                    Toast.makeText(this, "กรุณากรอกสาเหตุคะ", Toast.LENGTH_SHORT).show();
                } else if (counter >= 0 && counter <= 9 && note1_1Input != null) {
                    saveDbPhase1();
                } else {*/
                saveDbPhase4();
        }
    }
    //}

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 25)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 25;
        }
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 25)
            showValue.setText(Integer.toString(counter));
        else {
            counter = 0;
        }
    }

    private void saveDbPhase4() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase4
        DBPhase4 dbPhase4 = DatabaseManager.getInstance(this)
                .getDBPhase4(mPhase4Id);
        dbPhase4.setNumber4_4(Integer.parseInt(number4_4Input.getText().toString()));
        dbPhase4.setNote4(note4_4Input.getText().toString());

        // Store DBPhase4
        Intent intent = new Intent(Phase4_4.this, Phase4_5.class);
        intent.putExtra(EXTRA_PHASE4_ID, mPhase4Id);
        startActivityForResult(intent, REQUEST_UPDATE4);
        databaseManager.storeDBPhase4(dbPhase4);
        finish();

    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}

