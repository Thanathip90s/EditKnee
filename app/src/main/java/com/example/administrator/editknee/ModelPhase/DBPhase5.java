package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase5 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date5;
    private String time5;
    private int number5_1;
    private String note1;
    private int number5_2;
    private String note2;
    private int number5_3;
    private String note3;
    private int number5_4;
    private String note4;
    private int number5_5;
    private String note5;
    private int number5_6;
    private String note6;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate5() {
        return date5;
    }

    public void setDate5(String date5) {
        this.date5 = date5;
    }

    public String getTime5() {
        return time5;
    }

    public void setTime5(String time5) {
        this.time5 = time5;
    }

    public int getNumber5_1() {
        return number5_1;
    }

    public void setNumber5_1(int number5_1) {
        this.number5_1 = number5_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber5_2() {
        return number5_2;
    }

    public void setNumber5_2(int number5_2) {
        this.number5_2 = number5_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber5_3() {
        return number5_3;
    }

    public void setNumber5_3(int number5_3) {
        this.number5_3 = number5_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public int getNumber5_4() {
        return number5_4;
    }

    public void setNumber5_4(int number5_4) {
        this.number5_4 = number5_4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public int getNumber5_5() {
        return number5_5;
    }

    public void setNumber5_5(int number5_5) {
        this.number5_5 = number5_5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public int getNumber5_6() {
        return number5_6;
    }

    public void setNumber5_6(int number5_6) {
        this.number5_6 = number5_6;
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }
}
