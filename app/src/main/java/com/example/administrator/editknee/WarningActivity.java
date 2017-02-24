package com.example.administrator.editknee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class WarningActivity extends AppCompatActivity {

 /*   String txtgender;
    String txtbirthday;
    String txtweight;
    String txtheight;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);
     /*   Intent getData = getIntent();
        txtgender = getData.getStringExtra("gender");
        txtbirthday = getData.getStringExtra("birthday");
        txtweight = getData.getStringExtra("weight");
        txtheight = getData.getStringExtra("height");*/
    }
    public void Onclick_next (View view){
        Button btn_next = (Button)findViewById(R.id.button_next);
        Intent intent = new Intent(WarningActivity.this,Menu.class);
    /*    intent.putExtra("gender",txtgender);
        intent.putExtra("birthday", txtbirthday);
        intent.putExtra("weight", txtweight);
        intent.putExtra("height", txtheight);*/
        startActivity(intent);
    }
}
