package com.example.administrator.editknee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.pagePerson.FirstRecord;
import com.example.administrator.editknee.pagePerson.FirstRecord2;
import com.example.administrator.editknee.pagePerson.History;

public class SelectUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_user);

        DatabaseManager databaseManager = DatabaseManager.getInstance(this);
        Person person = databaseManager.getPerson();
        if (person != null) {
            Intent intent = new Intent(this, MenuFragActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void Oc_select(View view) {
        switch (view.getId()) {
            case R.id.btn_notSick:
                Intent s1 = new Intent(this, FirstRecord.class);
                startActivity(s1);
                break;
            case R.id.btn_Sick:
                Intent s2 = new Intent(this, FirstRecord2.class);
                startActivity(s2);
                break;
        }
    }
}
