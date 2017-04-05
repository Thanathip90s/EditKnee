package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.editknee.AdapterPhase.Phase2Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase3Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;

public class HistoryFirstPhase3 extends AppCompatActivity {
    public static final int REQUEST_UPDATE3 = 99;
    private Phase3Adapter mPhase3Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประวัติระยะที่ 3");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase3Adapter = new Phase3Adapter(this, DatabaseManager.getInstance(this).getPhase3());

        recyclerView.setAdapter(mPhase3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE3) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase3Adapter.setPhase3(DatabaseManager.getInstance(this).getPhase3());
        mPhase3Adapter.notifyDataSetChanged();
    }
}
