package com.example.administrator.editknee.picPhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1_3;

public class PicPhase1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase1_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ก้ม-แตะ-เท้า");
    }
    public void StartP1_3 (View view){
        Intent intent = new Intent(PicPhase1_3.this,Phase1_3.class);
        startActivity(intent);
    }
}
