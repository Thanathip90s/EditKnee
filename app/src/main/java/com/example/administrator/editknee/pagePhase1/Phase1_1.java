package com.example.administrator.editknee.pagePhase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.editknee.DBPhase1;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.m_Realm.RealmHelper;
import com.example.administrator.editknee.m_Realm.Spacecraft;
import com.example.administrator.editknee.m_UI.MyAdapter;
import com.example.administrator.editknee.picPhase1.PicPhase1_1;
import com.example.administrator.editknee.picPhase1.PicPhase1_2;
import com.example.administrator.editknee.R;

import io.realm.Realm;
import io.realm.RealmChangeListener;

public class Phase1_1 extends AppCompatActivity {

    Realm realm;
    RealmChangeListener realmChangeListener;
    MyAdapter adapter;
    RecyclerView rv;
    EditText NoteTxt1;
    TextView showValue,StepTxt1;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 1");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        showValue = (TextView) findViewById(R.id.number1_1);

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

                adapter = new MyAdapter(Phase1_1.this, helper.justRefresh());
                rv.setAdapter(adapter);
            }
        };

        //ADD IT TO REALM
        realm.addChangeListener(realmChangeListener);


        findViewById(R.id.button_nextphase1_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TextView,EditText
                StepTxt1 = (TextView) findViewById(R.id.number1_1);
                NoteTxt1 = (EditText) findViewById(R.id.editText_note1_1);

                //GET DATA
                String stepTxt1 = StepTxt1.getText().toString();
                String noteTxt1 = NoteTxt1.getText().toString();

                // ADD TO SPACE
                Spacecraft a = new Spacecraft();
                a.setStepTxt1(stepTxt1);
                a.setNoteTxt1(noteTxt1);

                //SAVE
                RealmHelper helper = new RealmHelper(realm);
                if (helper.save(a)) {
                    StepTxt1.setText("");
                    NoteTxt1.setText("");

                    Intent intent = new Intent(Phase1_1.this, PicPhase1_2.class);
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

    public void countIN(View view) {
        counter++;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }

    public void countDE(View view) {
        counter--;
        if (counter >= 0 && counter <= 10)
            showValue.setText(Integer.toString(counter) + " ครั้ง");
    }
}

