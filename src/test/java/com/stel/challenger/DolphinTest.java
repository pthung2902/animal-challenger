package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.fish.Dolphin;

public class DolphinTest extends AbstractTest {


    Dolphin dolphin;
    @Before
    public void setUp(){
        this.dolphin=new Dolphin();
    }


    @Test
    public void testWalk() {
        dolphin.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSay() {
        dolphin.say();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }


    @Test
    public void testSwim() {
        dolphin.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}


