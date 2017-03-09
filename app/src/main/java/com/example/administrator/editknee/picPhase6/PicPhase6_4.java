package com.example.administrator.editknee.picPhase6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.pagePhase6.Phase6_4;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;

public class PicPhase6_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase6_4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("นั่ง-เหยียด-ค้าง");
    }
    public void StartP6_4 (View view){
        Intent intent = new Intent(PicPhase6_4.this,Phase6_4.class);
        startActivity(intent);
    }
}
