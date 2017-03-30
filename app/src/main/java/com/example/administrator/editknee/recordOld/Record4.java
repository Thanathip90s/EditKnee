package com.example.administrator.editknee.recordOld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.editknee.R;

import java.util.Date;

import io.realm.Realm;

public class Record4 extends AppCompatActivity {

 /*   EditText _Height;
    Realm realm;
   /* String txtgender;
    String txtbirthday;
    String txtweight;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record4);
    }
}

       /* _Height = (EditText)findViewById(R.id.editText_height);
        Realm.init(this);
        realm = Realm.getDefaultInstance();
       /* Intent getData = getIntent();
        txtgender = getData.getStringExtra("gender");
        txtbirthday = getData.getStringExtra("birthday");
        txtweight = getData.getStringExtra("weight");*/
       /* findViewById(R.id.button_record4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);
                realm.beginTransaction();
                //DB operation

                Person obj = realm.createObject(Person.class);
                obj.setId(new Date().toString());
                obj.setHeight(_Height.getText().toString());
                realm.commitTransaction();
            }
        });
    }
    }

  /*  public void Button_record4(View view) {
        EditText h = (EditText) findViewById(R.id.editText_height);
        Button btn_record4 = (Button) findViewById(R.id.button_record4);

        EditText height = (EditText) findViewById(R.id.editText_height);
        String text = height.getText().toString();

        if (h.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "กรุณากรอกด้วยค่ะ/ครับ", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra("gender", txtgender);
            intent.putExtra("birthday", txtbirthday);
            intent.putExtra("weight", txtweight);
            intent.putExtra("height", text);
            startActivity(intent);
        }*/


