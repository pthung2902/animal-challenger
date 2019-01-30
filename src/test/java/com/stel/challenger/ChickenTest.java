package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.birds.Chicken;

/**
 * Test the ability of chicken
 * Requirement #2
 * @author fpta-pthung
 *
 */
public class ChickenTest extends AbstractTest {


    Chicken chicken;

    @Before
    public void setUp(){
        this.chicken=new Chicken();
    }

    @Test
    public void testFly() {
        chicken.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void testSay() {
        chicken.say();
        assertThat(sysOut.asString(), containsString("Cluck,cluck"));
    }
}
