package com.hackerRank.programs.in;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{
	public int compare(Player p1, Player p2) {
		if(p1.score != p2.score) {
			return p2.score - p1.score;
		}
		return p1.name.compareTo(p2.name);
		
	}
}

class Player{
	int score;
	String name;
	
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

 class JavaComparator {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		Player[] player = new Player[n];
		Checker checker = new Checker();
		
		for(int i = 0; i<player.length;i++) {
			player[i] = new Player(sc.next(), sc.nextInt());
					
		}
		sc.close();
		
		Arrays.sort(player,checker);
		for(int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
