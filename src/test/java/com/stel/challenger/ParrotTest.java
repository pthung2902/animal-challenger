package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.action.say.DogSay;
import com.stel.challenger.model.animals.Cat;
import com.stel.challenger.model.birds.Duck;
import com.stel.challenger.model.birds.Parrot;
import com.stel.challenger.model.birds.Rooster;

public class ParrotTest extends AbstractTest {


    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void testParrotLivingWithDog(){
        parrot.setSayable(new DogSay());
        parrot.say();
        assertThat(sysOut.asString(), containsString("Woof,woof"));

    }


    @Test
    public void testParrotLivingWithCat(){
        parrot.liveWith(new Cat());
        parrot.say();
        assertThat(sysOut.asString(), containsString("Meowmeow"));
    }


    @Test
    public void testParrotLivingWithRooster(){
        parrot.liveWith(new Rooster());
        parrot.say();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void testParrotLivingWithDuck(){
        parrot.liveWith(new Duck());
        parrot.say();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

}
