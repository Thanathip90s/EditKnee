package com.example.administrator.editknee.picPhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1_1;
import com.example.administrator.editknee.pagePhase1.Phase1_2;

public class PicPhase1_2 extends AppCompatActivity {
    public static int REQUEST_UPDATE = 99;
    public static String EXTRA_PHASE1_ID = "phase1Id";
    private int mPhase1Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_phase1_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("หงาย-ชิด-ก้น");

        if (getIntent().hasExtra(EXTRA_PHASE1_ID)) {
            mPhase1Id = getIntent().getIntExtra(EXTRA_PHASE1_ID, 0);
        }

        findViewById(R.id.btn_Pic1_2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PicPhase1_2.this, Phase1_2.class);
                intent.putExtra(EXTRA_PHASE1_ID, mPhase1Id);
                startActivityForResult(intent, REQUEST_UPDATE);
                finish();
            }
        });
    }
}
