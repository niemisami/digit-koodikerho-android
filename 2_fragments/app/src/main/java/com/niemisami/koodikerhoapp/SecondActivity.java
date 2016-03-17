package com.niemisami.koodikerhoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mNameView, mPasswordView;

    String TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String mName = intent.getStringExtra(MainFragment.NIMI);
        String mPassword = intent.getStringExtra(MainFragment.SALASANA);

        Log.d(TAG, "onCreate: " + mName + " : " + mPassword);

        mNameView = (TextView) findViewById(R.id.text_view_name);
        mPasswordView = (TextView) findViewById(R.id.text_view_password);

        mNameView.setText(mName);
        mPasswordView.setText(mPassword);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
