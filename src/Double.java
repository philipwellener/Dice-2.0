/**
 * 
 * @author Philip Wellener
 * Comp Sci Period 7
 *
 */
public class Double 
{
	public static void main(String[] args) 
	{
	Dice die1 = new Dice();
	Dice die2 = new Dice();
	boolean doubles = true;
	
	while (doubles) 
	{
		int num1= die1.roll();
		int num2= die2.roll();
		System.out.println("You rolled a "+ num1 + " and a "+ num2);
		
		if (num1 == num2)
				doubles = false;
	}
	System.out.print("You rolled a double after "+ die1.getRolls()+ " tries.");
		
	}
}