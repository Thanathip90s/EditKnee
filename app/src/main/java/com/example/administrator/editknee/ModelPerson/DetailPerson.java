package com.example.administrator.editknee.ModelPerson;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class DetailPerson extends RealmObject{
    @PrimaryKey
    String id;
    String q1;
    String q2;
    String q3;
    String q4;
    String q5;
    String q6;
    String q7;
    String q8;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateQ1() {
        return dateQ1;
    }

    public void setDateQ1(String dateQ1) {
        this.dateQ1 = dateQ1;
    }

    String dateQ1;

    public String getDateQ2() {
        return dateQ2;
    }

    public void setDateQ2(String dateQ2) {
        this.dateQ2 = dateQ2;
    }

    public String getDateQ3() {
        return dateQ3;
    }

    public void setDateQ3(String dateQ3) {
        this.dateQ3 = dateQ3;
    }

    String dateQ2;
    String dateQ3;

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getQ6() {
        return q6;
    }

    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public String getQ7() {
        return q7;
    }

    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public String getQ8() {
        return q8;
    }

    public void setQ8(String q8) {
        this.q8 = q8;
    }
}
