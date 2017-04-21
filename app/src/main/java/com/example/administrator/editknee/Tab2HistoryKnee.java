package com.example.administrator.editknee;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.editknee.AdapterPhase.Phase1Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase2Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase3Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase4Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase5Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase6Adapter;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase1;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase4;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase5;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase6;
import com.example.administrator.editknee.pagePerson.EditDetailPatient;
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
    private Phase2Adapter mPhase2Adapter;
    private Phase3Adapter mPhase3Adapter;
    private Phase4Adapter mPhase4Adapter;
    private Phase5Adapter mPhase5Adapter;
    private Phase6Adapter mPhase6Adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_historyknee, container, false);

        final RecyclerView rc1 = (RecyclerView) rootView.findViewById(R.id.recycle_view);
        rc1.setVisibility(View.GONE);

        final RecyclerView rc2 = (RecyclerView) rootView.findViewById(R.id.recycle_view2);
        rc2.setVisibility(View.GONE);

        final RecyclerView rc3 = (RecyclerView) rootView.findViewById(R.id.recycle_view3);
        rc3.setVisibility(View.GONE);

        final RecyclerView rc4 = (RecyclerView) rootView.findViewById(R.id.recycle_view4);
        rc4.setVisibility(View.GONE);

        final RecyclerView rc5 = (RecyclerView) rootView.findViewById(R.id.recycle_view5);
        rc5.setVisibility(View.GONE);

        final RecyclerView rc6 = (RecyclerView) rootView.findViewById(R.id.recycle_view6);
        rc6.setVisibility(View.GONE);

        final Button p1 = (Button) rootView.findViewById(R.id.btn_HistoryPhase1);
        final Button pe1 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase1);
        final Button graph1 = (Button)rootView.findViewById(R.id.btn_Graph1);
        final TextView TextPe1 = (TextView) rootView.findViewById(R.id.closeRecycler1);
        pe1.setVisibility(View.GONE);
        TextPe1.setVisibility(View.GONE);
        p1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.isClickable()) {
                    rc1.setVisibility(View.VISIBLE);
                    pe1.setVisibility(View.VISIBLE);
                    TextPe1.setVisibility(View.VISIBLE);
                }
            }
        });

        pe1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe1.isClickable()) {
                    rc1.setVisibility(View.GONE);
                    pe1.setVisibility(View.GONE);
                    TextPe1.setVisibility(View.GONE);
                }
            }
        });

        graph1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase1.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_view);
        mPhase1Adapter = new Phase1Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase1());

        recyclerView.setAdapter(mPhase1Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        final Button p2 = (Button) rootView.findViewById(R.id.btn_HistoryPhase2);
        final Button pe2 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase2);
        final Button graph2 = (Button)rootView.findViewById(R.id.btn_Graph2);
        final TextView TextPe2 = (TextView) rootView.findViewById(R.id.closeRecycler2);
        pe2.setVisibility(View.GONE);
        TextPe2.setVisibility(View.GONE);
        p2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p2.isClickable()) {
                    rc2.setVisibility(View.VISIBLE);
                    pe2.setVisibility(View.VISIBLE);
                    TextPe2.setVisibility(View.VISIBLE);
                }
            }
        });

        pe2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe2.isClickable()) {
                    rc2.setVisibility(View.GONE);
                    pe2.setVisibility(View.GONE);
                    TextPe2.setVisibility(View.GONE);
                }
            }
        });

        graph2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase2.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recycle_view2);
        mPhase2Adapter = new Phase2Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase2());

        recyclerView2.setAdapter(mPhase2Adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        final Button p3 = (Button) rootView.findViewById(R.id.btn_HistoryPhase3);
        final Button pe3 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase3);
        final Button graph3 = (Button)rootView.findViewById(R.id.btn_Graph3);
        final TextView TextPe3 = (TextView) rootView.findViewById(R.id.closeRecycler3);
        pe3.setVisibility(View.GONE);
        TextPe3.setVisibility(View.GONE);
        p3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p3.isClickable()) {
                    rc3.setVisibility(View.VISIBLE);
                    pe3.setVisibility(View.VISIBLE);
                    TextPe3.setVisibility(View.VISIBLE);
                }
            }
        });

        pe3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe3.isClickable()) {
                    rc3.setVisibility(View.GONE);
                    pe3.setVisibility(View.GONE);
                    TextPe3.setVisibility(View.GONE);
                }
            }
        });

        graph3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase3.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView3 = (RecyclerView) rootView.findViewById(R.id.recycle_view3);
        mPhase3Adapter = new Phase3Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase3());

        recyclerView3.setAdapter(mPhase3Adapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));

        final Button p4 = (Button) rootView.findViewById(R.id.btn_HistoryPhase4);
        final Button pe4 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase4);
        final Button graph4 = (Button)rootView.findViewById(R.id.btn_Graph4);
        final TextView TextPe4 = (TextView) rootView.findViewById(R.id.closeRecycler4);
        pe4.setVisibility(View.GONE);
        TextPe4.setVisibility(View.GONE);
        p4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p4.isClickable()) {
                    rc4.setVisibility(View.VISIBLE);
                    pe4.setVisibility(View.VISIBLE);
                    TextPe4.setVisibility(View.VISIBLE);
                }
            }
        });

        pe4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe4.isClickable()) {
                    rc4.setVisibility(View.GONE);
                    pe4.setVisibility(View.GONE);
                    TextPe4.setVisibility(View.GONE);
                }
            }
        });

        graph4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase4.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView4 = (RecyclerView) rootView.findViewById(R.id.recycle_view4);
        mPhase4Adapter = new Phase4Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase4());

        recyclerView4.setAdapter(mPhase4Adapter);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity()));

        final Button p5 = (Button) rootView.findViewById(R.id.btn_HistoryPhase5);
        final Button pe5 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase5);
        final Button graph5 = (Button)rootView.findViewById(R.id.btn_Graph5);
        final TextView TextPe5 = (TextView) rootView.findViewById(R.id.closeRecycler5);
        pe5.setVisibility(View.GONE);
        TextPe5.setVisibility(View.GONE);
        p5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p5.isClickable()) {
                    rc5.setVisibility(View.VISIBLE);
                    pe5.setVisibility(View.VISIBLE);
                    TextPe5.setVisibility(View.VISIBLE);
                }
            }
        });

        pe5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe5.isClickable()) {
                    rc5.setVisibility(View.GONE);
                    pe5.setVisibility(View.GONE);
                    TextPe5.setVisibility(View.GONE);
                }
            }
        });

        graph5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase5.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView5 = (RecyclerView) rootView.findViewById(R.id.recycle_view5);
        mPhase5Adapter = new Phase5Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase5());

        recyclerView5.setAdapter(mPhase5Adapter);
        recyclerView5.setLayoutManager(new LinearLayoutManager(getActivity()));

        final Button p6 = (Button) rootView.findViewById(R.id.btn_HistoryPhase6);
        final Button pe6 = (Button) rootView.findViewById(R.id.btn_CloseHistoryPhase6);
        final Button graph6 = (Button)rootView.findViewById(R.id.btn_Graph6);
        final TextView TextPe6 = (TextView) rootView.findViewById(R.id.closeRecycler6);
        pe6.setVisibility(View.GONE);
        TextPe6.setVisibility(View.GONE);
        p6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p6.isClickable()) {
                    rc6.setVisibility(View.VISIBLE);
                    pe6.setVisibility(View.VISIBLE);
                    TextPe6.setVisibility(View.VISIBLE);
                }
            }
        });

        pe6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe6.isClickable()) {
                    rc6.setVisibility(View.GONE);
                    pe6.setVisibility(View.GONE);
                    TextPe6.setVisibility(View.GONE);
                }
            }
        });

        graph6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase6.class);
                startActivity(intent);
            }
        });

        // Setup recycler view
        RecyclerView recyclerView6 = (RecyclerView) rootView.findViewById(R.id.recycle_view6);
        mPhase6Adapter = new Phase6Adapter(getActivity(), DatabaseManager.getInstance(getActivity()).getPhase6());

        recyclerView6.setAdapter(mPhase6Adapter);
        recyclerView6.setLayoutManager(new LinearLayoutManager(getActivity()));

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
        mPhase2Adapter.setPhase2(DatabaseManager.getInstance(getActivity()).getPhase2());
        mPhase3Adapter.setPhase3(DatabaseManager.getInstance(getActivity()).getPhase3());
        mPhase4Adapter.setPhase4(DatabaseManager.getInstance(getActivity()).getPhase4());
        mPhase5Adapter.setPhase5(DatabaseManager.getInstance(getActivity()).getPhase5());
        mPhase6Adapter.setPhase6(DatabaseManager.getInstance(getActivity()).getPhase6());
        mPhase1Adapter.notifyDataSetChanged();
        mPhase2Adapter.notifyDataSetChanged();
        mPhase3Adapter.notifyDataSetChanged();
        mPhase4Adapter.notifyDataSetChanged();
        mPhase5Adapter.notifyDataSetChanged();
        mPhase6Adapter.notifyDataSetChanged();
    }
}
