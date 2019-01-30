package com.stel.challenger.action.say;

import com.stel.challenger.action.impl.sayable.CanSay;

/**
 * Dog say ability
 * @author fpta-pthung
 *
 */
public class DogSay extends CanSay {
    @Override
    public void say() {
        System.out.println(getVoice("dog"));
    }
}
