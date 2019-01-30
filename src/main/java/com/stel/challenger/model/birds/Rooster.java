package com.stel.challenger.model.birds;

import com.stel.challenger.action.say.RoosterSay;
import com.stel.challenger.model.Bird;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
    	//requirement #3
        this.sayable= new RoosterSay();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
    
    /**
     * requirement #3
     * 
     */
    /*public void say() {
    	//System.out.println("Cock-a-doodle-doo");
    }*/
}
