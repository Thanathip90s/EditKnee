package com.example.administrator.editknee.picPhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase4.Phase4_2;
import com.example.administrator.editknee.pagePhase4.Phase4_3;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;

public class PicPhase4_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase4_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ก้ม-แตะ-เท้า");

        findViewById(R.id.btn_Pic4_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase4_3.this, Phase4_3.class);
                startActivity(intent);
            }
        });
    }
}
