package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase2 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date2;
    private String time2;
    private int number2_1;
    private String note1;
    private int number2_2;
    private String note2;
    private int number2_3;
    private String note3;
    private int number2_4;
    private String note4;
    private int number2_5;
    private String note5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public int getNumber2_1() {
        return number2_1;
    }

    public void setNumber2_1(int number2_1) {
        this.number2_1 = number2_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber2_2() {
        return number2_2;
    }

    public void setNumber2_2(int number2_2) {
        this.number2_2 = number2_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber2_3() {
        return number2_3;
    }

    public void setNumber2_3(int number2_3) {
        this.number2_3 = number2_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public int getNumber2_4() {
        return number2_4;
    }

    public void setNumber2_4(int number2_4) {
        this.number2_4 = number2_4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public int getNumber2_5() {
        return number2_5;
    }

    public void setNumber2_5(int number2_5) {
        this.number2_5 = number2_5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }
}
