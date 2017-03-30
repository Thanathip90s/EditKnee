package com.example.administrator.editknee.pagePerson;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.R;

public class EditPerson extends AppCompatActivity {
    EditText date;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_person);

        getSupportActionBar().setTitle("แก้ไขประวัติ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        date = (EditText) findViewById(R.id.ET_editBirthday);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(EditPerson.this,
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

        findViewById(R.id.BT_editSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton male = (RadioButton) findViewById(R.id.button_male);
                RadioButton female = (RadioButton) findViewById(R.id.button_female);
                EditText name = (EditText) findViewById(R.id.ET_editName);
                EditText birthday = (EditText) findViewById(R.id.ET_editBirthday);
                EditText weight = (EditText) findViewById(R.id.ET_editWeight);
                EditText height = (EditText) findViewById(R.id.ET_editHeight);

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
                if (name.getText().toString().isEmpty()) {
                    name.setError("กรุณากรอกชื่อด้วยคะ");
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
                    person.setName(name.getText().toString());
                    person.setBirthday(birthday.getText().toString());
                    person.setWeight(weight.getText().toString());
                    person.setHeight(height.getText().toString());

                    DatabaseManager databaseManager = new DatabaseManager(EditPerson.this);
                    databaseManager.storePerson(person);
                    Intent i = new Intent(EditPerson.this, MenuFragActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}