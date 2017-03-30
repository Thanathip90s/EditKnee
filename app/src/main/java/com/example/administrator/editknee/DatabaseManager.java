package com.example.administrator.editknee;

import android.content.Context;

import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.pagePerson.DetailPatient;

import java.util.List;

import io.realm.RealmConfiguration;
import io.realm.Realm;
import io.realm.exceptions.RealmMigrationNeededException;

/**
 * Created by Administrator on 02-Feb-17.
 */

public class DatabaseManager {
    private RealmConfiguration mConfigure;
    private static DatabaseManager mInstance;

    public static synchronized DatabaseManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new DatabaseManager(context);
        }
        return mInstance;
    }

    public DatabaseManager(Context context) {
        Realm.init(context);
        try {
            mConfigure = new RealmConfiguration.Builder().build();
        } catch (RealmMigrationNeededException e) {
            e.printStackTrace();
            mConfigure = new RealmConfiguration.Builder()
                    .deleteRealmIfMigrationNeeded()
                    .build();
        }
    }

    private Realm getRealm() {
        try {
            return Realm.getInstance(mConfigure);
        } catch (RealmMigrationNeededException e) {
            mConfigure = new RealmConfiguration.Builder()
                    .deleteRealmIfMigrationNeeded()
                    .build();
            return Realm.getInstance(mConfigure);
        }
    }

    public void storePerson(Person person) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(person);
        realm.commitTransaction();
        realm.close();
    }

    public Person getPerson() {
        Person person = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        Person realmPerson = realm.where(Person.class).findFirst();
        if (realmPerson != null) {
            person = realm.copyFromRealm(realmPerson);
        }
        realm.commitTransaction();
        realm.close();
        return person;
    }

    public void storeDetailPerson(DetailPerson detailPerson) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(detailPerson);
        realm.commitTransaction();
        realm.close();
    }

    public DetailPerson getDetailPerson() {
        DetailPerson detailPerson = null;
        Realm realm = getRealm();
        realm.beginTransaction();
        DetailPerson realmDetailPerson = realm.where(DetailPerson.class).findFirst();
        if (realmDetailPerson != null) {
            detailPerson = realm.copyFromRealm(realmDetailPerson);
        }
        realm.commitTransaction();
        realm.close();
        return detailPerson;
    }

    public void storeDBPhase1(DBPhase1 dbPhase1) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase1);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase1 getDBPhase1(int phase1Id) {
        Realm realm = getRealm();
        DBPhase1 realmDBPhase1 = realm.where(DBPhase1.class)
                .equalTo("id", phase1Id)
                .findFirst();
        DBPhase1 dbPhase1 = realmDBPhase1 != null ? realm.copyFromRealm(realmDBPhase1) : null;
        realm.close();
        return dbPhase1;
    }

    public List<DBPhase1> getPhase1() {
        Realm realm = getRealm();
        List<DBPhase1> realmPeople = realm.where(DBPhase1.class)
                .findAllSorted("id");
        List<DBPhase1> phase1 = realm.copyFromRealm(realmPeople);
        realm.close();
        return phase1;
    }

    public int getLatestId() {
        List<DBPhase1> phase1 = getPhase1();
        return phase1.size() + 1;
    }

//    RealmConfiguration realmConfiguration;
//
//    public DatabaseManager(Context context) {
//        Realm.init(context);
//        realmConfiguration = new RealmConfiguration.Builder().build();
//    }
//
//    private Realm getRealm() {
//        try {
//            return Realm.getInstance(realmConfiguration);
//        } catch (RealmMigrationNeededException e) {
//            Realm.deleteRealm(realmConfiguration);
//            return Realm.getInstance(realmConfiguration);
//        }
//    }
//
//    public void storePerson(Person person) {
//        Realm realm = getRealm();
//        realm.beginTransaction();
//        realm.copyToRealmOrUpdate(person);
//        realm.commitTransaction();
//        realm.close();
//    }
//
//    public Person getPerson() {
//        Person person = null;
//        Realm realm = getRealm();
//        realm.beginTransaction();
//        Person realmPerson = realm.where(Person.class).findFirst();
//        if (realmPerson != null) {
//            person = realm.copyFromRealm(realmPerson);
//        }
//        realm.commitTransaction();
//        realm.close();
//        return person;
//
//    }
}
