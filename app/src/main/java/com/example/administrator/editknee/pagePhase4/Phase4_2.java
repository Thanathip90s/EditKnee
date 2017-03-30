package com.example.administrator.editknee.pagePhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase4.PicPhase4_1;
import com.example.administrator.editknee.picPhase4.PicPhase4_3;

public class Phase4_2 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("คว่ำ-ชิด-ก้น");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number4_2);

        findViewById(R.id.button_nextphase4_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase4_2.this, Phase4_3.class);
                startActivity(intent);
            }
        });
    }

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 25)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 25)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }
}
