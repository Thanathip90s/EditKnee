package com.example.administrator.editknee.AdapterPhase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase3;
import com.example.administrator.editknee.HistoryPhase.HistoryFirstPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.ViewHolder.Phase3ViewHolder;
import com.example.administrator.editknee.ViewHolder.Phase4ViewHolder;
import com.example.administrator.editknee.pagePhase3.Phase3_1;
import com.example.administrator.editknee.pagePhase4.Phase4_1;

import java.util.List;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class Phase4Adapter extends RecyclerView.Adapter<Phase4ViewHolder> {
    private Context mContext;
    private List<DBPhase4> mPhase4;

    public Phase4Adapter(Context context, List<DBPhase4> phase4) {
        mContext = context;
        mPhase4 = phase4;
    }

    public void setPhase4(List<DBPhase4> phase4) {
        mPhase4 = phase4;
    }

    @Override
    public Phase4ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_phase4, parent, false);
        return new Phase4ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Phase4ViewHolder holder, int position) {
        final DBPhase4 dbphase4 = mPhase4.get(position);
        holder.s4.setText(String.format(mContext.getString(R.string.format_IdCount4),
                dbphase4.getId()));
        holder.dateTextView4.setText(String.format(mContext.getString(R.string.date4),
                dbphase4.getDate4()));
        holder.timeTextView4.setText(String.format(mContext.getString(R.string.time4),
                dbphase4.getTime4()));
        holder.step4_1TextView.setText(String.format(mContext.getString(R.string.number4_1),
                dbphase4.getNumber4_1()));
        holder.step4_2TextView.setText(String.format(mContext.getString(R.string.number4_2),
                dbphase4.getNumber4_2()));
        holder.step4_3TextView.setText(String.format(mContext.getString(R.string.number4_3),
                dbphase4.getNumber4_3()));
        holder.step4_4TextView.setText(String.format(mContext.getString(R.string.number4_4),
                dbphase4.getNumber4_4()));
        holder.step4_5TextView.setText(String.format(mContext.getString(R.string.number4_5),
                dbphase4.getNumber4_5()));
        holder.step4_6TextView.setText(String.format(mContext.getString(R.string.number4_6),
                dbphase4.getNumber4_6()));
        holder.note4_1TextView.setText(String.format(mContext.getString(R.string.note4_1),
                dbphase4.getNote1()));
        holder.note4_2TextView.setText(String.format(mContext.getString(R.string.note4_2),
                dbphase4.getNote2()));
        holder.note4_3TextView.setText(String.format(mContext.getString(R.string.note4_3),
                dbphase4.getNote3()));
        holder.note4_4TextView.setText(String.format(mContext.getString(R.string.note4_4),
                dbphase4.getNote4()));
        holder.note4_5TextView.setText(String.format(mContext.getString(R.string.note4_5),
                dbphase4.getNote5()));
        holder.note4_6TextView.setText(String.format(mContext.getString(R.string.note4_6),
                dbphase4.getNote6()));

        // Todo: example make simple onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEditForm(dbphase4.getId());
            }
        });
    }

    private void startEditForm(int phase4Id) {
        Intent intent = new Intent(mContext, Phase4_1.class);
        intent.putExtra(Phase4_1.EXTRA_PHASE4_ID, phase4Id);
        ((Activity) mContext).startActivityForResult(intent, HistoryFirstPhase4.REQUEST_UPDATE4);
    }

    @Override
    public int getItemCount() {
        return mPhase4 == null ? 0 : mPhase4.size();
    }
}
