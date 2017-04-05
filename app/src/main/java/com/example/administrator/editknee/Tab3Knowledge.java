package com.example.administrator.editknee;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase1;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class Tab3Knowledge extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_knowledge, container, false);

        final Button k1 = (Button) rootView.findViewById(R.id.btn_knowledge1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k1.setTextColor(Color.RED);
                Intent intent = new Intent(getActivity(), knowledgeActivity1.class);
                startActivity(intent);
            }
        });

        final Button k2 = (Button) rootView.findViewById(R.id.btn_knowledge2);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k2.setTextColor(Color.RED);
                Intent intent = new Intent(getActivity(), knowledgeActivity2.class);
                startActivity(intent);
            }
        });

        final Button k3 = (Button) rootView.findViewById(R.id.btn_knowledge3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k3.setTextColor(Color.RED);
                Intent intent = new Intent(getActivity(), knowledgeActivity3.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
