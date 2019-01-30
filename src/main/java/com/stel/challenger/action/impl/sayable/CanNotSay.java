package com.stel.challenger.action.impl.sayable;

import com.stel.challenger.action.Sayable;

public class CanNotSay implements Sayable {

    @Override
    public void say() {
        System.out.println("Silence..");
    }
}
