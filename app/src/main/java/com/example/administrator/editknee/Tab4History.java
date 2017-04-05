package com.example.administrator.editknee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.pagePerson.EditDetailPatient;
import com.example.administrator.editknee.pagePerson.EditPerson;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class Tab4History extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4_history, container, false);
        //getActivity().setTitle("ประวัติส่วนบุคคล");
        //getActivity().getActionBar().setTitle("ประวัติส่วนบุคคล");


        TextView name = (TextView) rootView.findViewById(R.id.txt_name);
        TextView gender = (TextView) rootView.findViewById(R.id.txt_gender);
        TextView birthday = (TextView) rootView.findViewById(R.id.txt_birthday);
        TextView weight = (TextView) rootView.findViewById(R.id.txt_weight);
        TextView height = (TextView) rootView.findViewById(R.id.txt_height);

        DatabaseManager databaseManager = new DatabaseManager(getActivity());
        Person person = databaseManager.getPerson();

        name.setText(String.format(getString(R.string.txtName), person.getName()));
        gender.setText(String.format(getString(R.string.txtGender), person.getGender()));
        birthday.setText(String.format(getString(R.string.txtBiryhday), person.getBirthday()));
        weight.setText(String.format(getString(R.string.txtWeight), person.getWeight() + " ก.ก"));
        height.setText(String.format(getString(R.string.txtHeight), person.getHeight() + " ซ.ม"));

        Button editHistory = (Button) rootView.findViewById(R.id.edit_Personal);
        editHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EditPerson.class);
                startActivity(intent);
            }
        });

        Button edit2 = (Button) rootView.findViewById(R.id.edit_detailPersonal);
        TextView that = (TextView) rootView.findViewById(R.id.txt_that);
        TextView stat1 = (TextView) rootView.findViewById(R.id.txt_status1);
        TextView stat2 = (TextView) rootView.findViewById(R.id.txt_status2);
        TextView q1 = (TextView) rootView.findViewById(R.id.txt_Q1);
        TextView dateQ1 = (TextView) rootView.findViewById(R.id.date_Q1);
        TextView q2 = (TextView) rootView.findViewById(R.id.txt_Q2);
        TextView dateQ2 = (TextView) rootView.findViewById(R.id.date_Q2);
        TextView q3 = (TextView) rootView.findViewById(R.id.txt_Q3);
        TextView dateQ3 = (TextView) rootView.findViewById(R.id.date_Q3);
        TextView q4 = (TextView) rootView.findViewById(R.id.txt_Q4);
        TextView q5 = (TextView) rootView.findViewById(R.id.txt_Q5);
        TextView q6 = (TextView) rootView.findViewById(R.id.txt_Q6);
        TextView q7 = (TextView) rootView.findViewById(R.id.txt_Q7);
        TextView q8 = (TextView) rootView.findViewById(R.id.txt_Q8);

        DatabaseManager databaseManager2 = new DatabaseManager(getActivity());
        DetailPerson detailPerson = databaseManager2.getDetailPerson();

        if (detailPerson == null) {
            edit2.setVisibility(View.GONE);
            that.setVisibility(View.GONE);
            stat1.setVisibility(View.GONE);
            stat2.setVisibility(View.GONE);
            q1.setVisibility(View.GONE);
            dateQ1.setVisibility(View.GONE);
            q2.setVisibility(View.GONE);
            dateQ2.setVisibility(View.GONE);
            q3.setVisibility(View.GONE);
            dateQ3.setVisibility(View.GONE);
            q4.setVisibility(View.GONE);
            q5.setVisibility(View.GONE);
            q6.setVisibility(View.GONE);
            q7.setVisibility(View.GONE);
            q8.setVisibility(View.GONE);
        } else {
            if (detailPerson.getQ1() == null) {
                q1.setText("1. จองคิวนัดวันผ่า (แพทย์จะทำการผ่าตัดทุกวันจันทร์)" + " [X]");
                dateQ1.setVisibility(View.GONE);
            } else {
                q1.setText(String.format(getString(R.string.txtQ1), detailPerson.getQ1()));
                dateQ1.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ1() + " [✓]"));
            }

            if (detailPerson.getQ2() == null) {
                q2.setText("2. นัดหมายการตรวจร่างกายก่อนเข้ารับการผ่าตัดและปรึกษาเรื่องค่าใช้จ่ายในการผ่าตัดซึ่งขึ้นอยู่กับชนิดข้อที่ใช้และหอผู้ป่วย" + " [X]");
                dateQ2.setVisibility(View.GONE);
            } else {
                q2.setText(String.format(getString(R.string.txtQ2), detailPerson.getQ2()));
                dateQ2.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ2() + " [✓]"));
            }

            if (detailPerson.getQ3() == null) {
                q3.setText("3. จองห้องนอนโรงพยาบาล" + " [X]");
                dateQ3.setVisibility(View.GONE);
            } else {
                q3.setText(String.format(getString(R.string.txtQ3), detailPerson.getQ3()));
                dateQ3.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ3()+ " [✓]"));
            }

            if (detailPerson.getQ4() == null) {
                q4.setText("4. รับใบนัดและรับยา" + " [X]");
            } else {
                q4.setText(String.format(getString(R.string.txtQ4), detailPerson.getQ4() + " [✓]"));
            }

            if (detailPerson.getQ5() == null) {
                q5.setText("5. ตรวจเลือด-ปัสสาวะ (คลินิคอายุรกรรม)" + " [X]");
            } else {
                q5.setText(String.format(getString(R.string.txtQ5), detailPerson.getQ5() + " [✓]"));
            }

            if (detailPerson.getQ6() == null) {
                q6.setText("6. ตรวจโรคประจำตัว เช่น ความดันโลหิต เบาหวาน เป็นต้น (คลินิคอายุรกรรม)" + " [X]");
            } else {
                q6.setText(String.format(getString(R.string.txtQ6), detailPerson.getQ6() + " [✓]"));
            }

            if (detailPerson.getQ7() == null) {
                q7.setText("7. เอกซเรย์ปอดและข้อเข่า" + " [X]");
            } else {
                q7.setText(String.format(getString(R.string.txtQ7), detailPerson.getQ7() + " [✓]"));
            }

            if (detailPerson.getQ8() == null) {
                q8.setText("8. ตรวจคลื่นไฟฟ้าหัวใจ" + " [X]");
            } else {
                q8.setText(String.format(getString(R.string.txtQ8), detailPerson.getQ8() + " [✓]"));
            }

            Button editHistory2 = (Button) rootView.findViewById(R.id.edit_detailPersonal);
            editHistory2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), EditDetailPatient.class);
                    startActivity(intent);
                }
            });

        }
        return rootView;
    }
}
