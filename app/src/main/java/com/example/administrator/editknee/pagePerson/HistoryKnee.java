package com.example.administrator.editknee.pagePerson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.administrator.editknee.DBPhase1;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.m_Realm.RealmHelper;
import com.example.administrator.editknee.m_UI.MyAdapter;
import com.example.administrator.editknee.pagePhase1.Phase1;

import io.realm.Realm;
import io.realm.RealmChangeListener;

public class HistoryKnee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_knee);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* DatabaseManager databaseManager = new DatabaseManager(this);
        DBPhase1 dbPhase1 = databaseManager.getDBPhase1();

        date1.setText(String.format("วันที่ : %s ",dbPhase1.getDate1()));
        time1.setText(String.format("เวลา : %s ",dbPhase1.getTime1()));
        step1.setText(String.format("ท่าที่ 1 กระ-ดก-เท้า จำนวน : %s ",dbPhase1.getTxtStep1()));
        note1.setText(String.format("หมายเหตุท่าที่ 1 : %s ",dbPhase1.getTxtNote1()));
        step2.setText(String.format("ท่า 2 หงาย-ชิด-ก้น จำนวน : %s ",dbPhase1.getTxtStep2()));
        note2.setText(String.format("หมายเหตุท่าที่ 2 : %s ",dbPhase1.getTxtNote2()));
        step3.setText(String.format("ท่า 3 ก้ม-แตะ-เท้า จำนวน : %s ",dbPhase1.getTxtStep3()));
        note3.setText(String.format("หมายเหตุท่าที่ 3 : %s ",dbPhase1.getTxtNote3()));*/

    }
}
