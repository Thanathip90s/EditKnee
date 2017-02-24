package com.example.administrator.editknee.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.administrator.editknee.R;
/**
 * Created by Administrator on 08-Feb-17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView dateTxt,timeTxt;

    public MyViewHolder(View itemView) {
        super(itemView);
        dateTxt= (TextView) itemView.findViewById(R.id.dateTxt1);
        timeTxt= (TextView) itemView.findViewById(R.id.timeTxt1);
    }
}
