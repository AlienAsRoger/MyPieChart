package com.developer4droid.MyPieChart;

/**
* Created with IntelliJ IDEA.
* User: roger sent2roger@gmail.com
* Date: 07.02.13
* Time: 19:16
*/
public class Games {
	/*
		  "total": 12,
		  "wins": 7,
		  "losses": 5,
		  "draws": 0
	*/
	private int total;
	private int wins;
	private int losses;
	private int draws;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}
}
