package com.niemisami.koodikerhoapp;


import android.content.Intent;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getSimpleName();
    public static final String SALASANA = "SALASANA";
    public static final String NIMI = "NIMI";

    private Toolbar mToolBar;

    private Button mStartButton;
    private EditText mNameView, mPasswordView;

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

        initViews(view);



        return view;
    }

    private void initViews(View view) {
        mNameView = (EditText) view.findViewById(R.id.edit_text_username);
        mNameView.setHint("Name");
        mPasswordView = (EditText) view.findViewById(R.id.edit_text_password);
        mPasswordView.setHint("Password");

        mStartButton = (Button) view.findViewById(R.id.button_start);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), getString(R.string.hello_main_fragment), Toast.LENGTH_SHORT)
                        .show();
                Intent intent = new Intent(getActivity(), SecondActivity.class);

                String name = mNameView.getText().toString();
                String password = mPasswordView.getText().toString();
                intent.putExtra(NIMI, name);
                intent.putExtra(SALASANA, password);
                startActivity(intent);
            }
        });
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
