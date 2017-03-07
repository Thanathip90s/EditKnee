package com.example.administrator.editknee.pagePerson;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.Menu;
import com.example.administrator.editknee.Person;
import com.example.administrator.editknee.R;

public class FirstRecord extends AppCompatActivity {
    EditText date;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_record);

        date = (EditText) findViewById(R.id.ET_birthday);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(FirstRecord.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        DatabaseManager databaseManager = new DatabaseManager(this);
        Person person = databaseManager.getPerson();
        if (person != null) {
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
            finish();
        }

        findViewById(R.id.BT_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton male = (RadioButton) findViewById(R.id.button_male);
                RadioButton female = (RadioButton) findViewById(R.id.button_female);
                EditText birthday = (EditText) findViewById(R.id.ET_birthday);
                EditText weight = (EditText) findViewById(R.id.ET_weight);
                EditText height = (EditText) findViewById(R.id.ET_height);

                Person person = new Person();
                if (male.isChecked()) {
                    person.setId("1");
                    person.setGender(male.getText().toString());
                }
                if (female.isChecked()) {
                    person.setId("1");
                    person.setGender(female.getText().toString());
                }
                if (male.isChecked() == false & female.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกเพศด้วยคะ", Toast.LENGTH_SHORT).show();
                }
                if (birthday.getText().toString().isEmpty()) {
                    birthday.setError("กรุณาเลือกวันเกิดด้วยคะ");
                }
                if (weight.getText().toString().isEmpty()) {
                    weight.setError("กรุณากรอกด้วยคะ");
                }
                if (height.getText().toString().isEmpty()) {
                    height.setError("กรุณากรอกด้วยคะ");
                } else {
                    person.setId("1");
                    person.setBirthday(birthday.getText().toString());
                    person.setWeight(weight.getText().toString());
                    person.setHeight(height.getText().toString());

                    DatabaseManager databaseManager = new DatabaseManager(FirstRecord.this);
                    databaseManager.storePerson(person);
                    Intent i = new Intent(FirstRecord.this, Menu.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}