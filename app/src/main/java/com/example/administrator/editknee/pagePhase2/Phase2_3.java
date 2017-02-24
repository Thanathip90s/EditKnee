package com.example.administrator.editknee.pagePhase2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase2.PicPhase2_4;

/**
 * Created by Administrator on 1/17/2017.
 */

public class Phase2_3 extends AppCompatActivity {

    TextView showValue;
    int counter = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number2_3);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase2_3 (View view){
        Intent intent = new Intent(Phase2_3.this,PicPhase2_4.class);
        startActivity(intent);

    }
}
