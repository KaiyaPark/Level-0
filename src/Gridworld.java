import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	// Copyright Wintriss Technical Schools 2014
	// Need Gridworld handouts (4 handouts with descriptions of World, Bug, Grid and Location objects. look for
	// laminated sheets.)

	// In this exercise we’ll use OBJECTS and METHODS to make a world that contains bugs and flowers.

	/*
	 * 
	 * 10. [Optional] Use a new class to make an X out of bugs.
	 */
	public static void main(String[] args) {
		World w = new World();
		w.show();
		/*
		Bug b = new Bug();
		Location l = new Location(5, 5);
		w.add(l, b);
		Bug b2 = new Bug();
		b2.setColor(Color.YELLOW);
		Random r = new Random();
		int i = r.nextInt(9);
		Location l2 = new Location(i, i);
		w.add(l2, b2);
		b.turn();
		b.turn();
		Flower f = new Flower();
		Location l3 = new Location(5, 6);
		w.add(l3, f);
		Location l4 = new Location(5, 4);
		w.add(l4, f);
		*/
		for (int j = 0; j < 10; j++) {
			for (int k = 0; k < 10; k++) {
				Location l5 = new Location(j, k);
				Flower f2 = new Flower();
				if (j == k || j+k == 9 ) {
					w.add(l5, f2);
					f2.setColor(Color.white);
				}
			}
		}
	
	}
}
