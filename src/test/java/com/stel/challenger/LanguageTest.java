package com.stel.challenger;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import com.stel.challenger.model.birds.Rooster;

public class LanguageTest extends AbstractTest {


    Rooster rooster;

    @Before
    public void setUp(){
        this.rooster= new Rooster();
    }


    @Test
    public void testEnglish(){
        rooster.say();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }


    @Test
    public void testVietNamese(){
        Locale.setDefault(Locale.FRENCH);
        rooster.say();
        assertThat(sysOut.asString(), containsString("cocorico"));
    }
}
