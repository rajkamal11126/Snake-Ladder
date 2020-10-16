//Welcome to Snake Ladder Problem

public class SnakeLadder
{
	final static int INITIAL_POSITION=0;
	final static int numOfPlayer=1;
	static double rollDie=Math.floor(Math.random()*10)%6+1;
	public static void rollDie()
	{
		System.out.println(rollDie);
	}
	public static void main(String[] args)
	{
		rollDie();
	}
}
