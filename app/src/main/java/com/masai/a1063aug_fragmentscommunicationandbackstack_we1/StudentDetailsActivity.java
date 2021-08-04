package com.masai.a1063aug_fragmentscommunicationandbackstack_we1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class StudentDetailsActivity extends AppCompatActivity implements CommunicationListener {

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        LaunchPersonalDetails();
    }

    private void LaunchPersonalDetails() {
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        transaction.add(R.id.container,fragment,"personal").commit();

    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment performanceDetailsFragment = new StudentPerformanceDetailsFragment();
        performanceDetailsFragment.setArguments(bundle);
        transaction.replace(R.id.container,performanceDetailsFragment,"performanceDetailFragment").addToBackStack("").commit();
    }
}