package com.god;

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

/*
 *  OO principle
 *  -----------------
 *  
 *  " closed for modification & open for extension "
 *  
 *  
 * 
 */

public class God {
	//
	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing livingThing) {
		livingThing.eat();
		livingThing.sleep();
//		if (livingThing instanceof Human) {
			Human human = (Human) livingThing;
			human.study();
//		}
		livingThing.work();
	}

}
