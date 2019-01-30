package com.stel.challenger;

import com.stel.challenger.model.Bird;

/**
 * 
 * @author fpta-pthung
 * The basic solution for challenger
 */
public class Solution {

	public static void main(String[] args) {
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			
			//Requirement #1
			bird.say();
	}

}
