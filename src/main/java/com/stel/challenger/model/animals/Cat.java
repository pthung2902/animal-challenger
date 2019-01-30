package com.stel.challenger.model.animals;

import com.stel.challenger.action.say.CatSay;
import com.stel.challenger.model.Animal;

public class Cat extends Animal {

    public Cat(){
        this.sayable= new CatSay();
    }
}
