package com.stel.challenger.model;

import com.stel.challenger.action.Flyable;
import com.stel.challenger.action.Sayable;
import com.stel.challenger.action.Walkable;
import com.stel.challenger.action.impl.flyable.CanFly;
import com.stel.challenger.action.impl.sayable.CanSay;
import com.stel.challenger.action.impl.swimmable.CanSwim;
import com.stel.challenger.action.impl.walkable.CanWalk;

/*
 * Abstract Animal class 
 * Contain all behavior animal can do 
 */
public abstract class Animal {

	 	protected Walkable walkable;
	    protected Flyable flyable;
	    protected Sayable sayable;
	    protected CanSwim swimmable;

	    public Animal(){
	    	this.walkable=new CanWalk();
	    	flyable = new CanFly();
	    	sayable = new CanSay();
	    	swimmable = new CanSwim();
	    }
	    
	    public void walk(){
	        this.walkable.walk();
	    }

	    public void fly() {
	    	//System.out.println("Animal can fly");
	        this.flyable.fly();
	    }

	    /*
	     * Requirement #2
	     * Define the method to let animal say something
	     */
	    public void say() {
	    	//System.out.println("Animal say something");
	        this.sayable.say();
	    }

	    public void swim() {
	    	//System.out.println("Animal can swim");
	        this.swimmable.swim();
	    }


	    public Walkable getWalkable() {
	        return walkable;
	    }

	    public void setWalkable(Walkable walkable) {
	        this.walkable = walkable;
	    }

	    public Flyable getFlyable() {
	        return flyable;
	    }

	    public void setFlyable(Flyable flyable) {
	        this.flyable = flyable;
	    }

	    public Sayable getSayable() {
	        return sayable;
	    }

	    public void setSayable(Sayable singable) {
	        this.sayable = singable;
	    }

	    public CanSwim getSwimmable() {
	        return swimmable;
	    }

	    public void setSwimmable(CanSwim swimmable) {
	        this.swimmable = swimmable;
	    }
	    
	    
    
}
