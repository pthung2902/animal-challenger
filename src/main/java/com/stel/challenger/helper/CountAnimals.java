package com.stel.challenger.helper;

import com.stel.challenger.action.impl.flyable.CanFly;
import com.stel.challenger.action.impl.sayable.CanSay;
import com.stel.challenger.action.impl.swimmable.CanSwim;
import com.stel.challenger.action.impl.walkable.CanWalk;
import com.stel.challenger.model.Animal;

public class CountAnimals {



    public int  walkableCount(Animal animals[]) {
        int count=0;
        if(animals.length==0){
            return count;
        }

        for(Animal animal:animals){
            if(animal.getWalkable()!=null &&  animal.getWalkable() instanceof CanWalk){
                count++;
            }
        }
        return count;
    }

    public int flyableCount(Animal[] animals) {
        int count=0;
        for(Animal animal:animals){
            if(animal.getFlyable()!=null
                    && animal.getFlyable() instanceof CanFly){
                count++;
            }
        }
        return count;
    }

    public int singableCount(Animal[] animals) {
        int count=0;
        for(Animal animal:animals){
            if(animal.getSayable()!=null
                    && animal.getSayable() instanceof CanSay){
                count++;
            }
        }
        return count;
    }

    public int swimmableCount(Animal[] animals) {
        int count=0;
        for(Animal animal:animals){
            if(animal.getSwimmable()!=null
                    && animal.getSwimmable() instanceof CanSwim){
                count++;
            }
        }
        return count;
    }
}
