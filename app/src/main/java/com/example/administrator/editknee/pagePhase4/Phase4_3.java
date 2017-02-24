package com.example.administrator.editknee.pagePhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase4.PicPhase4_4;

public class Phase4_3 extends AppCompatActivity {

    TextView showValue;
    int counter = 24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number4_3);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase4_3 (View view){
        Intent intent = new Intent(Phase4_3.this,PicPhase4_4.class);
        startActivity(intent);
    }
}
