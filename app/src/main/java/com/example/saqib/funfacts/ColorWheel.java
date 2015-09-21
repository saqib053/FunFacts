package com.example.saqib.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Saqib on 20-Sep-15.
 */
public class ColorWheel {

    // Member Variables

    //Declare and Array of facts
    public String[] mColor = {

            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
    };

    // Methods

    public int getColor(){
        String color = "";
        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(mColor.length);
        color = mColor[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }

}
