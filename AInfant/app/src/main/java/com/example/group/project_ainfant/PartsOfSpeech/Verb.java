package com.example.group.project_ainfant.PartsOfSpeech;

/**
 * Created by eronj on 10/18/2016.
 */

//holds fields relative to a verb
public class Verb {
    //used to determine type value
    final private int ACTIVE = 0;
    final private int PASSIVE = 1;

    int actVPass;

    //if initialized with no parameters
    public void verb() {
        actVPass = ACTIVE;
    }

    public void verb(int actVPass){
        //need to fill in
    }

}