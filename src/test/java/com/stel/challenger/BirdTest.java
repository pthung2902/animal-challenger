package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.stel.challenger.model.Bird;

/**
 * Unit testing class for Bird
 * @author fpta-pthung
 * Requirement #1 
 */
public class BirdTest {


    @Rule
    public SystemOutResource sysOut = new SystemOutResource();
    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    /**
     * Test walking ability of bird
     * Ref Req #1
     */
    public void testWalk() {
        bird.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }


    @Test
    /**
     * Test flying ability of bird
     * Ref Req #1
     */
    public void testFly() {
        bird.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    /**
     * Test Sing ability of bird
     * Ref Req #1
     */
    public void testSing() {
        bird.say();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }



}
