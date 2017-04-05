package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase2;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.ViewHolder.Phase2ViewHolder;
import com.example.administrator.editknee.ViewHolder.Phase3ViewHolder;
import com.example.administrator.editknee.pagePhase2.Phase2_1;
import com.example.administrator.editknee.pagePhase3.Phase3_1;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase3Adapter extends RecyclerView.Adapter<Phase3ViewHolder> {
    private Context mContext;
    private List<DBPhase3> mPhase3;

    public Phase3Adapter(Context context, List<DBPhase3> phase3) {
        mContext = context;
        mPhase3 = phase3;
    }

    public void setPhase3(List<DBPhase3> phase3) {
        mPhase3 = phase3;
    }

    @Override
    public Phase3ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase3, parent, false);
        return new Phase3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase3ViewHolder holder, int position) {
        final DBPhase3 dbphase3 = mPhase3.get(position);
        holder.s3.setText(String.format(mContext.getString(R.string.format_IdCount3),
                dbphase3.getId()));
        holder.dateTextView3.setText(String.format(mContext.getString(R.string.date3),
                dbphase3.getDate3()));
        holder.timeTextView3.setText(String.format(mContext.getString(R.string.time3),
                dbphase3.getTime3()));
        holder.step3_1TextView.setText(String.format(mContext.getString(R.string.number3_1),
                dbphase3.getNumber3_1()));
        holder.step3_2TextView.setText(String.format(mContext.getString(R.string.number3_2),
                dbphase3.getNumber3_2()));
        holder.step3_3TextView.setText(String.format(mContext.getString(R.string.number3_3),
                dbphase3.getNumber3_3()));
        holder.step3_4TextView.setText(String.format(mContext.getString(R.string.number3_4),
                dbphase3.getNumber3_4()));
        holder.step3_5TextView.setText(String.format(mContext.getString(R.string.number3_5),
                dbphase3.getNumber3_5()));
        holder.note3_1TextView.setText(String.format(mContext.getString(R.string.note3_1),
                dbphase3.getNote1()));
        holder.note3_2TextView.setText(String.format(mContext.getString(R.string.note3_2),
                dbphase3.getNote2()));
        holder.note3_3TextView.setText(String.format(mContext.getString(R.string.note3_3),
                dbphase3.getNote3()));
        holder.note3_4TextView.setText(String.format(mContext.getString(R.string.note3_4),
                dbphase3.getNote4()));
        holder.note3_5TextView.setText(String.format(mContext.getString(R.string.note3_5),
                dbphase3.getNote5()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase3.getId());
            }
        });
    }

    private void startEditForm(int phase3Id) {
        Intent intent = new Intent(mContext, Phase3_1.class);
        intent.putExtra(Phase3_1.EXTRA_PHASE3_ID, phase3Id);
        ((Activity) mContext).startActivityForResult(intent, HistoryFirstPhase3.REQUEST_UPDATE3);
    }

    @Override
    public int getItemCount() {
        return mPhase3 == null ? 0 : mPhase3.size();
    }
}
