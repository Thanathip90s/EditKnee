package com.example.administrator.editknee.picPhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase4.Phase4_5;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;

public class PicPhase4_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase4_5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("เกาะ-ย่อ-ลง");
    }
    public void StartP4_5 (View view){
        Intent intent = new Intent(PicPhase4_5.this,Phase4_5.class);
        startActivity(intent);
    }
}
