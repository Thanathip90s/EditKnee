package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.editknee.AdapterPhase.Phase4Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase5Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;

public class HistoryFirstPhase5 extends AppCompatActivity {
    public static final int REQUEST_UPDATE5 = 99;
    private Phase5Adapter mPhase5Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประวัติระยะที่ 5");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase5Adapter = new Phase5Adapter(this, DatabaseManager.getInstance(this).getPhase5());

        recyclerView.setAdapter(mPhase5Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE5) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase5Adapter.setPhase5(DatabaseManager.getInstance(this).getPhase5());
        mPhase5Adapter.notifyDataSetChanged();
    }
}


