package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase6ViewHolder extends RecyclerView.ViewHolder {
    public TextView s6;
    public TextView dateTextView6;
    public TextView timeTextView6;
    public TextView step6_1TextView;
    public TextView note6_1TextView;
    public TextView step6_2TextView;
    public TextView note6_2TextView;
    public TextView step6_3TextView;
    public TextView note6_3TextView;
    public TextView step6_4TextView;
    public TextView note6_4TextView;
    public TextView step6_5TextView;
    public TextView note6_5TextView;
    public TextView step6_6TextView;
    public TextView note6_6TextView;

    public Phase6ViewHolder(View itemView) {
        super(itemView);
        s6 = (TextView) itemView.findViewById(R.id.adapter_tv_name6);
        dateTextView6 = (TextView) itemView.findViewById(R.id.dateTxt6);
        timeTextView6 = (TextView) itemView.findViewById(R.id.timeTxt6);
        step6_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_1);
        note6_1TextView = (TextView) itemView.findViewById(R.id.noteTxt6_1);
        step6_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_2);
        note6_2TextView = (TextView) itemView.findViewById(R.id.noteTxt6_2);
        step6_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_3);
        note6_3TextView = (TextView) itemView.findViewById(R.id.noteTxt6_3);
        step6_4TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_4);
        note6_4TextView = (TextView) itemView.findViewById(R.id.noteTxt6_4);
        step6_5TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_5);
        note6_5TextView = (TextView) itemView.findViewById(R.id.noteTxt6_5);
        step6_6TextView  = (TextView) itemView.findViewById(R.id.stepTxt6_6);
        note6_6TextView = (TextView) itemView.findViewById(R.id.noteTxt6_6);
    }
}
