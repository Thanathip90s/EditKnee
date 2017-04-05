package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase4ViewHolder extends RecyclerView.ViewHolder {
    public TextView s4;
    public TextView dateTextView4;
    public TextView timeTextView4;
    public TextView step4_1TextView;
    public TextView note4_1TextView;
    public TextView step4_2TextView;
    public TextView note4_2TextView;
    public TextView step4_3TextView;
    public TextView note4_3TextView;
    public TextView step4_4TextView;
    public TextView note4_4TextView;
    public TextView step4_5TextView;
    public TextView note4_5TextView;
    public TextView step4_6TextView;
    public TextView note4_6TextView;

    public Phase4ViewHolder(View itemView) {
        super(itemView);
        s4 = (TextView) itemView.findViewById(R.id.adapter_tv_name4);
        dateTextView4 = (TextView) itemView.findViewById(R.id.dateTxt4);
        timeTextView4 = (TextView) itemView.findViewById(R.id.timeTxt4);
        step4_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_1);
        note4_1TextView = (TextView) itemView.findViewById(R.id.noteTxt4_1);
        step4_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_2);
        note4_2TextView = (TextView) itemView.findViewById(R.id.noteTxt4_2);
        step4_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_3);
        note4_3TextView = (TextView) itemView.findViewById(R.id.noteTxt4_3);
        step4_4TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_4);
        note4_4TextView = (TextView) itemView.findViewById(R.id.noteTxt4_4);
        step4_5TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_5);
        note4_5TextView = (TextView) itemView.findViewById(R.id.noteTxt4_5);
        step4_6TextView  = (TextView) itemView.findViewById(R.id.stepTxt4_6);
        note4_6TextView = (TextView) itemView.findViewById(R.id.noteTxt4_6);
    }
}
