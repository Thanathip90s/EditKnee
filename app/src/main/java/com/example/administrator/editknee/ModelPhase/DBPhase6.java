package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase6 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date6;
    private String time6;
    private int number6_1;
    private String note1;
    private int number6_2;
    private String note2;
    private int number6_3;
    private String note3;
    private int number6_4;
    private String note4;
    private int number6_5;
    private String note5;
    private int number6_6;
    private String note6;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate6() {
        return date6;
    }

    public void setDate6(String date6) {
        this.date6 = date6;
    }

    public String getTime6() {
        return time6;
    }

    public void setTime6(String time6) {
        this.time6 = time6;
    }

    public int getNumber6_1() {
        return number6_1;
    }

    public void setNumber6_1(int number6_1) {
        this.number6_1 = number6_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber6_2() {
        return number6_2;
    }

    public void setNumber6_2(int number6_2) {
        this.number6_2 = number6_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber6_3() {
        return number6_3;
    }

    public void setNumber6_3(int number6_3) {
        this.number6_3 = number6_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public int getNumber6_4() {
        return number6_4;
    }

    public void setNumber6_4(int number6_4) {
        this.number6_4 = number6_4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public int getNumber6_5() {
        return number6_5;
    }

    public void setNumber6_5(int number6_5) {
        this.number6_5 = number6_5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public int getNumber6_6() {
        return number6_6;
    }

    public void setNumber6_6(int number6_6) {
        this.number6_6 = number6_6;
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }
}
