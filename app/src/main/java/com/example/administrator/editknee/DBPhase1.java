package com.example.administrator.editknee;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 06-Feb-17.
 */

public class DBPhase1 extends RealmObject {

    @PrimaryKey
    String Id;
    String date1;
    String time1;
    String txtStep1;
    String txtNote1;
    String txtStep2;
    String txtNote2;
    String txtStep3;
    String txtNote3;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

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

    public String getTxtStep1() {
        return txtStep1;
    }

    public void setTxtStep1(String txtStep1) {
        this.txtStep1 = txtStep1;
    }

    public String getTxtNote1() {
        return txtNote1;
    }

    public void setTxtNote1(String txtNote1) {
        this.txtNote1 = txtNote1;
    }

    public String getTxtStep2() {
        return txtStep2;
    }

    public void setTxtStep2(String txtStep2) {
        this.txtStep2 = txtStep2;
    }

    public String getTxtNote2() {
        return txtNote2;
    }

    public void setTxtNote2(String txtNote2) {
        this.txtNote2 = txtNote2;
    }

    public String getTxtStep3() {
        return txtStep3;
    }

    public void setTxtStep3(String txtStep3) {
        this.txtStep3 = txtStep3;
    }

    public String getTxtNote3() {
        return txtNote3;
    }

    public void setTxtNote3(String txtNote3) {
        this.txtNote3 = txtNote3;
    }


}
