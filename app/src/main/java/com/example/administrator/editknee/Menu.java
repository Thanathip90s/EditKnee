package com.example.administrator.editknee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.editknee.pagePerson.History;
import com.example.administrator.editknee.pagePerson.HistoryKnee;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Oc_menu (View view){
        switch (view.getId()){
            case R.id.btn_saveknee:
                Intent m1 = new Intent(this,Saveknee.class);
                startActivity(m1);
                break;
            /*case R.id.btn_knowledge:
                Intent m2 = new Intent(this,HistoryKnee.class);
                startActivity(m2);
                break;*/
            case R.id.btn_history:
                Intent m3 = new Intent(this,History.class);
                startActivity(m3);
                break;
        }
    }
}
