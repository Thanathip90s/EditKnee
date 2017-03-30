package com.example.administrator.editknee;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class Tab3Knowledge extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_knowledge, container, false);
        //getActivity().setTitle("ความรู้ข้อเข่าเสื่อม");
        //getActivity().getActionBar().setTitle("ความรู้ข้อเข่าเสื่อม");

        return rootView;
    }
}
