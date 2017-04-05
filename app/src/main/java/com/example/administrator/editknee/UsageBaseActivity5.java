package com.example.administrator.editknee;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import admin.stateprogress.StateProgressBar;


public abstract class UsageBaseActivity5 extends Activity implements View.OnClickListener {

    protected String[] descriptionData = {"เซต 1", "เซต 2", "เซต 3","เซต 4", "เซต 5","เซต 6"};
    protected Button nextBtn;
    protected StateProgressBar stateprogressbar;


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        injectCommonViews();
    }


    protected void injectCommonViews() {
        nextBtn = (Button) findViewById(R.id.btn_nextPhase5);
        nextBtn.setOnClickListener(this);


        stateprogressbar = (StateProgressBar) findViewById(R.id.usage_stateprogressbar5);
        stateprogressbar.setStateDescriptionData(descriptionData);
    }
}
