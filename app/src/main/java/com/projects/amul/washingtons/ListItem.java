package com.projects.amul.washingtons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amulpok on 5/1/17.
 */

public class ListItem {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View main =  inflater.inflate(R.layout.list_item, container, false);
        //((TextView)main.findViewById(R.id.firstLine)).setTypeface();
        return main;
    }
}
