package com.example.administrator.editknee.pagePhase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase5.PicPhase5_4;

public class Phase5_3 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase5_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number5_3);

    }
    public void  countIN (View  view){
        counter++;
        if (counter>=0 && counter<=30)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        if (counter>=0 && counter<=30)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase5_3 (View view){
        Intent intent = new Intent(Phase5_3.this,PicPhase5_4.class);
        startActivity(intent);
    }
}
