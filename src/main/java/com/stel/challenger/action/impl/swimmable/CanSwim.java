package com.stel.challenger.action.impl.swimmable;

import com.stel.challenger.action.Swimmable;

public class CanSwim implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
