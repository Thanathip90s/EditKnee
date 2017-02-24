package com.example.administrator.editknee.pagePhase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase;

public class Phase5_6 extends AppCompatActivity {

    TextView showValue;
    int counter = 19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase5_6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number5_6);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public void Onclick_nextphase5_6 (View view){
        Intent intent = new Intent(Phase5_6.this,CompletePhase.class);
        startActivity(intent);
    }
}
