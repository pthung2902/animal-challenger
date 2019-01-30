package com.stel.challenger;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.helper.CountAnimals;
import com.stel.challenger.model.Animal;
import com.stel.challenger.model.Bird;
import com.stel.challenger.model.Fish;
import com.stel.challenger.model.animals.Butterfly;
import com.stel.challenger.model.animals.Cat;
import com.stel.challenger.model.animals.Dog;
import com.stel.challenger.model.animals.Frog;
import com.stel.challenger.model.birds.Chicken;
import com.stel.challenger.model.birds.Duck;
import com.stel.challenger.model.birds.Parrot;
import com.stel.challenger.model.birds.Rooster;
import com.stel.challenger.model.fish.Clownfish;
import com.stel.challenger.model.fish.Dolphin;
import com.stel.challenger.model.fish.Shark;

public class CountingTest extends AbstractTest {

    CountAnimals countAnimals;
    Animal animals[] ;

    @Before
    public  void setUp(){
        this.countAnimals=new CountAnimals();
        animals = new Animal[]{
                new Bird(),  
                new Duck(),  
                new Chicken(), 
                new Rooster(), 
                new Parrot(), 
                new Fish(), 
                new Shark(), 
                new Clownfish(), 
                new Dolphin(), 
                new Frog(), 
                new Dog(), 
                new Butterfly(), 
                new Cat()  
        };
    }

    @Test
    public void testWalkableCount(){
        int count= this.countAnimals.walkableCount(animals);
        assertEquals(8,count);
    }

    @Test
    public void testFlyableCount(){
        int count= this.countAnimals.flyableCount(animals);
        assertEquals(6,count);
    }

    @Test
    public void testSayableCount(){
        int count= this.countAnimals.singableCount(animals);
        assertEquals(8,count);
    }

    @Test
    public void testSwimmableCount(){
        int count= this.countAnimals.swimmableCount(animals);
        assertEquals(5,count);
    }
}
