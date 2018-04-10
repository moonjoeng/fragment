package com.example.songv.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by songv on 2018-04-10.
 */

public class FragmentA extends Fragment {
    @Override //인플레이트!!
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}
