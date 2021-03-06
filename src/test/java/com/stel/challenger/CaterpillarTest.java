package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.animals.Caterpillar;

public class CaterpillarTest extends AbstractTest{

    Caterpillar caterpillar;
    @Before
    public void setUp(){
        this.caterpillar=new Caterpillar();
    }

    @Test
    public void testWalk() {
        caterpillar.walk();
        assertThat(sysOut.asString(), containsString("I am crawling"));
    }

    @Test
    public void testFly() {
        caterpillar.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }
}
