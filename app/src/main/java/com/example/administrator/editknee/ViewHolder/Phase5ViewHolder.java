package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase5ViewHolder extends RecyclerView.ViewHolder {
    public TextView s5;
    public TextView dateTextView5;
    public TextView timeTextView5;
    public TextView step5_1TextView;
    public TextView note5_1TextView;
    public TextView step5_2TextView;
    public TextView note5_2TextView;
    public TextView step5_3TextView;
    public TextView note5_3TextView;
    public TextView step5_4TextView;
    public TextView note5_4TextView;
    public TextView step5_5TextView;
    public TextView note5_5TextView;
    public TextView step5_6TextView;
    public TextView note5_6TextView;

    public Phase5ViewHolder(View itemView) {
        super(itemView);
        s5 = (TextView) itemView.findViewById(R.id.adapter_tv_name5);
        dateTextView5 = (TextView) itemView.findViewById(R.id.dateTxt5);
        timeTextView5 = (TextView) itemView.findViewById(R.id.timeTxt5);
        step5_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_1);
        note5_1TextView = (TextView) itemView.findViewById(R.id.noteTxt5_1);
        step5_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_2);
        note5_2TextView = (TextView) itemView.findViewById(R.id.noteTxt5_2);
        step5_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_3);
        note5_3TextView = (TextView) itemView.findViewById(R.id.noteTxt5_3);
        step5_4TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_4);
        note5_4TextView = (TextView) itemView.findViewById(R.id.noteTxt5_4);
        step5_5TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_5);
        note5_5TextView = (TextView) itemView.findViewById(R.id.noteTxt5_5);
        step5_6TextView  = (TextView) itemView.findViewById(R.id.stepTxt5_6);
        note5_6TextView = (TextView) itemView.findViewById(R.id.noteTxt5_6);
    }
}
