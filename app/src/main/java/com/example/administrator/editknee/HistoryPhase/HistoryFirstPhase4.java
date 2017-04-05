package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.editknee.AdapterPhase.Phase3Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase4Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;

public class HistoryFirstPhase4 extends AppCompatActivity {
    public static final int REQUEST_UPDATE4 = 99;
    private Phase4Adapter mPhase4Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประวัติระยะที่ 4");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase4Adapter = new Phase4Adapter(this, DatabaseManager.getInstance(this).getPhase4());

        recyclerView.setAdapter(mPhase4Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE4) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase4Adapter.setPhase4(DatabaseManager.getInstance(this).getPhase4());
        mPhase4Adapter.notifyDataSetChanged();
    }
}

