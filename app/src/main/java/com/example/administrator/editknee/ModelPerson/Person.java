package com.example.administrator.editknee.ModelPerson;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Administrator on 22-Mar-17.
 */

public class Person extends RealmObject {
    @PrimaryKey
    String id;
    String name;
    String gender;
    String birthday;
    String weight;
    String height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
