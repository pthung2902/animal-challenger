package com.stel.challenger.action.say;

import com.stel.challenger.action.impl.sayable.CanSay;

/**
 * Simulate how the Duck say
 * @author fpta-pthung
 *
 */
public class DuckSay extends CanSay {
    @Override
    public void say() {
        System.out.println(getVoice("duck"));
    }
}
