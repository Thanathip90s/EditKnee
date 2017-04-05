package com.example.administrator.editknee;

import android.content.Context;

import com.example.administrator.editknee.ModelPerson.DetailPerson;
import com.example.administrator.editknee.ModelPerson.Person;
import com.example.administrator.editknee.ModelPhase.DBPhase1;
import com.example.administrator.editknee.ModelPhase.DBPhase2;
import com.example.administrator.editknee.ModelPhase.DBPhase3;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.ModelPhase.DBPhase6;
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
        List<DBPhase1> realmPhase1 = realm.where(DBPhase1.class)
                .findAllSorted("id");
        List<DBPhase1> phase1 = realm.copyFromRealm(realmPhase1);
        realm.close();
        return phase1;
    }

    public int getLatestId() {
        List<DBPhase1> phase1 = getPhase1();
        return phase1.size() + 1;
    }

    public void storeDBPhase2(DBPhase2 dbPhase2) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase2);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase2 getDBPhase2(int phase2Id) {
        Realm realm = getRealm();
        DBPhase2 realmDBPhase2 = realm.where(DBPhase2.class)
                .equalTo("id", phase2Id)
                .findFirst();
        DBPhase2 dbPhase2 = realmDBPhase2 != null ? realm.copyFromRealm(realmDBPhase2) : null;
        realm.close();
        return dbPhase2;
    }

    public List<DBPhase2> getPhase2() {
        Realm realm = getRealm();
        List<DBPhase2> realmPhase2 = realm.where(DBPhase2.class)
                .findAllSorted("id");
        List<DBPhase2> phase2 = realm.copyFromRealm(realmPhase2);
        realm.close();
        return phase2;
    }

    public int getLatestId2() {
        List<DBPhase2> phase2 = getPhase2();
        return phase2.size() + 1;
    }

    public void storeDBPhase3(DBPhase3 dbPhase3) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase3);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase3 getDBPhase3(int phase3Id) {
        Realm realm = getRealm();
        DBPhase3 realmDBPhase3 = realm.where(DBPhase3.class)
                .equalTo("id", phase3Id)
                .findFirst();
        DBPhase3 dbPhase3 = realmDBPhase3 != null ? realm.copyFromRealm(realmDBPhase3) : null;
        realm.close();
        return dbPhase3;
    }

    public List<DBPhase3> getPhase3() {
        Realm realm = getRealm();
        List<DBPhase3> realmPhase3 = realm.where(DBPhase3.class)
                .findAllSorted("id");
        List<DBPhase3> phase3 = realm.copyFromRealm(realmPhase3);
        realm.close();
        return phase3;
    }

    public int getLatestId3() {
        List<DBPhase3> phase3 = getPhase3();
        return phase3.size() + 1;
    }

    public void storeDBPhase4(DBPhase4 dbPhase4) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase4);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase4 getDBPhase4(int phase4Id) {
        Realm realm = getRealm();
        DBPhase4 realmDBPhase4 = realm.where(DBPhase4.class)
                .equalTo("id", phase4Id)
                .findFirst();
        DBPhase4 dbPhase4 = realmDBPhase4 != null ? realm.copyFromRealm(realmDBPhase4) : null;
        realm.close();
        return dbPhase4;
    }

    public List<DBPhase4> getPhase4() {
        Realm realm = getRealm();
        List<DBPhase4> realmPhase4 = realm.where(DBPhase4.class)
                .findAllSorted("id");
        List<DBPhase4> phase4 = realm.copyFromRealm(realmPhase4);
        realm.close();
        return phase4;
    }

    public int getLatestId4() {
        List<DBPhase4> phase4 = getPhase4();
        return phase4.size() + 1;
    }

    public void storeDBPhase5(DBPhase5 dbPhase5) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase5);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase5 getDBPhase5(int phase5Id) {
        Realm realm = getRealm();
        DBPhase5 realmDBPhase5 = realm.where(DBPhase5.class)
                .equalTo("id", phase5Id)
                .findFirst();
        DBPhase5 dbPhase5 = realmDBPhase5 != null ? realm.copyFromRealm(realmDBPhase5) : null;
        realm.close();
        return dbPhase5;
    }

    public List<DBPhase5> getPhase5() {
        Realm realm = getRealm();
        List<DBPhase5> realmPhase5 = realm.where(DBPhase5.class)
                .findAllSorted("id");
        List<DBPhase5> phase5 = realm.copyFromRealm(realmPhase5);
        realm.close();
        return phase5;
    }

    public int getLatestId5() {
        List<DBPhase5> phase5 = getPhase5();
        return phase5.size() + 1;
    }

    public void storeDBPhase6(DBPhase6 dbPhase6) {
        Realm realm = getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(dbPhase6);
        realm.commitTransaction();
        realm.close();
    }

    public DBPhase6 getDBPhase6(int phase6Id) {
        Realm realm = getRealm();
        DBPhase6 realmDBPhase6 = realm.where(DBPhase6.class)
                .equalTo("id", phase6Id)
                .findFirst();
        DBPhase6 dbPhase6 = realmDBPhase6 != null ? realm.copyFromRealm(realmDBPhase6) : null;
        realm.close();
        return dbPhase6;
    }

    public List<DBPhase6> getPhase6() {
        Realm realm = getRealm();
        List<DBPhase6> realmPhase6 = realm.where(DBPhase6.class)
                .findAllSorted("id");
        List<DBPhase6> phase6 = realm.copyFromRealm(realmPhase6);
        realm.close();
        return phase6;
    }

    public int getLatestId6() {
        List<DBPhase6> phase6 = getPhase6();
        return phase6.size() + 1;
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
