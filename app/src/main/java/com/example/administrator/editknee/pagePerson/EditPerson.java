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

public class EditPerson extends AppCompatActivity {
    EditText date;
    DatePickerDialog datePickerDialog;
    EditText birthday,weight,height;
    RadioButton btnMale,btnFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_person);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        birthday = (EditText)findViewById(R.id.ET_editBirthday);
        weight = (EditText)findViewById(R.id.ET_editWeight);
        height = (EditText)findViewById(R.id.ET_editHeight);
        btnMale = (RadioButton)findViewById(R.id.button_male);
        btnFemale = (RadioButton)findViewById(R.id.button_female);


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
                RadioButton m = (RadioButton) findViewById(R.id.button_male);
                RadioButton fm = (RadioButton) findViewById(R.id.button_female);
                EditText bd = (EditText) findViewById(R.id.ET_editBirthday);
                EditText we = (EditText) findViewById(R.id.ET_editWeight);
                EditText he = (EditText) findViewById(R.id.ET_editHeight);

                //DB operation
                Person person = new Person();
                if (m.isChecked() == true) {
                    person.setId("1");
                    person.setGender(btnMale.getText().toString());
                }
                if (fm.isChecked() == true){
                    person.setId("1");
                    person.setGender(btnFemale.getText().toString());
                }
                if (m.isChecked() == false & fm.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกเพศด้วยคะ", Toast.LENGTH_SHORT).show();
                }
                if (bd.getText().toString().isEmpty()){
                    bd.setError("กรุณาเลือกวันเกิดด้วยคะ");
                }
                if (we.getText().toString().isEmpty()) {
                    we.setError("กรุณากรอกด้วยคะ");
                }
                if ( he.getText().toString().isEmpty()){
                    he.setError("กรุณากรอกด้วยคะ");
                }

                else {
                    Intent i = new Intent(EditPerson.this, Menu.class);
                    startActivity(i);
                    person.setId("1");
                    person.setBirthday(birthday.getText().toString());
                    person.setWeight(weight.getText().toString());
                    person.setHeight(height.getText().toString());

                    DatabaseManager databaseManager = new DatabaseManager(EditPerson.this);
                    databaseManager.storePerson(person);
                    finish();
                }
            }
        });
    }
}