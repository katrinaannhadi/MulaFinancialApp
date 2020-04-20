package org.mula.finance.Models;

import android.content.Intent;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

//class to hold intents to different activities etc
public class IntentLink extends ExpandableGroup<Category> {



    private String name;
    private Intent intent;
    private int drawable;
    private int colourTint;

    public IntentLink (String name, Intent intent, int drawable, int colourTint, List<Category> items){
        super(name, items);
        this.name = name;
        this.intent = intent;
        this.drawable = drawable;
        this.colourTint = colourTint;
    }



    public String getLinkName() {
        return name;
    }

    public Intent getLinkIntent() {
        return intent;
    }

    public int getLinkDrawable() {
        return drawable;
    }

    public int getLinkColourTint() {
        return colourTint;
    }
}
