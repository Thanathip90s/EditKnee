package com.example.administrator.editknee.pagePerson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.ModelPerson.Person;
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

        TextView q1 = (TextView) findViewById(R.id.txt_Q1);
        TextView dateQ1 = (TextView) findViewById(R.id.date_Q1);
        TextView q2 = (TextView) findViewById(R.id.txt_Q2);
        TextView dateQ2 = (TextView) findViewById(R.id.date_Q2);
        TextView q3 = (TextView) findViewById(R.id.txt_Q3);
        TextView dateQ3 = (TextView) findViewById(R.id.date_Q3);
        TextView q4 = (TextView) findViewById(R.id.txt_Q4);
        TextView q5 = (TextView) findViewById(R.id.txt_Q5);
        TextView q6 = (TextView) findViewById(R.id.txt_Q6);
        TextView q7 = (TextView) findViewById(R.id.txt_Q7);
        TextView q8 = (TextView) findViewById(R.id.txt_Q8);

        DatabaseManager databaseManager2 = new DatabaseManager(this);
        DetailPerson detailPerson = databaseManager2.getDetailPerson();

        if (detailPerson.getQ1() == null) {
            q1.setText("1. จองคิวนัดวันผ่า (แพทย์จะทำการผ่าตัดทุกวันจันทร์)" + " ✕");
            dateQ1.setVisibility(View.GONE);
        } else {
            q1.setText(String.format(getString(R.string.txtQ1), detailPerson.getQ1() + " ✓"));
            dateQ1.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ1()));
        }

        if (detailPerson.getQ2() == null) {
            q2.setText("2. นัดหมายการตรวจร่างกายก่อนเข้ารับการผ่าตัดและปรึกษาเรื่องค่าใช้จ่ายในการผ่าตัดซึ่งขึ้นอยู่กับชนิดข้อที่ใช้และหอผู้ป่วย" + " ✕");
            dateQ2.setVisibility(View.GONE);
        } else {
            q2.setText(String.format(getString(R.string.txtQ2), detailPerson.getQ2() + " ✓"));
            dateQ2.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ2()));
        }

        if (detailPerson.getQ3() == null) {
            q3.setText("3. จองห้องนอนโรงพยาบาล" + " ✕");
            dateQ3.setVisibility(View.GONE);
        } else {
            q3.setText(String.format(getString(R.string.txtQ3), detailPerson.getQ3() + " ✓"));
            dateQ3.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ3()));
        }

        if (detailPerson.getQ4() == null) {
            q4.setText("4. รับใบนัดและรับยา" + " ✕");
        } else {
            q4.setText(String.format(getString(R.string.txtQ4), detailPerson.getQ4() + " ✓"));
        }

        if (detailPerson.getQ5() == null) {
            q5.setText("5. ตรวจเลือด-ปัสสาวะ (คลินิคอายุรกรรม)" + " ✕");
        } else {
            q5.setText(String.format(getString(R.string.txtQ5), detailPerson.getQ5() + " ✓"));
        }

        if (detailPerson.getQ6() == null) {
            q6.setText("6. ตรวจโรคประจำตัว เช่น ความดันโลหิต เบาหวาน เป็นต้น (คลินิคอายุรกรรม)" + " ✕");
        } else {
            q6.setText(String.format(getString(R.string.txtQ6), detailPerson.getQ6() + " ✓"));
        }

        if (detailPerson.getQ7() == null) {
            q7.setText("7. เอกซเรย์ปอดและข้อเข่า" + " ✕");
        } else {
            q7.setText(String.format(getString(R.string.txtQ7), detailPerson.getQ7() + " ✓"));
        }

        if (detailPerson.getQ8() == null) {
            q8.setText("8. ตรวจคลื่นไฟฟ้าหัวใจ" + " ✕");
        } else {
            q8.setText(String.format(getString(R.string.txtQ8), detailPerson.getQ8() + " ✓"));
        }
    }

    public void OcHistory(View view) {
        switch (view.getId()) {
            /*case R.id.btn_HistoryBack:
                finish();
                break;*/
            case R.id.btn_EditHistory:
                Intent intent = new Intent(History.this, EditPerson.class);
                startActivity(intent);
                break;
        }
    }
}



