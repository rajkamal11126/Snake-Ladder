//Welcome to Snake Ladder Problem

public class SnakeLadder
{
	//constrants
	final static int INITIAL_POSITION=0;
	final static int FINAL_POSITION=100;
	final static int NO_PLAY=0;
	final static int LADDER=1;
	final static int SNAKE=2;
	static int playerPosition=INITIAL_POSITION;
	static int numOfPlayer=1;
	static int counter=0;
	static double diceNumber=Math.floor(Math.random()*10)%6+1;
	public static void playGame()
	{
		counter=counter+1;
		double option=Math.floor(Math.random()*10)%3;
		switch((int)option)
		{
			case NO_PLAY :
				playerPosition=playerPosition;
				break;
			case LADDER :
				playerPosition=playerPosition + (int)diceNumber;
				break;
			case SNAKE :
				playerPosition=playerPosition - (int)diceNumber;
		}
	}
	//main
	public static void main(String[] args)
	{
		playGame();
	}
}
