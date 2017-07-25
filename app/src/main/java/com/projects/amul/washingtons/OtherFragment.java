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

public class OtherFragment extends Fragment{
    public static OtherFragment newInstance() {
        return new OtherFragment();
    }


    //setup custom font
    Typeface wash_font;
    //3
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //initialize view + create a typeface for the washer/dryer/other icons
        View main =  inflater.inflate(R.layout.other_fragment, container, false);
        wash_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/wash.ttf");

        //set up data for all the list items
        setupListItem((RelativeLayout)main.findViewById(R.id.iron_Any),
                "e",
                "Iron, Any Temperature, Steam or Dry",
                "Regular ironing may be needed and may be performed at any available temperature with or without steam is acceptable");

        setupListItem((RelativeLayout)main.findViewById(R.id.iron_Low),
                "h",
                "Iron, Low",
                "Regular ironing, steam or dry, may be performed at Low setting (110C, 230F) only");

        setupListItem((RelativeLayout)main.findViewById(R.id.iron_Medium),
                "g",
                "Iron, Medium",
                "Regular ironing, steam or dry, may be performed at Medium setting (150C, 300F)");

        setupListItem((RelativeLayout)main.findViewById(R.id.iron_High),
                "f",
                "Iron, High",
                "Regular ironing, steam or dry, may be performed at High setting (200C, 290F)");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_Not_Steam),
                "j",
                "Do Not Steam",
                "Steam ironing will harm garment, but regular dry ironing at indicated temperature setting is acceptable");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_Not_Iron),
                "i",
                "Do Not Iron",
                "Item may not be smoothed or finished with an iron");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean),
                "k",
                "Dryclean",
                "Dry Clean, any solvent, any cycle any moisture, any heat");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_Any_Solvent),
                "l",
                "Dryclean, Any Solvent",
                "Dry Clean, any solvent. Usually used with other restrictions on proper dry cleaning procedure");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_Petrol),
                "n",
                "Dryclean, Petroleum Solvent Only",
                "Dry Clean using only petroleum solvent. Usually used with other restrictions");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_Trich),
                "m",
                "Dryclean, Any Solvent Except Trichloroethylene",
                "Any dry cleaning solvent other than trichloroethylene may be safely used");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_Short),
                "q",
                "Dryclean, Short Cycle",
                "May be used with A, P, or F solvent restriction");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_Reduced),
                "p",
                "Dryclean, Reduced Moisture",
                "May be used with A, P, or F solvent restriction");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_low),
                "s",
                "Dryclean, Low Heat",
                "May be used with A, P, or F solvent restriction");

        setupListItem((RelativeLayout)main.findViewById(R.id.dryclean_no_steam),
                "r",
                "Dryclean, No Steam",
                "May be used with A, P, or F solvent restriction");

        setupListItem((RelativeLayout)main.findViewById(R.id.do_not_dryclean),
                "o",
                "Do Not Dryclean",
                "Garment may not be commercially drycleaned");

        return main;
    }

    //helper method to set the appropriate data
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
