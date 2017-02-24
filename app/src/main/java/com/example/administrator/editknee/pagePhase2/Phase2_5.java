package com.example.administrator.editknee.pagePhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase;

public class Phase2_5 extends AppCompatActivity {

    TextView showValue;
    int counter = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number2_5);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase2_5 (View view){
        Intent intent = new Intent(Phase2_5.this,CompletePhase.class);
        startActivity(intent);

    }
}
