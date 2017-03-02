package com.example.administrator.editknee.pagePhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase4.PicPhase4_6;

public class Phase4_5 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number4_5);

    }
    public void  countIN (View  view){
        counter++;
        if (counter>=0 && counter<=25)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        if (counter>=0 && counter<=25)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase4_5 (View view){
        Intent intent = new Intent(Phase4_5.this,PicPhase4_6.class);
        startActivity(intent);
    }
}
