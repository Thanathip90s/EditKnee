package com.example.administrator.editknee.FirstPhase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.administrator.editknee.AdapterPhase.Phase1Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.pagePhase1.Phase1;

public class FirstPhase1 extends AppCompatActivity {

    public static final int REQUEST_UPDATE = 99;
    private Phase1Adapter mPhase1Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_phase1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ระยะที่ 1");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mPhase1Adapter = new Phase1Adapter(this, DatabaseManager.getInstance(this).getPhase1());

        recyclerView.setAdapter(mPhase1Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_phase1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.add1:
                startFormActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startFormActivity() {
        Intent intent = new Intent(this, Phase1.class);
        startActivityForResult(intent, REQUEST_UPDATE);
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
