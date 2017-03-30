package com.example.administrator.editknee.pagePhase4;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.picPhase3.PicPhase3_1;
import com.example.administrator.editknee.picPhase4.PicPhase4_1;

import java.text.DateFormat;
import java.util.Date;

public class Phase4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 4");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date4);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time4);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        findViewById(R.id.button_nextphase4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase4.this, Phase4_1.class);
                startActivity(intent);
            }
        });
    }
}
