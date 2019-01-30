package com.stel.challenger.model;

import com.stel.challenger.action.impl.flyable.CanFly;
import com.stel.challenger.action.impl.sayable.CanSay;
import com.stel.challenger.action.impl.walkable.CanWalk;

/**
 * 
 * @author fpta-pthung
 * The model object for Birds
 */
public class Bird extends Animal {

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.sayable=new CanSay();
    }
    
    //Requirement #1
    //Will replace by interface to catch up for all action-able
    public void fly() {
    	//System.out.println("I am flying");
    	flyable.fly();
     }
    
    
}
