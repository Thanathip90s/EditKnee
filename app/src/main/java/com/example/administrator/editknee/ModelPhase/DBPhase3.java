package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase3 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date3;
    private String time3;
    private int number3_1;
    private String note1;
    private int number3_2;
    private String note2;
    private int number3_3;
    private String note3;
    private int number3_4;
    private String note4;
    private int number3_5;
    private String note5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public String getTime3() {
        return time3;
    }

    public void setTime3(String time3) {
        this.time3 = time3;
    }

    public int getNumber3_1() {
        return number3_1;
    }

    public void setNumber3_1(int number3_1) {
        this.number3_1 = number3_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber3_2() {
        return number3_2;
    }

    public void setNumber3_2(int number3_2) {
        this.number3_2 = number3_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber3_3() {
        return number3_3;
    }

    public void setNumber3_3(int number3_3) {
        this.number3_3 = number3_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public int getNumber3_4() {
        return number3_4;
    }

    public void setNumber3_4(int number3_4) {
        this.number3_4 = number3_4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public int getNumber3_5() {
        return number3_5;
    }

    public void setNumber3_5(int number3_5) {
        this.number3_5 = number3_5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }
}
