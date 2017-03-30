package com.example.administrator.editknee;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.administrator.editknee.AdapterPhase.Phase1Adapter;
import com.example.administrator.editknee.FirstPhase.FirstPhase1;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase2.Phase2;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.pagePhase4.Phase4;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase6.Phase6;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class Tab2HistoryKnee extends Fragment {
    public static final int REQUEST_UPDATE = 99;
    private Phase1Adapter mPhase1Adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_historyknee, container, false);
        //getActivity().setTitle("ประวัติบริหารเข่า");
        //getActivity().getActionBar().setTitle("ประวัติบริหารเข่า");

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_view);
        mPhase1Adapter = new Phase1Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase1());

        recyclerView.setAdapter(mPhase1Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_UPDATE) {
            updateListView();
        }
    }

    private void updateListView() {
        mPhase1Adapter.setPhase1(DatabaseManager.getInstance(getActivity()).getPhase1());
        mPhase1Adapter.notifyDataSetChanged();
    }

}
