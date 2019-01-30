package com.stel.challenger.action.say;

import com.stel.challenger.action.impl.sayable.CanSay;

/**
 * How the Rooster say
 * @author fpta-pthung
 *
 */
public class RoosterSay extends CanSay {

    @Override
    public void say() {
        System.out.println(getVoice("rooster"));
    }
}
