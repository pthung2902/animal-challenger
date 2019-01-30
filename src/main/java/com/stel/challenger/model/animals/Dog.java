package com.stel.challenger.model.animals;

import com.stel.challenger.action.say.DogSay;
import com.stel.challenger.model.Animal;

public class Dog extends Animal {

    public Dog(){
        this.sayable = new DogSay();
    }
}
