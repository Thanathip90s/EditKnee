package com.example.administrator.editknee.pagePhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase;

public class Phase4_6 extends AppCompatActivity {

    TextView showValue;
    int counter = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number4_6);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" นาที");
    }

    public void Onclick_nextphase4_6 (View view){
        Intent intent = new Intent(Phase4_6.this,CompletePhase.class);
        startActivity(intent);
    }
}
