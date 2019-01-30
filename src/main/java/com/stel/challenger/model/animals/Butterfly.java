package com.stel.challenger.model.animals;

import com.stel.challenger.action.impl.flyable.CanFly;
import com.stel.challenger.action.impl.sayable.CanNotSay;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.sayable= new CanNotSay();
    }
}
