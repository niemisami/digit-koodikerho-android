package com.niemisami.koodikerhoapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getSimpleName();

    private Toolbar mToolBar;

    public MainFragment() {}


    ////////FRAGMENT LIFECYCLE METHODS//////
//    region
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);


//        Find toolbar from the view and set it to support actionbar
//        This can be set into the activity if menu items doesn't change even if fragments does
        setHasOptionsMenu(true);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        mToolBar = (Toolbar) view.findViewById(R.id.toolbar);
        mToolBar.setTitle(TAG);
        appCompatActivity.setSupportActionBar(mToolBar);


        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(getActivity().getApplicationContext(), "MenuItem: " + item.getTitle() + " clicked", Toast.LENGTH_SHORT)
                        .show();
                return true;
        }
        return false;

    }

//    endregion
}
