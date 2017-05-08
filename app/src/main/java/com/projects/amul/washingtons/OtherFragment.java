package com.projects.amul.washingtons;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by amulpok on 5/1/17.
 */

public class OtherFragment extends Fragment{
    public static OtherFragment newInstance() {
        return new OtherFragment();
    }

    //3
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.other_fragment, container, false);
    }
}
