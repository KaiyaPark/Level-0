package com.netflix.kaiya;

import javax.swing.JOptionPane;

public class RunnerMovies {
	public static void main(String[] args) {
		Movie m1 = new Movie("Home Alone", 3);
		Movie m2 = new Movie("Pitch Perfect", 5);
		Movie m3 = new Movie("Pitch Perfect 2", 4);
		Movie m4 = new Movie("Zoolander 2", 1);
		Movie m5 = new Movie("Barbie and some stuff", 0);
		JOptionPane.showMessageDialog(null, m1.getTicketPrice());
		NetflixQueue n = new NetflixQueue();
		n.addMovie(m1);
		n.addMovie(m2);
		n.addMovie(m3);
		n.addMovie(m4);
		n.addMovie(m5);
		n.printMovies();
		n.sortMoviesByRating();
		System.out.println("The best movie is" + n.getBestMovie());
		System.out.println("The second best movie is" + n.getMovie(1));
		System.out.println("The worst movie is" + n.getMovie(4));
	}
}
