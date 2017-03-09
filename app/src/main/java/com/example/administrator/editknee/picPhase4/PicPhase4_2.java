package com.example.administrator.editknee.picPhase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase4.Phase4_2;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;

public class PicPhase4_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase4_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("คว่ำ-ชิด-ก้น");
    }
    public void StartP4_2 (View view){
        Intent intent = new Intent(PicPhase4_2.this,Phase4_2.class);
        startActivity(intent);
    }
}
