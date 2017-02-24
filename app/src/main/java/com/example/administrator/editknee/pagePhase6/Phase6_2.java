package com.example.administrator.editknee.pagePhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.picPhase6.PicPhase6_3;

public class Phase6_2 extends AppCompatActivity {

    TextView showValue;
    int counter = 29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showValue = (TextView)findViewById(R.id.number6_2);

    }
    public void  countIN (View  view){
        counter++;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public void Onclick_nextphase6_2 (View view){
        Intent intent = new Intent(Phase6_2.this,PicPhase6_3.class);
        startActivity(intent);
    }
}
