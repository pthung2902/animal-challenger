package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.animals.Butterfly;

public class ButterflyTest extends AbstractTest {


    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }


    @Test
    public void testFly() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSay() {
        butterfly.say();
        assertThat(sysOut.asString(), containsString("Silence"));
    }
}
