package com.example.administrator.editknee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.pagePerson.History;
import com.example.administrator.editknee.pagePerson.HistoryKnee;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase2.Phase2;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.pagePhase4.Phase4;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase6.Phase6;

public class Saveknee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saveknee);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void Oc_phase (View view){
        switch (view.getId()){
            case R.id.btn_phase1:
                Intent p1 = new Intent(this,Phase1.class);
                startActivity(p1);
                break;
            case R.id.btn_phase2:
                Intent p2 = new Intent(this,Phase2.class);
                startActivity(p2);
                break;
            case R.id.btn_phase3:
                Intent p3 = new Intent(this,Phase3.class);
                startActivity(p3);
                break;
            case R.id.btn_phase4:
                Intent p4 = new Intent(this,Phase4.class);
                startActivity(p4);
                break;
            case R.id.btn_phase5:
                Intent p5 = new Intent(this,Phase5.class);
                startActivity(p5);
                break;
            case R.id.btn_phase6:
                Intent p6 = new Intent(this,Phase6.class);
                startActivity(p6);
                break;
        }
    }
}


