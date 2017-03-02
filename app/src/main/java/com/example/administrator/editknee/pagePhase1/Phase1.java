package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.m_Realm.RealmHelper;
import com.example.administrator.editknee.m_Realm.Spacecraft;
import com.example.administrator.editknee.m_UI.MyAdapter;
import com.example.administrator.editknee.picPhase1.PicPhase1_1;
import com.example.administrator.editknee.R;

import java.text.DateFormat;
import java.util.Date;

import io.realm.Realm;
import io.realm.RealmChangeListener;

public class
Phase1 extends AppCompatActivity {
    TextView Date1, Time1;
    Realm realm;
    RealmChangeListener realmChangeListener;
    MyAdapter adapter;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtDate = (TextView) findViewById(R.id.txt_Date1);
        TextView txtTime = (TextView) findViewById(R.id.txt_Time1);

        String currentDateString = DateFormat.getDateInstance().format(new Date());
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        txtDate.setText(currentDateString);
        txtTime.setText(currentTimeString);

        //SETUP RV
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //SETUP REALM
        realm = Realm.getDefaultInstance();
        final RealmHelper helper = new RealmHelper(realm);

        //RETRIEVE
        helper.retrieveFromDB();

        //SETUP ADAPTER
        adapter = new MyAdapter(this, helper.justRefresh());
        rv.setAdapter(adapter);

        //DATA CHANGE EVENTS AND REFRESH
        realmChangeListener = new RealmChangeListener() {
            @Override
            public void onChange(Object element) {

                adapter = new MyAdapter(Phase1.this, helper.justRefresh());
                rv.setAdapter(adapter);
            }
        };

        //ADD IT TO REALM
        realm.addChangeListener(realmChangeListener);

        findViewById(R.id.button_nextphase1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TextView
                Date1 = (TextView) findViewById(R.id.txt_Date1);
                Time1 = (TextView) findViewById(R.id.txt_Time1);

                //GET DATA
                String date1 = Date1.getText().toString();
                String time1 = Time1.getText().toString();

                // ADD TO SPACE
                Spacecraft a = new Spacecraft();
                a.setDate1(date1);
                a.setTime1(time1);

                //SAVE
                RealmHelper helper = new RealmHelper(realm);
                if (helper.save(a)) {
                    Date1.setText("");
                    Time1.setText("");

                    Intent intent = new Intent(Phase1.this, PicPhase1_1.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.removeChangeListener(realmChangeListener);
        realm.close();
    }

    /*public void Onclick_nextphase1(View view) {
        Intent intent = new Intent(Phase1.this, PicPhase1_1.class);
        startActivity(intent);
    }*/
}



/*package com.example.administrator.editknee;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Phase1 extends AppCompatActivity {
    EditText date,date1;
    RadioButton sun1,sunset1;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1);

        date = (EditText) findViewById(R.id.txt_date1);
        date1 = (EditText)findViewById(R.id.txt_date1);
        sun1 = (RadioButton) findViewById(R.id.radioButton_sun1);
        sunset1 = (RadioButton) findViewById(R.id.radioButton_sunset1);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final java.util.Calendar c = java.util.Calendar.getInstance();
                int mYear = c.get(java.util.Calendar.YEAR);
                int mMonth = c.get(java.util.Calendar.MONTH);
                int mDay = c.get(java.util.Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(Phase1.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + (year+543));
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        findViewById(R.id.button_nextphase1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton s = (RadioButton) findViewById(R.id.radioButton_sun1);
                RadioButton ss = (RadioButton) findViewById(R.id.radioButton_sunset1);
                EditText dt = (EditText) findViewById(R.id.txt_date1);

                //DB operation
                DBPhase1 dbPhase1 = new DBPhase1();

                if (s.isChecked() == true) {
                    dbPhase1.setId("1");
                    s.setHint("เช้า");
                    dbPhase1.setTime1(sun1.getHint().toString());
                }
                if (ss.isChecked() == true){
                    dbPhase1.setId("1");
                    ss.setHint("เย็น");
                    dbPhase1.setTime1(sunset1.getHint().toString());
                }

                if (s.isChecked() == false & ss.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกเวลาด้วยคะ", Toast.LENGTH_SHORT).show();
                }

                if (dt.getText().toString().isEmpty()) {
                    dt.setError("กรุณาเลือกวันที่ด้วยคะ");
                }

                else {
                    Intent i = new Intent(Phase1.this,Phase1_1.class);
                    startActivity(i);
                    dbPhase1.setId("1");
                    dbPhase1.setDate1(date1.getText().toString());

                    DatabaseManager databaseManager = new DatabaseManager(Phase1.this);
                    databaseManager.storeDBPhase1(dbPhase1);
                }
            }
        });
    }
}*/


