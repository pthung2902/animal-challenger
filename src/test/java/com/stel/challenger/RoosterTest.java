package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.birds.Rooster;

public class RoosterTest extends AbstractTest{


    Rooster rooster;

    @Before
    public void setUp(){
        this.rooster=new Rooster();
    }

    @Test
    public void testFly() {
        rooster.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void testSay() {
        rooster.say();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

}
