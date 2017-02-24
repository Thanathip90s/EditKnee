package com.example.administrator.editknee.recordOld;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.editknee.R;

import java.util.Date;
import java.util.List;

import io.realm.Realm;

public class RecordActivity extends AppCompatActivity {

    /*Realm realm;
    RadioButton btnMale, btnFemale;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

      /*  btnMale = (RadioButton) findViewById(R.id.button_male);
        btnFemale = (RadioButton) findViewById(R.id.button_female);


        findViewById(R.id.button_record1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton m = (RadioButton) findViewById(R.id.button_male);
                RadioButton fm = (RadioButton) findViewById(R.id.button_female);

                Person person = new Person();

                if (m.isChecked() == false & fm.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกเพศของคุณคะ", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent i = new Intent(RecordActivity.this, Record2.class);
                    startActivity(i);
                    person.setId("1");
                    person.setGender(btnMale.getText().toString());
                    person.setGender(btnFemale.getText().toString());
                }
                DatabaseManager databaseManager = new DatabaseManager(RecordActivity.this);
                databaseManager.storePerson(person);
            }
        });
    }*/
    }
}


    /*public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.button_male:
                if (checked)
                    str = "ชาย";
                break;
            case R.id.button_female:
                if (checked)
                    str = "หญิง";
                break;
        }
    }*/



    /*public void Button_record(View view) {
        RadioButton m = (RadioButton) findViewById(R.id.button_male);
        RadioButton fm = (RadioButton) findViewById(R.id.button_female);
        Button btn_record = (Button) findViewById(R.id.button_record1);
        Intent intent = new Intent(RecordActivity.this, Record2.class);
        if (m.isChecked() == false && fm.isChecked() == false) {
            Toast.makeText(getApplicationContext(), "กรุณาเลือกเพศของคุณค่ะ/ครับ", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra("gender", str);
            startActivity(intent);

           }
        }*/



