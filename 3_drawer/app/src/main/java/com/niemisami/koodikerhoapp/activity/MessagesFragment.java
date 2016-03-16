package com.niemisami.koodikerhoapp.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.niemisami.koodikerhoapp.R;


/**
 * Created by Ravi on 29/07/15.
 */
public class MessagesFragment extends Fragment {

    public MessagesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ebin, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

}
