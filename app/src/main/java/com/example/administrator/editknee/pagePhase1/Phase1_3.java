package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DBPhase1;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.pageCompleteAll.CompletePhase;
import com.example.administrator.editknee.R;

public class Phase1_3 extends AppCompatActivity {

    EditText note3;
    TextView showValue,number3;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        number3 = (TextView)findViewById(R.id.number1_3);
        showValue = (TextView)findViewById(R.id.number1_3);
        note3 = (EditText)findViewById(R.id.editText_note1_3);

        findViewById(R.id.button_nextphase1_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //DB operation
                DBPhase1 dbPhase1 = new DBPhase1();
                dbPhase1.setId("1");
                Intent i = new Intent(Phase1_3.this,CompletePhase.class);
                startActivity(i);

                dbPhase1.setTxtStep2(number3.getText().toString());
                dbPhase1.setTxtNote2(note3.getText().toString());

                DatabaseManager databaseManager = new DatabaseManager(Phase1_3.this);
                databaseManager.storeDBPhase1(dbPhase1);
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
