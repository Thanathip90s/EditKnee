package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.Tab2HistoryKnee;
import com.example.administrator.editknee.ViewHolder.Phase1ViewHolder;
import com.example.administrator.editknee.ViewHolder.Phase2ViewHolder;
import com.example.administrator.editknee.pagePhase1.Phase1_1;
import com.example.administrator.editknee.pagePhase2.Phase2_1;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase2Adapter extends RecyclerView.Adapter<Phase2ViewHolder> {
    private Context mContext;
    private List<DBPhase2> mPhase2;

    public Phase2Adapter(Context context, List<DBPhase2> phase2) {
        mContext = context;
        mPhase2 = phase2;
    }

    public void setPhase2(List<DBPhase2> phase2) {
        mPhase2 = phase2;
    }

    @Override
    public Phase2ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase2, parent, false);
        return new Phase2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase2ViewHolder holder, int position) {
        final DBPhase2 dbphase2 = mPhase2.get(position);
        holder.s2.setText(String.format(mContext.getString(R.string.format_IdCount2),
                dbphase2.getId()));
        holder.dateTextView2.setText(String.format(mContext.getString(R.string.date2),
                dbphase2.getDate2()));
        holder.timeTextView2.setText(String.format(mContext.getString(R.string.time2),
                dbphase2.getTime2()));
        holder.step2_1TextView.setText(String.format(mContext.getString(R.string.number2_1),
                dbphase2.getNumber2_1()));
        holder.step2_2TextView.setText(String.format(mContext.getString(R.string.number2_2),
                dbphase2.getNumber2_2()));
        holder.step2_3TextView.setText(String.format(mContext.getString(R.string.number2_3),
                dbphase2.getNumber2_3()));
        holder.step2_4TextView.setText(String.format(mContext.getString(R.string.number2_4),
                dbphase2.getNumber2_4()));
        holder.step2_5TextView.setText(String.format(mContext.getString(R.string.number2_5),
                dbphase2.getNumber2_5()));
        holder.note2_1TextView.setText(String.format(mContext.getString(R.string.note2_1),
                dbphase2.getNote1()));
        holder.note2_2TextView.setText(String.format(mContext.getString(R.string.note2_2),
                dbphase2.getNote2()));
        holder.note2_3TextView.setText(String.format(mContext.getString(R.string.note2_3),
                dbphase2.getNote3()));
        holder.note2_4TextView.setText(String.format(mContext.getString(R.string.note2_4),
                dbphase2.getNote4()));
        holder.note2_5TextView.setText(String.format(mContext.getString(R.string.note2_5),
                dbphase2.getNote5()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase2.getId());
            }
        });
    }

    private void startEditForm(int phase2Id) {
        Intent intent = new Intent(mContext, Phase2_1.class);
        intent.putExtra(Phase2_1.EXTRA_PHASE2_ID, phase2Id);
        ((Activity) mContext).startActivityForResult(intent, HistoryFirstPhase2.REQUEST_UPDATE);
    }

    @Override
    public int getItemCount() {
        return mPhase2 == null ? 0 : mPhase2.size();
    }
}
