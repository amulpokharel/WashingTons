package com.projects.amul.washingtons;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by amulpok on 5/1/17.
 */

public class DryerFragment extends Fragment{
    public static DryerFragment newInstance() {
        return new DryerFragment();
    }


    //setup custom font
    Typeface wash_font;
    //3
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View main =  inflater.inflate(R.layout.dryer_fragment, container, false);
        wash_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/wash.ttf");

        setupListItem((RelativeLayout)main.findViewById(R.id.tNormal),
                "N",
                "Tumble Dry, Normal",
                "A machine dryer may be regularly used at the hottest available temperature setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tNormal_low),
                "U",
                "Tumble Dry, Normal, Low Heat",
                "A machine dryer may be regularly used at a maximum of Low Heat setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tNormal_medium),
                "T",
                "Tumble Dry, Normal, Medium Heat",
                "A machine dryer may be regularly used at a maximum of Medium Heat setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tNormal_high),
                "S",
                "Tumble Dry, Normal, High Heat",
                "A machine dryer may be regularly used at a High Heat setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tNormal_none),
                "V",
                "Tumble Dry, Normal, No Heat",
                "A machine dryer may be regularly used only at No Heat or Air Only setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tPermPress),
                "O",
                "Tumble Dry, Permanent Press",
                "A machine dryer may be regularly used only at the Permanent Press setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.tGentle),
                "P",
                "Tumble Dry, Gentle",
                "A machine dryer may be regularly used only at the Gentle setting");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_tumble),
                "Q",
                "Do Not Tumble Dry",
                "A machine dryer may not be used. Usually accompanied by an alternate drying method symbol");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_dry),
                "W",
                "Do Not Dry",
                "A machine dryer may not be used. Usually accompanied by an alternate drying method symbol");

        setupListItem((RelativeLayout)main.findViewById(R.id.line_dry),
                "X",
                "Line Dry",
                "Hang damp garment from line or bar, in or out doors");

        setupListItem((RelativeLayout)main.findViewById(R.id.drip_dry),
                "Y",
                "Drip Dry",
                "Hang dripping wet garment from line or bar, in or out doors, without hand shaping or smoothing");

        setupListItem((RelativeLayout)main.findViewById(R.id.dry_flat),
                "Z",
                "Dry Flat",
                "Lay out horizontally for drying");

        setupListItem((RelativeLayout)main.findViewById(R.id.dry_in_shade),
                "a",
                "Dry In Shade",
                "Usually added to Line or Drip Dry. Dry away from direct sunlight");

        return main;
    }

    private void setupListItem(RelativeLayout rl, String mainIcon, String firstLine, String secondLine){
        ((TextView)rl.findViewById(R.id.mainIcon))
                .setTypeface(wash_font);
        ((TextView)rl.findViewById(R.id.mainIcon))
                .setText(mainIcon);
        ((TextView)rl.findViewById(R.id.firstLine))
                .setText(firstLine);
        ((TextView)rl.findViewById(R.id.secondLine))
                .setText(secondLine);
    }
}
