package com.example.administrator.editknee.pageCompleteAll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.R;

public class CompletePhase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_phase);
    }
    public void Oc_closePhase (View view){
        Intent intent = new Intent(CompletePhase.this,Menu.class);
        startActivity(intent);
        finish();
    }
}
