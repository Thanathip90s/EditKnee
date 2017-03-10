package com.example.administrator.editknee.picPhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1_2;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.picPhase1.PicPhase1_2;

public class PicPhase2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase2_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("กระ-ดก-เท้า");

        findViewById(R.id.btn_Pic2_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase2_1.this, Phase2_1.class);
                startActivity(intent);
            }
        });
    }
}
