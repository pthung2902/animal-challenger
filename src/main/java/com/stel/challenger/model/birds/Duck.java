package com.stel.challenger.model.birds;

import com.stel.challenger.action.impl.swimmable.CanSwim;
import com.stel.challenger.action.say.DuckSay;
import com.stel.challenger.model.Bird;

public class Duck extends Bird {

    public Duck(){
        this.sayable =new DuckSay();
        this.swimmable= new CanSwim();
    }
    
    /**
     * Requirement #2
     * Implement for how to Duck say
     */
    public void say() {
    	System.out.println("Quack ,Quack");
    }
    
    public void swim() {
    	System.out.println("Duck can swim");
    }
}
