package com.example.administrator.editknee.recordOld;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.editknee.R;

import java.util.Date;

import io.realm.Realm;

public class Record2 extends AppCompatActivity {
   /* EditText _Birthday;
    Realm realm;
    EditText date;
    DatePickerDialog datePickerDialog;
    /*String txtgender;*/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record2);
    }
       /* Intent getData = getIntent();
        txtgender = getData.getStringExtra("gender");
        _Birthday = (EditText)findViewById(R.id.editText_birthday);
        Realm.init(this);
        realm = Realm.getDefaultInstance();
        // initiate the date picker and a button
        date = (EditText) findViewById(R.id.editText_birthday);
        // perform click event on edit text
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR); // current year
                int mMonth = c.get(java.util.Calendar.MONTH); // current month
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(Record2.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        findViewById(R.id.button_record2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Record2.this,Record3.class);
                startActivity(i);
                realm.beginTransaction();
                //DB operation

                Person obj = realm.createObject(Person.class);
                obj.setId(new Date().toString());
                obj.setBirthday(_Birthday.getText().toString());
                realm.commitTransaction();
            }
        });
    }


   /* public void Button_record2(View view) {
        EditText bd = (EditText) findViewById(R.id.editText_birthday);
        Intent intent = new Intent(Record2.this, Record3.class);
        EditText birthday = (EditText) findViewById(R.id.editText_birthday);
        String text = birthday.getText().toString();
        if (bd.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "กรุณากรอกด้วยค่ะ/ครับ", Toast.LENGTH_SHORT).show();
        }
        else {
            intent.putExtra("gender", txtgender);
            intent.putExtra("birthday", text);
            startActivity(intent);
        }*/
    }


