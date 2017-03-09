package com.example.administrator.editknee.picPhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1_1;

public class PicPhase1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase1_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("กระ-ดก-เท้า");
    }

    public void StartP1_1 (View view){
        Intent intent = new Intent(PicPhase1_1.this,Phase1_1.class);
        startActivity(intent);
    }
}
