package com.example.administrator.editknee.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.editknee.R;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase3ViewHolder extends RecyclerView.ViewHolder {
    public TextView s3;
    public TextView dateTextView3;
    public TextView timeTextView3;
    public TextView step3_1TextView;
    public TextView note3_1TextView;
    public TextView step3_2TextView;
    public TextView note3_2TextView;
    public TextView step3_3TextView;
    public TextView note3_3TextView;
    public TextView step3_4TextView;
    public TextView note3_4TextView;
    public TextView step3_5TextView;
    public TextView note3_5TextView;

    public Phase3ViewHolder(View itemView) {
        super(itemView);
        s3 = (TextView) itemView.findViewById(R.id.adapter_tv_name3);
        dateTextView3 = (TextView) itemView.findViewById(R.id.dateTxt3);
        timeTextView3 = (TextView) itemView.findViewById(R.id.timeTxt3);
        step3_1TextView  = (TextView) itemView.findViewById(R.id.stepTxt3_1);
        note3_1TextView = (TextView) itemView.findViewById(R.id.noteTxt3_1);
        step3_2TextView  = (TextView) itemView.findViewById(R.id.stepTxt3_2);
        note3_2TextView = (TextView) itemView.findViewById(R.id.noteTxt3_2);
        step3_3TextView  = (TextView) itemView.findViewById(R.id.stepTxt3_3);
        note3_3TextView = (TextView) itemView.findViewById(R.id.noteTxt3_3);
        step3_4TextView  = (TextView) itemView.findViewById(R.id.stepTxt3_4);
        note3_4TextView = (TextView) itemView.findViewById(R.id.noteTxt3_4);
        step3_5TextView  = (TextView) itemView.findViewById(R.id.stepTxt3_5);
        note3_5TextView = (TextView) itemView.findViewById(R.id.noteTxt3_5);
    }
}
