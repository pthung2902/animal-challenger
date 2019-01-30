package com.stel.challenger.model.fish;



import com.stel.challenger.helper.Color;
import com.stel.challenger.helper.Size;
import com.stel.challenger.model.Fish;

public class Clownfish extends Fish {

    public Clownfish(){
        this.color=Color.ORANGE;
        this.size=Size.SMALL;
    }
    
    public void joke() {
    	System.out.println("the quick brown fox jumps over the lazy dog");
    }
}
