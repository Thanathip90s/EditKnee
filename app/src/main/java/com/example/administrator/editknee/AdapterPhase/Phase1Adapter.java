package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase1;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.Tab2HistoryKnee;
import com.example.administrator.editknee.ViewHolder.Phase1ViewHolder;
import com.example.administrator.editknee.pagePhase1.Phase1;
import com.example.administrator.editknee.pagePhase1.Phase1_1;
import com.example.administrator.editknee.pagePhase1.Phase1_2;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase1Adapter extends RecyclerView.Adapter<Phase1ViewHolder> {
    private Context mContext;
    private List<DBPhase1> mPhase1;

    public Phase1Adapter(Context context, List<DBPhase1> phase1) {
        mContext = context;
        mPhase1 = phase1;
    }

    public void setPhase1(List<DBPhase1> phase1) {
        mPhase1 = phase1;
    }

    @Override
    public Phase1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase1, parent, false);
        return new Phase1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase1ViewHolder holder, int position) {
        final DBPhase1 dbphase1 = mPhase1.get(position);
        holder.s.setText(String.format(mContext.getString(R.string.format_IdCount),
                dbphase1.getId()));
        holder.dateTextView.setText(String.format(mContext.getString(R.string.date1),
                dbphase1.getDate1()));
        holder.timeTextView.setText(String.format(mContext.getString(R.string.time1),
                dbphase1.getTime1()));
        holder.step1_1TextView.setText(String.format(mContext.getString(R.string.number1_1),
                dbphase1.getNumber1_1()));
        holder.step1_2TextView.setText(String.format(mContext.getString(R.string.number1_2),
                dbphase1.getNumber1_2()));
        holder.step1_3TextView.setText(String.format(mContext.getString(R.string.number1_3),
                dbphase1.getNumber1_3()));
        holder.note1_1TextView.setText(String.format(mContext.getString(R.string.note1_1),
                dbphase1.getNote1()));
        holder.note1_2TextView.setText(String.format(mContext.getString(R.string.note1_2),
                dbphase1.getNote2()));
        holder.note1_3TextView.setText(String.format(mContext.getString(R.string.note1_3),
                dbphase1.getNote3()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase1.getId());
            }
        });
    }

    private void startEditForm(int phase1Id) {
        Intent intent = new Intent(mContext, Phase1_1.class);
        intent.putExtra(Phase1_1.EXTRA_PHASE1_ID, phase1Id);
        ((Activity) mContext).startActivityForResult(intent, HistoryFirstPhase1.REQUEST_UPDATE);
    }

    @Override
    public int getItemCount() {
        return mPhase1 == null ? 0 : mPhase1.size();
    }
}
