package com.stel.challenger.action.say;

import com.stel.challenger.action.impl.sayable.CanSay;

/**
 * Class to simulate how cat say
 * @author fpta-pthung
 *
 */
public class CatSay extends CanSay {
    @Override
    public void say() {
        System.out.println(getVoice("cat"));
    }
}
