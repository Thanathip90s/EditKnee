package com.example.administrator.editknee.pagePhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase6.PicPhase6_2;

public class Phase6_1 extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number6_1);

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

    public void Onclick_nextphase6_1 (View view){
        Intent intent = new Intent(Phase6_1.this,PicPhase6_2.class);
        startActivity(intent);
    }
}
