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
        weight.setText(String.format(getString(R.string.txtWeight), person.getWeight() + " กก."));
        height.setText(String.format(getString(R.string.txtHeight), person.getHeight() + " ซม."));

        TextView Bmi = (TextView) rootView.findViewById(R.id.txt_BMI);
        double intBmi, Change;
        String BMI;
        double int1 = Integer.parseInt(person.getWeight());
        double int2 = Integer.parseInt(person.getHeight());
        Change = int2 / 100;
        intBmi = int1 / (Change * Change);
        BMI = String.valueOf(intBmi);
        //Bmi.setText(BMI);
        if (intBmi < 18.5) {
            Bmi.setText("ค่า BMI : ผอม");
        }
        if (intBmi >= 18.5 && intBmi < 23) {
            Bmi.setText("ค่า BMI : ปกติ");
        }
        if (intBmi >= 23.0 && intBmi < 25) {
            Bmi.setText("ค่า BMI : ท้วม");
        }
        if (intBmi >= 25.0 && intBmi < 30) {
            Bmi.setText("ค่า BMI : อ้วนปานกลาง");
        }
        if (intBmi >= 30.0) {
            Bmi.setText("ค่า BMI : อ้วนมาก");
        }

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
        TextView dateQ4 = (TextView) rootView.findViewById(R.id.date_Q4);
        TextView q5 = (TextView) rootView.findViewById(R.id.txt_Q5);
        TextView dateQ5 = (TextView) rootView.findViewById(R.id.date_Q5);
        TextView q6 = (TextView) rootView.findViewById(R.id.txt_Q6);
        TextView dateQ6 = (TextView) rootView.findViewById(R.id.date_Q6);
        TextView q7 = (TextView) rootView.findViewById(R.id.txt_Q7);
        TextView dateQ7 = (TextView) rootView.findViewById(R.id.date_Q7);
        TextView q8 = (TextView) rootView.findViewById(R.id.txt_Q8);
        TextView dateQ8 = (TextView) rootView.findViewById(R.id.date_Q8);
        TextView q9 = (TextView) rootView.findViewById(R.id.txt_Q9);
        TextView dateQ9 = (TextView) rootView.findViewById(R.id.date_Q9);
        TextView q10 = (TextView) rootView.findViewById(R.id.txt_Q10);
        TextView dateQ10 = (TextView) rootView.findViewById(R.id.date_Q10);
        TextView q11 = (TextView) rootView.findViewById(R.id.txt_Q11);
        TextView dateQ11 = (TextView) rootView.findViewById(R.id.date_Q11);


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
            dateQ4.setVisibility(View.GONE);
            q5.setVisibility(View.GONE);
            dateQ5.setVisibility(View.GONE);
            q6.setVisibility(View.GONE);
            dateQ6.setVisibility(View.GONE);
            q7.setVisibility(View.GONE);
            dateQ7.setVisibility(View.GONE);
            q8.setVisibility(View.GONE);
            dateQ8.setVisibility(View.GONE);
            q9.setVisibility(View.GONE);
            dateQ9.setVisibility(View.GONE);
            q10.setVisibility(View.GONE);
            dateQ10.setVisibility(View.GONE);
            q11.setVisibility(View.GONE);
            dateQ11.setVisibility(View.GONE);
        } else {
            if (detailPerson.getQ1() == null) {
                q1.setText("จองคิวนัดวันผ่า" + " [X]");
                dateQ1.setVisibility(View.GONE);
            } else {
                q1.setText(String.format(getString(R.string.txtQ1), detailPerson.getQ1()));
                dateQ1.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ1() + " [✓]"));
            }

            if (detailPerson.getQ2() == null) {
                q2.setText("ครั้งที่ 1 : ตรวจเลือด-ปัสสาวะ (ห้องเจาะเลือด ตึกพยาธิวิทยาชั้น 3)" + " [X]");
                dateQ2.setVisibility(View.GONE);
            } else {
                q2.setText(String.format(getString(R.string.txtQ2), detailPerson.getQ2()));
                dateQ2.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ2() + " [✓]"));
            }

            if (detailPerson.getQ3() == null) {
                q3.setText("ครั้งที่ 1 : ตรวจโรคประจำตัว (คลินิกอายุรกรรมทั่วไป คลินิกเบาหวาน คลินิกหัวใจ)" + " [X]");
                dateQ3.setVisibility(View.GONE);
            } else {
                q3.setText(String.format(getString(R.string.txtQ3), detailPerson.getQ3()));
                dateQ3.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ3() + " [✓]"));
            }

            if (detailPerson.getQ4() == null) {
                q4.setText("ครั้งที่ 1 : ตรวจคลื่นไฟฟ้าหัวใจ (คลินิกหัวใจ ตึกเพชรรัตน์ชั้น 2)" + " [X]");
                dateQ4.setVisibility(View.GONE);
            } else {
                q4.setText(String.format(getString(R.string.txtQ4), detailPerson.getQ4() + " [✓]"));
                dateQ4.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ4() + " [✓]"));
            }

            if (detailPerson.getQ5() == null) {
                q5.setText("ครั้งที่ 1 : เอกซเรย์ปอดเเละข้อเข่า (ห้องเอกซเรย์ ตึกมหาวชิราวุธชั้น 1)" + " [X]");
                dateQ5.setVisibility(View.GONE);
            } else {
                q5.setText(String.format(getString(R.string.txtQ5), detailPerson.getQ5() + " [✓]"));
                dateQ5.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ5() + " [✓]"));
            }

            if (detailPerson.getQ6() == null) {
                q6.setText("ครั้งที่ 2 : ติดตามผลการตรวจร่างกาย (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ6.setVisibility(View.GONE);
            } else {
                q6.setText(String.format(getString(R.string.txtQ6), detailPerson.getQ6() + " [✓]"));
                dateQ6.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ6() + " [✓]"));
            }

            if (detailPerson.getQ7() == null) {
                q7.setText("ครั้งที่ 3 : เข้านอนโรงพยาบาล (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ7.setVisibility(View.GONE);
            } else {
                q7.setText(String.format(getString(R.string.txtQ7), detailPerson.getQ7() + " [✓]"));
                dateQ7.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ7() + " [✓]"));
            }

            if (detailPerson.getQ8() == null) {
                q8.setText("ครั้งที่ 4 : ความเรียบร้อยของแผลผ่าตัด (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ8.setVisibility(View.GONE);
            } else {
                q8.setText(String.format(getString(R.string.txtQ8), detailPerson.getQ8() + " [✓]"));
                dateQ8.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ8() + " [✓]"));
            }
            if (detailPerson.getQ9() == null) {
                q9.setText("ครั้งที่ 5 : ประเมินองศาและการใช้งานข้อเข่า (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ9.setVisibility(View.GONE);
            } else {
                q9.setText(String.format(getString(R.string.txtQ9), detailPerson.getQ9() + " [✓]"));
                dateQ9.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ9() + " [✓]"));
            }
            if (detailPerson.getQ10() == null) {
                q10.setText("ครั้งที่ 6 : ประเมินองศาและการใช้งานข้อเข่า (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ10.setVisibility(View.GONE);
            } else {
                q10.setText(String.format(getString(R.string.txtQ10), detailPerson.getQ10() + " [✓]"));
                dateQ10.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ10() + " [✓]"));
            }
            if (detailPerson.getQ11() == null) {
                q11.setText("ครั้งที่ 7 : ประเมินองศาและการใช้งานข้อเข่า (คลินิกออร์โธปิดิกส์)" + " [X]");
                dateQ11.setVisibility(View.GONE);
            } else {
                q11.setText(String.format(getString(R.string.txtQ11), detailPerson.getQ11() + " [✓]"));
                dateQ11.setText(String.format(getString(R.string.txtdateQ1), detailPerson.getDateQ11() + " [✓]"));
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
