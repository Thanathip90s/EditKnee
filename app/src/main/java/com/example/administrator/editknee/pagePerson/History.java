package com.example.administrator.editknee.pagePerson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.Person;
import com.example.administrator.editknee.R;


public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView gender = (TextView) findViewById(R.id.txt_gender);
        TextView birthday = (TextView) findViewById(R.id.txt_birthday);
        TextView weight = (TextView) findViewById(R.id.txt_weight);
        TextView height = (TextView) findViewById(R.id.txt_height);

        DatabaseManager databaseManager = new DatabaseManager(this);
        Person person = databaseManager.getPerson();

        gender.setText(String.format(getString(R.string.txtGender), person.getGender()));
        birthday.setText(String.format(getString(R.string.txtBiryhday), person.getBirthday()));
        weight.setText(String.format(getString(R.string.txtWeight), person.getWeight() + " ก.ก"));
        height.setText(String.format(getString(R.string.txtHeight), person.getHeight() + " ซ.ม"));

    }

    public void OcHistory(View view) {
        switch (view.getId()) {
            /*case R.id.btn_HistoryBack:
                finish();
                break;*/
            case R.id.btn_HistoryKnee:
                Intent i = new Intent(History.this, HistoryKnee.class);
                startActivity(i);
                finish();
                break;
            case R.id.btn_EditHistory:
                Intent intent = new Intent(History.this, EditPerson.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}



