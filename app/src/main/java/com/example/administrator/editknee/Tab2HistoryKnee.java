package com.example.administrator.editknee;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase1;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase4;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase5;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase6;
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_historyknee, container, false);
        //getActivity().setTitle("ประวัติบริหารเข่า");
        //getActivity().getActionBar().setTitle("ประวัติบริหารเข่า");

        Button p1 = (Button) rootView.findViewById(R.id.btn_HistoryPhase1);
        p1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase1.class);
                startActivity(intent);
            }
        });

        Button p2 = (Button) rootView.findViewById(R.id.btn_HistoryPhase2);
        p2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase2.class);
                startActivity(intent);
            }
        });

        Button p3 = (Button) rootView.findViewById(R.id.btn_HistoryPhase3);
        p3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase3.class);
                startActivity(intent);
            }
        });

        Button p4 = (Button) rootView.findViewById(R.id.btn_HistoryPhase4);
        p4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase4.class);
                startActivity(intent);
            }
        });

        Button p5 = (Button) rootView.findViewById(R.id.btn_HistoryPhase5);
        p5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase5.class);
                startActivity(intent);
            }
        });

        Button p6 = (Button) rootView.findViewById(R.id.btn_HistoryPhase6);
        p6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryFirstPhase6.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
