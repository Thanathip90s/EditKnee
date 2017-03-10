package com.example.administrator.editknee.picPhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.pagePhase2.Phase2_2;
import com.example.administrator.editknee.pagePhase2.Phase2_5;

public class PicPhase2_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase2_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เดิน-สี่-ขา");

        findViewById(R.id.btn_Pic2_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase2_5.this, Phase2_5.class);
                startActivity(intent);
            }
        });
    }
}
