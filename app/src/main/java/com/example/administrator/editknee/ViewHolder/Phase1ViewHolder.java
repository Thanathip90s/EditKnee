package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase1ViewHolder extends RecyclerView.ViewHolder {
    public TextView s;
    public TextView dateTextView;
    public TextView timeTextView;
    public TextView step1_1TextView;
    public TextView note1_1TextView;
    public TextView step1_2TextView;
    public TextView note1_2TextView;
    public TextView step1_3TextView;
    public TextView note1_3TextView;

    public Phase1ViewHolder(View itemView) {
        super(itemView);
        s = (TextView) itemView.findViewById(R.id.adapter_tv_name);
        dateTextView = (TextView) itemView.findViewById(R.id.dateTxt1);
        timeTextView = (TextView) itemView.findViewById(R.id.timeTxt1);
        step1_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt1);
        note1_1TextView = (TextView) itemView.findViewById(R.id.noteTxt1);
        step1_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt2);
        note1_2TextView = (TextView) itemView.findViewById(R.id.noteTxt2);
        step1_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt3);
        note1_3TextView = (TextView) itemView.findViewById(R.id.noteTxt3);
    }
}
