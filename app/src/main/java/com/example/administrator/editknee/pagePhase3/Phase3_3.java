package com.example.administrator.editknee.pagePhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase3.PicPhase3_4;

public class Phase3_3 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number3_3);

    }
    public void  countIN (View  view){
        counter++;
        if (counter>=0 && counter<=20)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        if (counter>=0 && counter<=20)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase3_3 (View view){
        Intent intent = new Intent(Phase3_3.this,PicPhase3_4.class);
        startActivity(intent);
    }
}
