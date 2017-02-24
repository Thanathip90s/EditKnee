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

public class Record3 extends AppCompatActivity {
   /* EditText _Weight;
    Realm realm;
   /* String txtgender;
    String txtbirthday;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record3);
    }

      /*  _Weight = (EditText)findViewById(R.id.editText_weight);
        Realm.init(this);
        realm = Realm.getDefaultInstance();
      /*  Intent getData = getIntent();
        txtgender = getData.getStringExtra("gender");
        txtbirthday = getData.getStringExtra("birthday");*/

      /*  findViewById(R.id.button_record3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Record3.this,Record4.class);
                startActivity(i);
                realm.beginTransaction();
                //DB operation

                Person obj = realm.createObject(Person.class);
                obj.setId(new Date().toString());
                obj.setWeight(_Weight.getText().toString());
                realm.commitTransaction();
            }
        });
    }

/*    public void Button_record3(View view) {
        EditText w = (EditText) findViewById(R.id.editText_weight);
        Button btn_record3 = (Button) findViewById(R.id.button_record3);
        Intent intent = new Intent(Record3.this, Record4.class);
        EditText weight = (EditText) findViewById(R.id.editText_weight);
        String text = weight.getText().toString();

        if (w.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "กรุณากรอกด้วยค่ะ/ครับ", Toast.LENGTH_SHORT).show();
        }
        else {
            intent.putExtra("gender", txtgender);
            intent.putExtra("birthday", txtbirthday);
            intent.putExtra("weight", text);
            startActivity(intent);
        }
    }*/
}
