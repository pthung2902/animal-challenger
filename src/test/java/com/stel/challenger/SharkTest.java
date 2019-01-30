package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.helper.Color;
import com.stel.challenger.helper.Size;
import com.stel.challenger.model.Fish;
import com.stel.challenger.model.fish.Clownfish;
import com.stel.challenger.model.fish.Dolphin;
import com.stel.challenger.model.fish.Shark;

public class SharkTest extends AbstractTest {


    Shark shark;


    @Before
    public void setUp(){
        shark=new Shark();
    }


    @Test
    public void testWalk() {
        shark.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSay() {
        shark.say();
        assertThat(sysOut.asString(), containsString("Silence"));
    }

    @Test
    public void testSwim() {
        shark.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        Size size= shark.size();
       assertEquals(Size.LARGE,size);
    }

    @Test
    public void testColor() {
        Color color= shark.color();
        assertEquals(Color.GREY,color);
    }
    
    @Test
    public void testEat() {
        shark.eat((Fish)new Clownfish());
        assertThat(sysOut.asString(), containsString("I am eating"));
    }

}
