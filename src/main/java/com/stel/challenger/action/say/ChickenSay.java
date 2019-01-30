package com.stel.challenger.action.say;

import com.stel.challenger.action.impl.sayable.CanSay;

/**
 * class to simulate how the chicken say
 * @author fpta-pthung
 *
 */
public class ChickenSay extends CanSay{
    @Override
    public void say() {
        System.out.println(getVoice("chicken"));
    }

}
