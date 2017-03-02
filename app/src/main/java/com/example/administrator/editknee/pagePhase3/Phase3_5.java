package com.example.administrator.editknee.pagePhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase;

public class Phase3_5 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number3_5);

    }
    public void  countIN (View  view){
        counter++;
        if (counter>=0 && counter<=20)
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public  void  countDE (View view){
        counter--;
        if (counter>=0 && counter<=20)
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public void Onclick_nextphase3_5 (View view){
        Intent intent = new Intent(Phase3_5.this,CompletePhase.class);
        startActivity(intent);
    }
}
