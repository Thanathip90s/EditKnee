package com.example.administrator.editknee.picPhase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase4.Phase4_1;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.picPhase4.PicPhase4_1;

public class PicPhase5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase5_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("หงาย-ชิด-ก้น");
    }
    public void StartP5_1 (View view){
        Intent intent = new Intent(PicPhase5_1.this,Phase5_1.class);
        startActivity(intent);
    }
}
