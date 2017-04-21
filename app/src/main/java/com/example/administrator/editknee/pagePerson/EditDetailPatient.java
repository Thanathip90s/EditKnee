package com.example.administrator.editknee.pagePerson;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class EditDetailPatient extends AppCompatActivity {
    EditText date,date2,date3;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_detail_patient);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        getSupportActionBar().setTitle("กำหนดนัดหมาย (แก้ไข)");

        date = (EditText) findViewById(R.id.chooseDate);
        date.setVisibility(View.GONE);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(EditDetailPatient.this,
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

        date2 = (EditText) findViewById(R.id.chooseDate2);
        date2.setVisibility(View.GONE);

        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(EditDetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date2.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date3 = (EditText) findViewById(R.id.chooseDate3);
        date3.setVisibility(View.GONE);

        date3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(EditDetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date3.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        findViewById(R.id.checkQ1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q1 = (CheckBox) findViewById(R.id.checkQ1);
                if (q1.isChecked()) {
                    date.setVisibility(View.VISIBLE);
                } else {
                    date.setVisibility(View.INVISIBLE);
                }
            }
        });


        findViewById(R.id.checkQ2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q2 = (CheckBox) findViewById(R.id.checkQ2);
                if (q2.isChecked()) {
                    date2.setVisibility(View.VISIBLE);
                } else {
                    date2.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q3 = (CheckBox) findViewById(R.id.checkQ3);
                if (q3.isChecked()) {
                    date3.setVisibility(View.VISIBLE);
                } else {
                    date3.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.btn_EditsaveHistory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q1 = (CheckBox) findViewById(R.id.checkQ1);
                CheckBox q2 = (CheckBox) findViewById(R.id.checkQ2);
                CheckBox q3 = (CheckBox) findViewById(R.id.checkQ3);
                CheckBox q4 = (CheckBox) findViewById(R.id.checkQ4);
                CheckBox q5 = (CheckBox) findViewById(R.id.checkQ5);
                CheckBox q6 = (CheckBox) findViewById(R.id.checkQ6);
                CheckBox q7 = (CheckBox) findViewById(R.id.checkQ7);
                CheckBox q8 = (CheckBox) findViewById(R.id.checkQ8);
                EditText dateQ1 = (EditText) findViewById(R.id.chooseDate);
                EditText dateQ2 = (EditText) findViewById(R.id.chooseDate2);
                EditText dateQ3 = (EditText) findViewById(R.id.chooseDate3);

                DetailPerson detailPerson = new DetailPerson();
                if (q1.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ1(q1.getText().toString());
                }
                if (q2.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ2(q2.getText().toString());
                }
                if (q3.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ3(q3.getText().toString());
                }
                if (q4.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ4(q4.getText().toString());
                }
                if (q5.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ5(q5.getText().toString());
                }
                if (q6.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ6(q6.getText().toString());
                }
                if (q7.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ7(q7.getText().toString());
                }
                if (q8.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ8(q8.getText().toString());
                }

                detailPerson.setId("1");
                detailPerson.setDateQ1(dateQ1.getText().toString());
                detailPerson.setDateQ2(dateQ2.getText().toString());
                detailPerson.setDateQ3(dateQ3.getText().toString());
                DatabaseManager databaseManager = new DatabaseManager(EditDetailPatient.this);
                databaseManager.storeDetailPerson(detailPerson);
                Intent i = new Intent(EditDetailPatient.this, MenuFragActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_phase1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.close:
                startActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startActivity() {
        finish();
    }
}
