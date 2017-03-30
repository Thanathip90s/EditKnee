package com.example.administrator.editknee.pagePhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase1;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase6;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;

public class Phase6_6 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6_6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เดิน-สอง-ขา");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number6_6);

        findViewById(R.id.button_nextphase6_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase6_6.this, CompletePhase6.class);
                startActivity(intent);
            }
        });
    }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 30)
            showValue.setText(Integer.toString(counter) + " นาที");
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 30)
            showValue.setText(Integer.toString(counter) + " นาที");
    }
}
