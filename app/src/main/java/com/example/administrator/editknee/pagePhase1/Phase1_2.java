package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DBPhase1;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.picPhase1.PicPhase1_3;
import com.example.administrator.editknee.R;

public class Phase1_2 extends AppCompatActivity {

    EditText note2;
    TextView showValue,number2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 1");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        number2 = (TextView)findViewById(R.id.number1_2);
        showValue = (TextView)findViewById(R.id.number1_2);
        note2 = (EditText)findViewById(R.id.editText_note1_2);

        findViewById(R.id.button_nextphase1_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                DBPhase1 dbPhase1 = new DBPhase1();
//                dbPhase1.setId("1");
                Intent i = new Intent(Phase1_2.this,PicPhase1_3.class);
                startActivity(i);
//
//                dbPhase1.setTxtStep2(number2.getText().toString());
//                dbPhase1.setTxtNote2(note2.getText().toString());
//
//                DatabaseManager databaseManager = new DatabaseManager(Phase1_2.this);
//                databaseManager.storeDBPhase1(dbPhase1);
            }
        });
    }
    public void  countIN (View  view){
        counter++;
        if (counter>=0 && counter<=10)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }

    public  void  countDE (View view){
        counter--;
        if (counter>=0 && counter<=10)
        showValue.setText(Integer.toString(counter)+" ครั้ง");
    }
}
