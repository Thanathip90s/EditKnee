package com.example.administrator.editknee.pagePhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase1;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase2;
import com.example.administrator.editknee.picPhase2.PicPhase2_2;

public class Phase2_5 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เดิน-สี่-ขา");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number2_5);

        findViewById(R.id.button_nextphase2_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase2_5.this, CompletePhase2.class);
                startActivity(intent);
            }
        });
    }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 15)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 15)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }
}
