package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.picPhase1.PicPhase1_2;
import com.example.administrator.editknee.R;

public class Phase1_1 extends AppCompatActivity {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private TextView number1_1Input, showValue;
    private EditText note1_1Input;
    private int mPhase1Id;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("1. กระ-ดก-เท้า");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number1_1);

        number1_1Input = (TextView) findViewById(R.id.number1_1);
        note1_1Input = (EditText) findViewById(R.id.editText_note1_1);
        Button saveButton = (Button) findViewById(R.id.button_nextphase1_1);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDbPhase1();
            }
        });

        if (getIntent().hasExtra(EXTRA_PHASE1_ID)) {
            mPhase1Id = getIntent().getIntExtra(EXTRA_PHASE1_ID, 0);
        }
    }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter));
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter));
    }

    private void saveDbPhase1() {
        DatabaseManager databaseManager = DatabaseManager.getInstance(this);

        // Set DBPhase1
        DBPhase1 dbPhase1 = DatabaseManager.getInstance(this)
                .getDBPhase1(mPhase1Id);
        dbPhase1.setNumber1_1(Integer.parseInt(number1_1Input.getText().toString()));
        dbPhase1.setNote1(note1_1Input.getText().toString());

        // Store DBPhase1
        Intent intent = new Intent(Phase1_1.this, Phase1_2.class);
        intent.putExtra(EXTRA_PHASE1_ID, mPhase1Id);
        startActivityForResult(intent, REQUEST_UPDATE);
        databaseManager.storeDBPhase1(dbPhase1);
        finish();

    }
}


