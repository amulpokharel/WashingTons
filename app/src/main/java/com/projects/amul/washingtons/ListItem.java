package com.projects.amul.washingtons;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by amulpok on 5/1/17.
 */

public class ListItem extends Fragment{
    //helper method to set the appropriate data
    Typeface wash_font = Typeface.createFromAsset(getContext().getAssets(), "fonts/wash.ttf");

    public void setupListItem(RelativeLayout rl, String mainIcon, String firstLine, String secondLine){
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
