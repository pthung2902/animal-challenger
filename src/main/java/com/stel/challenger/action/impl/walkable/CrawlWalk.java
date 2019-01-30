package com.stel.challenger.action.impl.walkable;

import com.stel.challenger.action.Walkable;

public class CrawlWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
