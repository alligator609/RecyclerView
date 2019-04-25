package com.example.tahminaakhtar.recyclerview;

/**
 * Created by Tahmina Akhtar on 2/22/2018.
 */

public class RecyclerViewItem {
    private int drawableID;
    private String name;
    private String modelNo;

    public RecyclerViewItem(int drawableID,String name,String modelNo){
        this.drawableID = drawableID;
        this.name = name;
        this.modelNo = modelNo;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public String getName() {
        return name;
    }

    public String getModelNo() {
        return modelNo;
    }
}
