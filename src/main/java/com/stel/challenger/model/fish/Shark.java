package com.stel.challenger.model.fish;

import com.stel.challenger.helper.Color;
import com.stel.challenger.helper.Size;
import com.stel.challenger.model.Fish;

public class Shark  extends Fish {


    public  Shark(){
        this.size= Size.LARGE;
        this.color=Color.GREY;
    }
    
    public void eat(Fish fish) {
    	System.out.println("I am eating " + fish.getClass().toString());
    }
}
