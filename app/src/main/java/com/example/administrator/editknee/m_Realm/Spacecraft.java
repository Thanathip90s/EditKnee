package com.example.administrator.editknee.m_Realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 08-Feb-17.
 */

public class Spacecraft extends RealmObject {
    @PrimaryKey
    private String date1;
    private String time1;
    private String stepTxt1;
    private String noteTxt1;
    private String stepTxt2;
    private String noteTxt2;
    private String stepTxt3;
    private String noteTxt3;

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getStepTxt2() {
        return stepTxt2;
    }

    public void setStepTxt2(String stepTxt2) {
        this.stepTxt2 = stepTxt2;
    }

    public String getStepTxt1() {
        return stepTxt1;
    }

    public void setStepTxt1(String stepTxt1) {
        this.stepTxt1 = stepTxt1;
    }

    public String getNoteTxt1() {
        return noteTxt1;
    }

    public void setNoteTxt1(String noteTxt1) {
        this.noteTxt1 = noteTxt1;
    }

    public String getNoteTxt2() {
        return noteTxt2;
    }

    public void setNoteTxt2(String noteTxt2) {
        this.noteTxt2 = noteTxt2;
    }

    public String getStepTxt3() {
        return stepTxt3;
    }

    public void setStepTxt3(String stepTxt3) {
        this.stepTxt3 = stepTxt3;
    }

    public String getNoteTxt3() {
        return noteTxt3;
    }

    public void setNoteTxt3(String noteTxt3) {
        this.noteTxt3 = noteTxt3;
    }
}
