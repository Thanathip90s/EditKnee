package com.example.administrator.editknee.picPhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.pagePhase6.Phase6_1;
import com.example.administrator.editknee.pagePhase6.Phase6_6;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;

public class PicPhase6_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase6_6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เดิน-สอง-ขา");

        findViewById(R.id.btn_Pic6_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase6_6.this, Phase6_6.class);
                startActivity(intent);
            }
        });
    }
}
