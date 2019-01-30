package com.stel.challenger.model.animals;

import com.stel.challenger.action.impl.sayable.CanSay;
import com.stel.challenger.model.Animal;

public class Frog extends Animal {

    public Frog(){
        this.sayable =new CanSay();
    }

}
