package com.example.administrator.editknee;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.administrator.editknee.pagePerson.EditPerson;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MenuFragActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufrag);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


//        tabLayout.addTab(tabLayout.newTab().setText("บันทึกเข่า").setIcon(R.drawable.ic_assignment_white_24dp));
//        tabLayout.addTab(tabLayout.newTab().setText("ประวัติบริหารเข่า").setIcon(R.drawable.ic_library_books_white_24dp));
//        tabLayout.addTab(tabLayout.newTab().setText("ความรู้ข้อเข่าเสื่อม").setIcon(R.drawable.ic_import_contacts_white_24dp));
//        tabLayout.addTab(tabLayout.newTab().setText("ประวัติส่วนบุคคล").setIcon(R.drawable.ic_face_white_24dp));

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_assignment_white_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_library_books_white_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_import_contacts_white_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_face_white_24dp);

    }

//    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                //startEditActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startEditActivity() {
        Intent i = new Intent(this, EditPerson.class);
        startActivity(i);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1SaveKnee tab1 = new Tab1SaveKnee();
                    return tab1;
                case 1:
                    Tab2HistoryKnee tab2 = new Tab2HistoryKnee();
                    return tab2;
                case 2:
                    Tab3Knowledge tab3 = new Tab3Knowledge();
                    return tab3;
                case 3:
                    Tab4History tab4 = new Tab4History();
                    return tab4;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "บันทึกเข่า";
                case 1:
                    return "ประวัติบริหารเข่า";
                case 2:
                    return "ความรู้ข้อเข่าเสื่อม";
                case 3:
                    return "ประวัติส่วนบุคคล";
            }
            return null;
        }
    }
}
