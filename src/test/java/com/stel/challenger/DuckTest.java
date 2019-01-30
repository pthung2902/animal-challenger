package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.stel.challenger.model.birds.Duck;

public class DuckTest {

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();
    Duck duck;

    @Before
    public void setUp() {
        this.duck=  new Duck();
    }


    @Test
    public void testSay() {
        duck.say();
        assertThat(sysOut.asString(), containsString("Quack ,Quack"));
    }

    @Test
    public void testSwim() {
        duck.swim();
        assertThat(sysOut.asString(), containsString("Duck can swim"));
    }


}
