/**
 * 
 * @author Philip Wellener
 * Comp Sci Period 7
 *
 */
import java.util.Scanner; 
public class TargetValue 
{

	public static void main(String[] args) 
	{
		
		Scanner in= new Scanner(System.in);
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		boolean guess = true;
		while (guess) 
		{
			System.out.print("Choose a target value for the sum of two dice rolls: ");
			int target =in.nextInt();
			int num1 = die1.roll();
			int num2 = die2.roll();
			if (num1+num2 != target) 
			{
				System.out.println("You rolled a " + num1 + " and a "+ num2 + " which equals " + (num1 + num2) + ". Try again.");
			}
			else if (num1+num2 == target)
			{
				System.out.println("You rolled a " + num1 + " and a " + num2 + ". This equals " + target + ". You win.");
				System.out.println("This took you " + die1.getRolls() + " tries.");
				guess = false;
			}
			

		}
	}
}