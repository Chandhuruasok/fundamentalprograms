package com.task1.day1;

public class HighScorePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=1500;
		displayHighScorePosition("player1",calculateHighScorePosition(score));
		score=900;
		displayHighScorePosition("player2",calculateHighScorePosition(score));
		score=400;
		displayHighScorePosition("player3",calculateHighScorePosition(score));
		score=50;
		displayHighScorePosition("player4",calculateHighScorePosition(score));

	}
	public static void displayHighScorePosition(String playerName,int position)
	{
		System.out.println(playerName+"managed to get into position"+position+"on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore)
	{
		if(playerScore>=1000)
		{
			return 1;
		}
		else if(playerScore>=500)
		{
			return 2;
		}
		else if(playerScore>=100)
		{
			return 3;
		}
		else
		{
			return 4;
		}
			
	}

}
