package com.example.saqib.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Saqib on 20-Sep-15.
 */
public class FactBook {
    // Member Variables

    //Declare and Array of facts
    public String[] mfacts = {
            "Ants stretch when they woke up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones, by the time you are an adult you will have 206.",
            "It takes about 8 minutes for Light from the sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some Penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new rabbit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    //Declare and Array of Colors


    // Methods

    public String getFact(){
        String fact = "";
        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];
        return fact;

    }



}
