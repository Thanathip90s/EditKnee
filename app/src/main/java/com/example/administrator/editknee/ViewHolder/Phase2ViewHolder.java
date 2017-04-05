package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase2ViewHolder extends RecyclerView.ViewHolder {
    public TextView s2;
    public TextView dateTextView2;
    public TextView timeTextView2;
    public TextView step2_1TextView;
    public TextView note2_1TextView;
    public TextView step2_2TextView;
    public TextView note2_2TextView;
    public TextView step2_3TextView;
    public TextView note2_3TextView;
    public TextView step2_4TextView;
    public TextView note2_4TextView;
    public TextView step2_5TextView;
    public TextView note2_5TextView;

    public Phase2ViewHolder(View itemView) {
        super(itemView);
        s2 = (TextView) itemView.findViewById(R.id.adapter_tv_name2);
        dateTextView2 = (TextView) itemView.findViewById(R.id.dateTxt2);
        timeTextView2 = (TextView) itemView.findViewById(R.id.timeTxt2);
        step2_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt2_1);
        note2_1TextView = (TextView) itemView.findViewById(R.id.noteTxt2_1);
        step2_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt2_2);
        note2_2TextView = (TextView) itemView.findViewById(R.id.noteTxt2_2);
        step2_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt2_3);
        note2_3TextView = (TextView) itemView.findViewById(R.id.noteTxt2_3);
        step2_4TextView  = (TextView) itemView.findViewById(R.id.stepTxt2_4);
        note2_4TextView = (TextView) itemView.findViewById(R.id.noteTxt2_4);
        step2_5TextView  = (TextView) itemView.findViewById(R.id.stepTxt2_5);
        note2_5TextView = (TextView) itemView.findViewById(R.id.noteTxt2_5);
    }
}
