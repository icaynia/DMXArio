package com.icaynia.dmxario.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icaynia.dmxario.Activity.MainActivity;
import com.icaynia.dmxario.R;

/**
 * Created by icaynia on 2017. 1. 13..
 */

public class FriendsFragment extends Fragment {
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_friends, container, false);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("친구");
        return v;
    }
}
