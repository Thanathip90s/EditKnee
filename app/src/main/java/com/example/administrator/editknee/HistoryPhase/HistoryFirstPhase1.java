package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.editknee.AdapterPhase.Phase1Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;

public class HistoryFirstPhase1 extends AppCompatActivity {

    public static final int REQUEST_UPDATE = 99;
    private Phase1Adapter mPhase1Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประวัติระยะที่ 1");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase1Adapter = new Phase1Adapter(this, DatabaseManager.getInstance(this).getPhase1());

        recyclerView.setAdapter(mPhase1Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase1Adapter.setPhase1(DatabaseManager.getInstance(this).getPhase1());
        mPhase1Adapter.notifyDataSetChanged();
    }
}
