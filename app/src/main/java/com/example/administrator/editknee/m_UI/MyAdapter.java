package com.example.administrator.editknee.m_UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.administrator.editknee.R;
import com.example.administrator.editknee.m_Realm.Spacecraft;

import java.util.ArrayList;

/**
 * Created by Administrator on 08-Feb-17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Spacecraft> spacecrafts;

    public MyAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Spacecraft s=spacecrafts.get(position);

        holder.dateTxt.setText(s.getDate1());
        holder.timeTxt.setText(s.getTime1());
    }

    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}

