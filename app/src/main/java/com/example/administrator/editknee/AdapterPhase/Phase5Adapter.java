package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase4;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase5;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.ViewHolder.Phase4ViewHolder;
import com.example.administrator.editknee.ViewHolder.Phase5ViewHolder;
import com.example.administrator.editknee.pagePhase4.Phase4_1;
import com.example.administrator.editknee.pagePhase5.Phase5;
import com.example.administrator.editknee.pagePhase5.Phase5_1;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase5Adapter extends RecyclerView.Adapter<Phase5ViewHolder> {
    private Context mContext;
    private List<DBPhase5> mPhase5;

    public Phase5Adapter(Context context, List<DBPhase5> phase5) {
        mContext = context;
        mPhase5 = phase5;
    }

    public void setPhase5(List<DBPhase5> phase5) {
        mPhase5 = phase5;
    }

    @Override
    public Phase5ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase5, parent, false);
        return new Phase5ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase5ViewHolder holder, int position) {
        final DBPhase5 dbphase5 = mPhase5.get(position);
        holder.s5.setText(String.format(mContext.getString(R.string.format_IdCount5),
                dbphase5.getId()));
        holder.dateTextView5.setText(String.format(mContext.getString(R.string.date5),
                dbphase5.getDate5()));
        holder.timeTextView5.setText(String.format(mContext.getString(R.string.time5),
                dbphase5.getTime5()));
        holder.step5_1TextView.setText(String.format(mContext.getString(R.string.number5_1),
                dbphase5.getNumber5_1()));
        holder.step5_2TextView.setText(String.format(mContext.getString(R.string.number5_2),
                dbphase5.getNumber5_2()));
        holder.step5_3TextView.setText(String.format(mContext.getString(R.string.number5_3),
                dbphase5.getNumber5_3()));
        holder.step5_4TextView.setText(String.format(mContext.getString(R.string.number5_4),
                dbphase5.getNumber5_4()));
        holder.step5_5TextView.setText(String.format(mContext.getString(R.string.number5_5),
                dbphase5.getNumber5_5()));
        holder.step5_6TextView.setText(String.format(mContext.getString(R.string.number5_6),
                dbphase5.getNumber5_6()));
        holder.note5_1TextView.setText(String.format(mContext.getString(R.string.note5_1),
                dbphase5.getNote1()));
        holder.note5_2TextView.setText(String.format(mContext.getString(R.string.note5_2),
                dbphase5.getNote2()));
        holder.note5_3TextView.setText(String.format(mContext.getString(R.string.note5_3),
                dbphase5.getNote3()));
        holder.note5_4TextView.setText(String.format(mContext.getString(R.string.note5_4),
                dbphase5.getNote4()));
        holder.note5_5TextView.setText(String.format(mContext.getString(R.string.note5_5),
                dbphase5.getNote5()));
        holder.note5_6TextView.setText(String.format(mContext.getString(R.string.note5_6),
                dbphase5.getNote6()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase5.getId());
            }
        });
    }

    private void startEditForm(int phase5Id) {
        Intent intent = new Intent(mContext, Phase5_1.class);
        intent.putExtra(Phase5_1.EXTRA_PHASE5_ID, phase5Id);
        ((Activity) mContext).startActivityForResult(intent, HistoryFirstPhase5.REQUEST_UPDATE5);
    }

    @Override
    public int getItemCount() {
        return mPhase5 == null ? 0 : mPhase5.size();
    }
}
