package com.example.administrator.editknee.picPhase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_2;
import com.example.administrator.editknee.pagePhase2.Phase2_4;

public class PicPhase2_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase2_4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("นั่ง-เหยียด-ค้าง");
    }
    public void StartP2_4 (View view){
        Intent intent = new Intent(PicPhase2_4.this,Phase2_4.class);
        startActivity(intent);
    }
}
