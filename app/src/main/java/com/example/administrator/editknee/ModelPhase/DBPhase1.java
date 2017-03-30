package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase1 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date1;
    private String time1;
    private int number1_1;
    private String note1;
    private int number1_2;
    private String note2;
    private int number1_3;
    private String note3;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumber1_1() {
        return number1_1;
    }

    public void setNumber1_1(int number1_1) {
        this.number1_1 = number1_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber1_2() {
        return number1_2;
    }

    public void setNumber1_2(int number1_2) {
        this.number1_2 = number1_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber1_3() {
        return number1_3;
    }

    public void setNumber1_3(int number1_3) {
        this.number1_3 = number1_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }
}
