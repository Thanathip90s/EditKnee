package com.example.administrator.editknee.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.administrator.editknee.R;
/**
 * Created by Administrator on 08-Feb-17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView dateTxt,timeTxt,stepTxt1,noteTxt1,stepTxt2,noteTxt2,stepTxt3,noteTxt3;

    public MyViewHolder(View itemView) {
        super(itemView);
        dateTxt = (TextView) itemView.findViewById(R.id.dateTxt1);
        timeTxt = (TextView) itemView.findViewById(R.id.timeTxt1);
        stepTxt1 = (TextView) itemView.findViewById(R.id.stepTxt1);
        noteTxt1 = (TextView) itemView.findViewById(R.id.noteTxt1);
        stepTxt2 = (TextView) itemView.findViewById(R.id.stepTxt2);
        noteTxt2 = (TextView) itemView.findViewById(R.id.noteTxt2);
        stepTxt3 = (TextView) itemView.findViewById(R.id.stepTxt3);
        noteTxt3 = (TextView) itemView.findViewById(R.id.noteTxt3);
    }
}
