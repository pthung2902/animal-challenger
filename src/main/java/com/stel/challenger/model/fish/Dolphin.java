package com.stel.challenger.model.fish;

import com.stel.challenger.action.impl.swimmable.GreatSwimmers;
import com.stel.challenger.model.Animal;
import com.stel.challenger.model.Fish;

public class Dolphin extends Animal {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.sayable = this.fish.getSayable();
    }

}
