package com.projects.amul.washingtons;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by amulpok on 5/1/17.
 */

public class WasherFragment extends Fragment{
    public static WasherFragment newInstance() {
        return new WasherFragment();
    }

    //setup custom font
    Typeface wash_font;
    //3
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View main =  inflater.inflate(R.layout.washer_fragment, container, false);
        wash_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/wash.ttf");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_normal),
                "A",
                "Machine Wash, Normal",
                "May be laundered with the hottest available water, detergent or soap, and agitation");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_cold),
                "L",
                "Machine Wash, Cold",
                "Initial water temperature should not exceed 30C or 65 to 85F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_warm),
                "K",
                "Machine Wash, Warm",
                "Initial water temperature should not exceed 40C or 105F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot1),
                "J",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 50C or 120F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot2),
                "I",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 60C or 140F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot3),
                "H",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 70C or 160F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot4),
                "G",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 95C or 200F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_perm),
                "B",
                "Machine Wash, Permanent Press",
                "Only on Permanent Press with cool down or cold rinse prior to reduced spin.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_gentle),
                "C",
                "Machine Wash, Machine Wash, Gentle or Delicate",
                "Only on the setting designed for gentle agitation and/or reduced time for delicate items.");

        setupListItem((RelativeLayout)main.findViewById(R.id.handWash),
                "D",
                "Hand Wash",
                "Laundered through the use of water, detergent or soap and gentle hand manipulation.");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_wash),
                "E",
                "Do Not Wash",
                "May not be safely laundered. Possibly dry clean");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_wring),
                "F",
                "Do Not Wring",
                "Do not wring by hand or use rollers on wringer washer. Hang dry, drip dry or dry flat.");

        setupListItem((RelativeLayout)main.findViewById(R.id.bleach_needed),
                "b",
                "Bleach When Needed",
                "Any commercially available bleach product may be used in the laundering process.");

        setupListItem((RelativeLayout)main.findViewById(R.id.nonChlorine_bleach),
                "c",
                "Non-Chlorine Bleach When Needed",
                "Only a non-chlorine, color-safe bleach may be used in the laundering process.");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_bleach),
                "d",
                "Do Not Bleach",
                "No bleach product may be used.");

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
