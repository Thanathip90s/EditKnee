package com.example.administrator.editknee;

import android.content.Context;

import java.util.Date;

import io.realm.RealmConfiguration;
import io.realm.Realm;
import io.realm.exceptions.RealmMigrationNeededException;

/**
 * Created by Administrator on 02-Feb-17.
 */

public class DatabaseManager {
    RealmConfiguration realmConfiguration;

    public DatabaseManager (Context context){
        Realm.init(context);
        realmConfiguration = new RealmConfiguration.Builder().build();
    }

    private Realm getRealm(){
        try {
            return Realm.getInstance(realmConfiguration);
        }
        catch (RealmMigrationNeededException e)
        {
            Realm.deleteRealm(realmConfiguration);
            return Realm.getInstance(realmConfiguration);
        }
    }

    public void storePerson(Person person){
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(person);
        realm.commitTransaction();
        realm.close();
    }

    public Person getPerson(){
        Person person = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Person realmPerson = realm.where(Person.class).findFirst();
        if(realmPerson != null) {
           person = realm.copyFromRealm(realmPerson);
        }
        realm.commitTransaction();
        realm.close();
        return person;

    }

//    public void storeDBPhase1(DBPhase1 dbPhase1){
//        Realm realm = getRealm();
//        realm.beginTransaction();
//        realm.copyToRealmOrUpdate(dbPhase1);
//        realm.commitTransaction();
//        realm.close();
//    }
//
//    public DBPhase1 getDBPhase1(){
//        DBPhase1 dbPhase1 = null;
//        Realm realm = getRealm();
//        realm.beginTransaction();
//        DBPhase1 realmDBPhase1 = realm.where(DBPhase1.class).findFirst();
//        if(realmDBPhase1 != null) {
//            dbPhase1 = realm.copyFromRealm(realmDBPhase1);
//        }
//        realm.commitTransaction();
//        realm.close();
//        return dbPhase1;
//    }
}
