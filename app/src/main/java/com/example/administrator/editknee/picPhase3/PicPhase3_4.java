package com.example.administrator.editknee.picPhase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.pagePhase3.Phase3_4;
import com.example.administrator.editknee.picPhase2.PicPhase2_1;

public class PicPhase3_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase3_4);
    }
    public void StartP3_4 (View view){
        Intent intent = new Intent(PicPhase3_4.this,Phase3_4.class);
        startActivity(intent);
    }
}
