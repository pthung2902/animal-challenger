package com.stel.challenger.action.impl.flyable;

import com.stel.challenger.action.Flyable;

public class CanNotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
