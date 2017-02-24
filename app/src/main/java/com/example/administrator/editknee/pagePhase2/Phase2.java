package com.example.administrator.editknee.pagePhase2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.picPhase2.PicPhase2_1;
import com.example.administrator.editknee.R;

import java.text.DateFormat;
import java.util.Date;

public class Phase2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtDate = (TextView) findViewById(R.id.txt_Date2);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time2);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

    }
    public void Onclick_nextphase2 (View view) {
        Intent intent = new Intent(Phase2.this,PicPhase2_1.class);
        startActivity(intent);
    }
}


