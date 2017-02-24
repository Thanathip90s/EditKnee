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
}
