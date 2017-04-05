package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.editknee.AdapterPhase.Phase5Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase6Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;

public class HistoryFirstPhase6 extends AppCompatActivity {
    public static final int REQUEST_UPDATE6 = 99;
    private Phase6Adapter mPhase6Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประวัติระยะที่ 6");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase6Adapter = new Phase6Adapter(this, DatabaseManager.getInstance(this).getPhase6());

        recyclerView.setAdapter(mPhase6Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE6) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase6Adapter.setPhase6(DatabaseManager.getInstance(this).getPhase6());
        mPhase6Adapter.notifyDataSetChanged();
    }
}


