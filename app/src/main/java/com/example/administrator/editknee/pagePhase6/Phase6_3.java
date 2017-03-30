package com.example.administrator.editknee.pagePhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;
import com.example.administrator.editknee.picPhase6.PicPhase6_4;

public class Phase6_3 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ก้ม-แตะ-เท้า");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number6_3);

        findViewById(R.id.button_nextphase6_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase6_3.this, Phase6_4.class);
                startActivity(intent);
            }
        });
    }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 30)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 30)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }
}
