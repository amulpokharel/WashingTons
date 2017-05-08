package com.projects.amul.washingtons;

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

    //3
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View main =  inflater.inflate(R.layout.washer_fragment, container, false);

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_normal),
                R.drawable.s_mw_norm,
                "Machine Wash, Normal",
                "May be laundered with the hottest available water, detergent or soap, and agitation");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_cold),
                R.drawable.s_mw30cd,
                "Machine Wash, Cold",
                "Initial water temperature should not exceed 30C or 65 to 85F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_warm),
                R.drawable.s_mw40cd,
                "Machine Wash, Warm",
                "Initial water temperature should not exceed 40C or 105F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot1),
                R.drawable.s_mw50cd,
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 50C or 120F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot2),
                R.drawable.s_mw60cd,
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 60C or 140F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot3),
                R.drawable.s_mw70cd,
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 70C or 160F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_hot4),
                R.drawable.s_mw95cd,
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 95C or 200F.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_perm),
                R.drawable.s_mw_ppres,
                "Machine Wash, Permanent Press",
                "Only on Permanent Press with cool down or cold rinse prior to reduced spin.");

        setupListItem((RelativeLayout)main.findViewById(R.id.mWash_gentle),
                R.drawable.s_mwgentle,
                "Machine Wash, Machine Wash, Gentle or Delicate",
                "Only on the setting designed for gentle agitation and/or reduced time for delicate items.");

        setupListItem((RelativeLayout)main.findViewById(R.id.handWash),
                R.drawable.s_hndw,
                "Hand Wash",
                "Laundered through the use of water, detergent or soap and gentle hand manipulation.");

        setupListItem((RelativeLayout)main.findViewById(R.id.doNotWash),
                R.drawable.s_w_donot,
                "Do Not Wash",
                "May not be safely laundered. Possibly dry clean");

        setupListItem((RelativeLayout)main.findViewById(R.id.bleachNeeded),
                R.drawable.s_b_any,
                "Bleach When Needed",
                "Any commercially available bleach product may be used in the laundering process.");

        setupListItem((RelativeLayout)main.findViewById(R.id.nonChlorineBleach),
                R.drawable.s_b_nonchl,
                "Non-Chlorine Bleach When Needed",
                "Only a non-chlorine, color-safe bleach may be used in the laundering process.");

        setupListItem((RelativeLayout)main.findViewById(R.id.doNotBleach),
                R.drawable.s_b_dont_s,
                "Do Not Bleach",
                "No bleach product may be used.");

        return main;
    }

    private void setupListItem(RelativeLayout rl, int imgSrc, String firstLine, String secondLine){
        ((ImageView)rl.findViewById(R.id.mainIcon))
                .setImageResource(imgSrc);
        ((TextView)rl.findViewById(R.id.firstLine))
                .setText(firstLine);
        ((TextView)rl.findViewById(R.id.secondLine))
                .setText(secondLine);
    }
}
