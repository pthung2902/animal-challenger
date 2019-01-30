package com.stel.challenger.model.animals;

import com.stel.challenger.action.impl.flyable.CanNotFly;
import com.stel.challenger.action.impl.walkable.CrawlWalk;
import com.stel.challenger.model.Animal;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
