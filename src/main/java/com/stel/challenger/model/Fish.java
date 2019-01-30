package com.stel.challenger.model;



import com.stel.challenger.action.impl.sayable.CanNotSay;
import com.stel.challenger.action.impl.swimmable.CanSwim;
import com.stel.challenger.action.impl.walkable.CanNotWalk;
import com.stel.challenger.helper.Color;
import com.stel.challenger.helper.Size;

public class Fish  extends Animal{

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimmable=new CanSwim();
        this.walkable =new CanNotWalk();
        this.sayable= new CanNotSay();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
