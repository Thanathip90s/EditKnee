package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase5;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase6;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.ModelPhase.DBPhase6;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.Tab2HistoryKnee;
import com.example.administrator.editknee.ViewHolder.Phase5ViewHolder;
import com.example.administrator.editknee.ViewHolder.Phase6ViewHolder;
import com.example.administrator.editknee.pagePhase5.Phase5_1;
import com.example.administrator.editknee.pagePhase6.Phase6_1;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase6Adapter extends RecyclerView.Adapter<Phase6ViewHolder> {
    private Context mContext;
    private List<DBPhase6> mPhase6;

    public Phase6Adapter(Context context, List<DBPhase6> phase6) {
        mContext = context;
        mPhase6 = phase6;
    }

    public void setPhase6(List<DBPhase6> phase6) {
        mPhase6 = phase6;
    }

    @Override
    public Phase6ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase6, parent, false);
        return new Phase6ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase6ViewHolder holder, int position) {
        final DBPhase6 dbphase6 = mPhase6.get(position);
        holder.s6.setText(String.format(mContext.getString(R.string.format_IdCount6),
                dbphase6.getId()));
        holder.dateTextView6.setText(String.format(mContext.getString(R.string.date6),
                dbphase6.getDate6()));
        holder.timeTextView6.setText(String.format(mContext.getString(R.string.time6),
                dbphase6.getTime6()));
        holder.step6_1TextView.setText(String.format(mContext.getString(R.string.number6_1),
                dbphase6.getNumber6_1()));
        holder.step6_2TextView.setText(String.format(mContext.getString(R.string.number6_2),
                dbphase6.getNumber6_2()));
        holder.step6_3TextView.setText(String.format(mContext.getString(R.string.number6_3),
                dbphase6.getNumber6_3()));
        holder.step6_4TextView.setText(String.format(mContext.getString(R.string.number6_4),
                dbphase6.getNumber6_4()));
        holder.step6_5TextView.setText(String.format(mContext.getString(R.string.number6_5),
                dbphase6.getNumber6_5()));
        holder.step6_6TextView.setText(String.format(mContext.getString(R.string.number6_6),
                dbphase6.getNumber6_6()));
        holder.note6_1TextView.setText(String.format(mContext.getString(R.string.note6_1),
                dbphase6.getNote1()));
        holder.note6_2TextView.setText(String.format(mContext.getString(R.string.note6_2),
                dbphase6.getNote2()));
        holder.note6_3TextView.setText(String.format(mContext.getString(R.string.note6_3),
                dbphase6.getNote3()));
        holder.note6_4TextView.setText(String.format(mContext.getString(R.string.note6_4),
                dbphase6.getNote4()));
        holder.note6_5TextView.setText(String.format(mContext.getString(R.string.note6_5),
                dbphase6.getNote5()));
        holder.note6_6TextView.setText(String.format(mContext.getString(R.string.note6_6),
                dbphase6.getNote6()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase6.getId());
            }
        });
    }

    private void startEditForm(int phase6Id) {
        Intent intent = new Intent(mContext, Phase6_1.class);
        intent.putExtra(Phase6_1.EXTRA_PHASE6_ID, phase6Id);
        ((Activity) mContext).startActivityForResult(intent, Tab2HistoryKnee.REQUEST_UPDATE);
    }

    @Override
    public int getItemCount() {
        return mPhase6 == null ? 0 : mPhase6.size();
    }
}
