package com.example.administrator.editknee.picPhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.pagePhase6.Phase6_1;
import com.example.administrator.editknee.pagePhase6.Phase6_5;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;

public class PicPhase6_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase6_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เกาะ-ย่อ-ลง");

        findViewById(R.id.btn_Pic6_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase6_5.this, Phase6_5.class);
                startActivity(intent);
            }
        });
    }
}
