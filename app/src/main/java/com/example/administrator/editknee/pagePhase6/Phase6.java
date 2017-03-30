package com.example.administrator.editknee.pagePhase6;

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
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.picPhase5.PicPhase5_1;
import com.example.administrator.editknee.picPhase6.PicPhase6_1;

import java.text.DateFormat;
import java.util.Date;

public class Phase6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 6");

        TextView txtDate = (TextView) findViewById(R.id.txt_Date6);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time6);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        findViewById(R.id.button_nextphase6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase6.this, Phase6_1.class);
                startActivity(intent);
            }
        });
    }
}
