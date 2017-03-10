package com.example.administrator.editknee.picPhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase3.Phase3_2;
import com.example.administrator.editknee.picPhase2.PicPhase2_1;

public class PicPhase3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase3_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("คว่ำ-ชิด-ก้น");

        findViewById(R.id.btn_Pic3_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase3_2.this, Phase3_2.class);
                startActivity(intent);
            }
        });
    }
}
