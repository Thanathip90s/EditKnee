package com.example.administrator.editknee;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.view.View.OnClickListener;

import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase2.Phase2;
import com.example.administrator.editknee.pagePhase3.Phase3;
import com.example.administrator.editknee.pagePhase4.Phase4;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase6.Phase6;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class  Tab1SaveKnee extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_saveknee, container, false);

        Button p1 = (Button) rootView.findViewById(R.id.btn_phase1);
        p1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase1.class);
                startActivity(intent);
            }
        });

        Button p2 = (Button) rootView.findViewById(R.id.btn_phase2);
        p2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase2.class);
                startActivity(intent);
            }
        });

        Button p3 = (Button) rootView.findViewById(R.id.btn_phase3);
        p3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase3.class);
                startActivity(intent);
            }
        });

        Button p4 = (Button) rootView.findViewById(R.id.btn_phase4);
        p4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase4.class);
                startActivity(intent);
            }
        });

        Button p5 = (Button) rootView.findViewById(R.id.btn_phase5);
        p5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase5.class);
                startActivity(intent);
            }
        });

        Button p6 = (Button) rootView.findViewById(R.id.btn_phase6);
        p6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phase6.class);
                startActivity(intent);
            }
        });

        return rootView;

    }
}
