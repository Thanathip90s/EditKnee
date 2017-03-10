package com.example.administrator.editknee.picPhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase3.Phase3_5;
import com.example.administrator.editknee.picPhase2.PicPhase2_1;

public class PicPhase3_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase3_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เดิน-สาม-ขา");

        findViewById(R.id.btn_Pic3_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase3_5.this, Phase3_5.class);
                startActivity(intent);
            }
        });
    }
}
