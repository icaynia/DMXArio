package com.icaynia.dmxario.Layout.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icaynia.dmxario.Layout.Activity.MainActivity;
import com.icaynia.dmxario.R;

/**
 * Created by icaynia on 2017. 1. 3..
 */

public class SettingFragment extends Fragment {
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_setting, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("설정");
        return v;
    }
}
