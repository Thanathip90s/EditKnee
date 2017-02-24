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
    EditText date,birthday,weight,height;;
    DatePickerDialog datePickerDialog;
    RadioButton btnMale,btnFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_record);

        birthday = (EditText)findViewById(R.id.ET_birthday);
        weight = (EditText)findViewById(R.id.ET_weight);
        height = (EditText)findViewById(R.id.ET_height);
        btnMale = (RadioButton)findViewById(R.id.button_male);
        btnFemale = (RadioButton)findViewById(R.id.button_female);


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
        if (person != null){
            Intent intent = new Intent(this,Menu.class);
            startActivity(intent);
            finish();
        }

        findViewById(R.id.BT_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton m = (RadioButton) findViewById(R.id.button_male);
                RadioButton fm = (RadioButton) findViewById(R.id.button_female);
                EditText bd = (EditText) findViewById(R.id.ET_birthday);
                EditText we = (EditText) findViewById(R.id.ET_weight);
                EditText he = (EditText) findViewById(R.id.ET_height);

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
                if (we.getText().toString().isEmpty()){
                    we.setError("กรุณากรอกด้วยคะ");
                }
                if (he.getText().toString().isEmpty()){
                    he.setError("กรุณากรอกด้วยคะ");
                }

                else {
                    Intent i = new Intent(FirstRecord.this,Menu.class);
                    startActivity(i);
                    person.setId("1");
                    person.setBirthday(birthday.getText().toString());
                    person.setWeight(weight.getText().toString());
                    person.setHeight(height.getText().toString());

                    DatabaseManager databaseManager = new DatabaseManager(FirstRecord.this);
                    databaseManager.storePerson(person);
                    finish();
                }
            }
        });
    }
}