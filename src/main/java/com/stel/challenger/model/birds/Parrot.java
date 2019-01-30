package com.stel.challenger.model.birds;

import com.stel.challenger.action.say.CatSay;
import com.stel.challenger.action.say.DogSay;
import com.stel.challenger.action.say.RoosterSay;
import com.stel.challenger.model.Animal;
import com.stel.challenger.model.Bird;
import com.stel.challenger.model.animals.Cat;
import com.stel.challenger.model.animals.Dog;

/**
 * Requirement #4
 * @author fpta-pthung
 *
 */
public class Parrot extends Bird {


    public Parrot(){}
    
    public void liveWith(Animal animal) {
    	if(animal instanceof Dog) {
    		sayable = new DogSay();
    	}else if(animal instanceof Cat) {
    		sayable = new CatSay();
    	}else if (animal instanceof Rooster) {
    		sayable = new RoosterSay();
    	}
    		
    }
    
}
