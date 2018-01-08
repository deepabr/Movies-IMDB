package com.example.deepa.movies.views;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import com.example.deepa.movies.R;
import com.example.deepa.movies.fragment.MovieList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        MovieList movieListFragment = new MovieList();
        transaction.replace(R.id.fragmentContainer, movieListFragment);
        transaction.commit();
    }
}
