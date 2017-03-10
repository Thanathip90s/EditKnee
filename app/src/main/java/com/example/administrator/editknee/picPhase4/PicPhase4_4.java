package com.example.administrator.editknee.picPhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase4.Phase4_2;
import com.example.administrator.editknee.pagePhase4.Phase4_4;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;

public class PicPhase4_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase4_4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("นั่ง-เหยียด-ค้าง");

        findViewById(R.id.btn_Pic4_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase4_4.this, Phase4_4.class);
                startActivity(intent);
            }
        });
    }
}
