package com.example.administrator.editknee.picPhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_2;
import com.example.administrator.editknee.pagePhase2.Phase2_3;

public class PicPhase2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase2_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ก้ม-แตะ-เท้า");
    }
    public void StartP2_3 (View view){
        Intent intent = new Intent(PicPhase2_3.this,Phase2_3.class);
        startActivity(intent);
    }
}
