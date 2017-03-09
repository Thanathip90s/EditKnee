package com.example.administrator.editknee.picPhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1_2;

public class PicPhase1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase1_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("หงาย-ชิด-ก้น");
    }

    public void StartP1_2 (View view){
        Intent intent = new Intent(PicPhase1_2.this,Phase1_2.class);
        startActivity(intent);
    }
}
