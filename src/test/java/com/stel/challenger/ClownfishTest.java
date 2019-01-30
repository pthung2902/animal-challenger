package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.helper.Color;
import com.stel.challenger.helper.Size;
import com.stel.challenger.model.fish.Clownfish;

public class ClownfishTest extends AbstractTest{


    Clownfish clownfish;


    @Before
    public void setUp(){
        this.clownfish=new Clownfish();
    }


    @Test
    public void testWalk() {
        clownfish.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSay() {
        clownfish.say();
        assertThat(sysOut.asString(), containsString("Silence"));
    }

    @Test
    public void testSwim() {
        clownfish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        Size size= clownfish.size();
        assertEquals(Size.SMALL,size);
    }

    @Test
    public void testColor() {
        Color color= clownfish.color();
        assertEquals(Color.ORANGE,color);
    }
    
    
    @Test
    public void testJoke() {
        clownfish.joke();
        aassertThat(sysOut.asString(), containsString("the quick brown fox jumps over the lazy dog"));
    }


	private void aassertThat(String asString, Matcher<String> containsString) {
		// TODO Auto-generated method stub
		
	}
}
