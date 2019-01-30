package com.stel.challenger.model.birds;

import com.stel.challenger.action.Flyable;
import com.stel.challenger.action.say.ChickenSay;
import com.stel.challenger.model.Bird;

public class Chicken extends Bird implements Flyable {

    public  Chicken(){
        this.sayable=new ChickenSay();
    }
    
    /**
     * requirement #2
     * Simulate Chicken say
     */
    /*public void say() {
    	System.out.println("Cluck, cluck");
    }
    
    
    public void fly() {
    	System.out.println("Can not fly");
    }*/
}
