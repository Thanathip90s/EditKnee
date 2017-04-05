package com.example.administrator.editknee.ModelPhase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 20-Mar-17.
 */

public class DBPhase4 extends RealmObject{
    @PrimaryKey
    private int id;
    private String date4;
    private String time4;
    private int number4_1;
    private String note1;
    private int number4_2;
    private String note2;
    private int number4_3;
    private String note3;
    private int number4_4;
    private String note4;
    private int number4_5;
    private String note5;
    private int number4_6;
    private String note6;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate4() {
        return date4;
    }

    public void setDate4(String date4) {
        this.date4 = date4;
    }

    public String getTime4() {
        return time4;
    }

    public void setTime4(String time4) {
        this.time4 = time4;
    }

    public int getNumber4_1() {
        return number4_1;
    }

    public void setNumber4_1(int number4_1) {
        this.number4_1 = number4_1;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public int getNumber4_2() {
        return number4_2;
    }

    public void setNumber4_2(int number4_2) {
        this.number4_2 = number4_2;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public int getNumber4_3() {
        return number4_3;
    }

    public void setNumber4_3(int number4_3) {
        this.number4_3 = number4_3;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public int getNumber4_4() {
        return number4_4;
    }

    public void setNumber4_4(int number4_4) {
        this.number4_4 = number4_4;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public int getNumber4_5() {
        return number4_5;
    }

    public void setNumber4_5(int number4_5) {
        this.number4_5 = number4_5;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public int getNumber4_6() {
        return number4_6;
    }

    public void setNumber4_6(int number4_6) {
        this.number4_6 = number4_6;
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }
}
