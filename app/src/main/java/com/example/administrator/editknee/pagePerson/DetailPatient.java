package com.example.administrator.editknee.pagePerson;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.MenuFragActivity;
import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DetailPatient extends AppCompatActivity {
    EditText date,date2,date3,date4,date5,date6,date7,date8,date9,date10,date11;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_patient);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        getSupportActionBar().setTitle("กำหนดนัดหมาย");

        date = (EditText) findViewById(R.id.chooseDate);
        date.setVisibility(View.GONE);

        DatabaseManager databaseManager = DatabaseManager.getInstance(this);
        DetailPerson detailPerson = databaseManager.getDetailPerson();
        if (detailPerson != null) {
            Intent intent = new Intent(this, MenuFragActivity.class);
            startActivity(intent);
            finish();
        }

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
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

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
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

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
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

        date4 = (EditText) findViewById(R.id.chooseDate4);
        date4.setVisibility(View.GONE);

        date4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date4.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date5 = (EditText) findViewById(R.id.chooseDate5);
        date5.setVisibility(View.GONE);

        date5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date5.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date6 = (EditText) findViewById(R.id.chooseDate6);
        date6.setVisibility(View.GONE);

        date6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date6.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date7 = (EditText) findViewById(R.id.chooseDate7);
        date7.setVisibility(View.GONE);

        date7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date7.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date8 = (EditText) findViewById(R.id.chooseDate8);
        date8.setVisibility(View.GONE);

        date8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date8.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date9 = (EditText) findViewById(R.id.chooseDate9);
        date9.setVisibility(View.GONE);

        date9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date9.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date10 = (EditText) findViewById(R.id.chooseDate10);
        date10.setVisibility(View.GONE);

        date10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date10.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year + 543));

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        date11 = (EditText) findViewById(R.id.chooseDate11);
        date11.setVisibility(View.GONE);

        date11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(DetailPatient.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date11.setText(dayOfMonth + "/"
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

        findViewById(R.id.checkQ4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q4 = (CheckBox) findViewById(R.id.checkQ4);
                if (q4.isChecked()) {
                    date4.setVisibility(View.VISIBLE);
                } else {
                    date4.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q5 = (CheckBox) findViewById(R.id.checkQ5);
                if (q5.isChecked()) {
                    date5.setVisibility(View.VISIBLE);
                } else {
                    date5.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q6 = (CheckBox) findViewById(R.id.checkQ6);
                if (q6.isChecked()) {
                    date6.setVisibility(View.VISIBLE);
                } else {
                    date6.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q7 = (CheckBox) findViewById(R.id.checkQ7);
                if (q7.isChecked()) {
                    date7.setVisibility(View.VISIBLE);
                } else {
                    date7.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q8 = (CheckBox) findViewById(R.id.checkQ8);
                if (q8.isChecked()) {
                    date8.setVisibility(View.VISIBLE);
                } else {
                    date8.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q9 = (CheckBox) findViewById(R.id.checkQ9);
                if (q9.isChecked()) {
                    date9.setVisibility(View.VISIBLE);
                } else {
                    date9.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q10 = (CheckBox) findViewById(R.id.checkQ10);
                if (q10.isChecked()) {
                    date10.setVisibility(View.VISIBLE);
                } else {
                    date10.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.checkQ11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox q11 = (CheckBox) findViewById(R.id.checkQ11);
                if (q11.isChecked()) {
                    date11.setVisibility(View.VISIBLE);
                } else {
                    date11.setVisibility(View.INVISIBLE);
                }
            }
        });

        findViewById(R.id.btn_saveHistory).setOnClickListener(new View.OnClickListener() {
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
                CheckBox q9 = (CheckBox) findViewById(R.id.checkQ9);
                CheckBox q10 = (CheckBox) findViewById(R.id.checkQ10);
                CheckBox q11 = (CheckBox) findViewById(R.id.checkQ11);
                EditText dateQ1 = (EditText) findViewById(R.id.chooseDate);
                EditText dateQ2 = (EditText) findViewById(R.id.chooseDate2);
                EditText dateQ3 = (EditText) findViewById(R.id.chooseDate3);
                EditText dateQ4 = (EditText) findViewById(R.id.chooseDate4);
                EditText dateQ5 = (EditText) findViewById(R.id.chooseDate5);
                EditText dateQ6 = (EditText) findViewById(R.id.chooseDate6);
                EditText dateQ7 = (EditText) findViewById(R.id.chooseDate7);
                EditText dateQ8 = (EditText) findViewById(R.id.chooseDate8);
                EditText dateQ9 = (EditText) findViewById(R.id.chooseDate9);
                EditText dateQ10 = (EditText) findViewById(R.id.chooseDate10);
                EditText dateQ11 = (EditText) findViewById(R.id.chooseDate11);


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
                if (q9.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ9(q9.getText().toString());
                }
                if (q10.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ8(q10.getText().toString());
                }
                if (q11.isChecked()) {
                    detailPerson.setId("1");
                    detailPerson.setQ11(q11.getText().toString());
                }

                detailPerson.setId("1");
                detailPerson.setDateQ1(dateQ1.getText().toString());
                detailPerson.setDateQ2(dateQ2.getText().toString());
                detailPerson.setDateQ3(dateQ3.getText().toString());
                detailPerson.setDateQ4(dateQ4.getText().toString());
                detailPerson.setDateQ5(dateQ5.getText().toString());
                detailPerson.setDateQ6(dateQ6.getText().toString());
                detailPerson.setDateQ7(dateQ7.getText().toString());
                detailPerson.setDateQ8(dateQ8.getText().toString());
                detailPerson.setDateQ9(dateQ9.getText().toString());
                detailPerson.setDateQ10(dateQ10.getText().toString());
                detailPerson.setDateQ11(dateQ11.getText().toString());
                DatabaseManager databaseManager = new DatabaseManager(DetailPatient.this);
                databaseManager.storeDetailPerson(detailPerson);
                Intent i = new Intent(DetailPatient.this, MenuFragActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
