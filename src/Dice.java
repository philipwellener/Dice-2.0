/**
 * 
 * @author Philip Wellener
 * Comp Sci Period 7
 *
 */
public class Dice 
{

	private int rolls;
	public Dice() 
	{
		rolls = 0;
	}

	public int roll() 
	{
		int face = (int) (Math.random() * 6 + 1);
		rolls += 1;
		return face;
	}	
	public void reset() 
	{
		rolls = 0;
	}
	public int getRolls() 
	{
		return rolls;
	}
	
}