package com.example.administrator.editknee.m_Realm;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.exceptions.RealmException;

/**
 * Created by Administrator on 08-Feb-17.
 */

public class RealmHelper {

    Realm realm;
    RealmResults<Spacecraft> spacecrafts;
    Boolean saved;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

    //SAVE
    public Boolean save(final Spacecraft spacecraft) {
        if (spacecraft == null) {
            saved = false;

        } else {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {

                    try {
                        Spacecraft s = realm.copyToRealm(spacecraft);
                        saved = true;

                    } catch (RealmException e) {
                        e.printStackTrace();
                        saved = false;
                    }
                }
            });
        }

        return saved;
    }

    //RETRIEVE FROM DB
    public void retrieveFromDB() {
        spacecrafts = realm.where(Spacecraft.class).findAll();
    }

    //just refresh
    public ArrayList<Spacecraft> justRefresh() {
        ArrayList<Spacecraft> latest = new ArrayList<>();
        for (Spacecraft s : spacecrafts) {
            latest.add(s);
        }
        return latest;
    }
}
