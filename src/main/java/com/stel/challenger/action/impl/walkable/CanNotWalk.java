package com.stel.challenger.action.impl.walkable;

import com.stel.challenger.action.Walkable;

public class CanNotWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}
