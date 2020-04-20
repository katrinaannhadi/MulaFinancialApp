package org.mula.finance.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Category implements Parcelable {
    public final String name;
    private int category;

    public Category(String name, int category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
    }

}
