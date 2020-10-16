//Welcome to Snake Ladder Problem

public class SnakeLadder
{
	//constrants
	final static int INITIAL_POSITION=0;
	final static int FINAL_POSITION=0;
	final static int NO_PLAY=0;
	final static int LADDER=1;
	final static int SNAKE=2;
	static int playerOnePosition=INITIAL_POSITION;
	static int numOfPlayer=1;
	static int counter=0;
	static double diceNumber=Math.floor(Math.random()*10)%6+1;

	//check random
	public static void playGame()
	{
		counter=counter+1;
		double option=Math.floor(Math.random()*10)%3;
		switch((int)option)
		{
			case NO_PLAY :
				playerOnePosition=playerPosition;
				break;
			case LADDER :
				playerOnePosition=playerPosition + (int)diceNumber;
				break;
			case SNAKE :
				playerOnePosition=playerPosition - (int)diceNumber;
		}
		checkReachedWin();
	}
	//check Win Position
	public static void checkReachdWin()
	{
		if(playerOnePosition <= INITIAL_POSITION)
		{
			playerOnePosition=INITIAL_POSITION;
		}
		else if(playerOnePosition >= FINAL_POSITION)
		{
			playerOnePosition=FINAL_POSITION;
		}
	}
	//main
	public static void main(String[] args)
	{
		while(playerOnePosition < FINAL_POSITION)
		{
			playGame();
		}
	}
}

