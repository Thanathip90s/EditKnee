package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DBPhase1;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.picPhase1.PicPhase1_2;
import com.example.administrator.editknee.R;

public class Phase1_1 extends AppCompatActivity {

    EditText note1;
    TextView showValue, number1;
    int counter = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        number1 = (TextView) findViewById(R.id.number1_1);
        showValue = (TextView) findViewById(R.id.number1_1);
        note1 = (EditText) findViewById(R.id.editText_note1_1);

        findViewById(R.id.button_nextphase1_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //DB operation
                DBPhase1 dbPhase1 = new DBPhase1();
                dbPhase1.setId("1");
                Intent i = new Intent(Phase1_1.this, PicPhase1_2.class);
                startActivity(i);

                dbPhase1.setTxtStep1(number1.getText().toString());
                dbPhase1.setTxtNote1(note1.getText().toString());

                DatabaseManager databaseManager = new DatabaseManager(Phase1_1.this);
                databaseManager.storeDBPhase1(dbPhase1);
                finish();
            }
        });

    }

    public void countIN(View view) {
        for (counter = 0; counter <= 10; counter++)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }

    public void countDE(View view) {
        counter--;
        showValue.setText(Integer.toString(counter) + " ครั้ง");
    }
}

