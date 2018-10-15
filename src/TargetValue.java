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
		int target = 0;
		boolean valid = true;
		while (valid)
		{
			System.out.print("Choose a target value for the sum of two dice rolls: ");
			int target1 =in.nextInt();
			if (target1 >= 2)
			{
				if (target1 <= 12)
				{
					target = target1;
					valid = false;
				}
				else
					System.out.println("That is not a valid target value");
					
			}
			else 
				System.out.println("That is not a valid target value");
		
		}

		boolean guess = true;
		while (guess) 
		{

			int num1 = die1.roll();
			int num2 = die2.roll();
			if (num1+num2 != target) 
			{
				System.out.println("You rolled a " + num1 + " and a "+ num2 + " which equals " + (num1 + num2) + ".");
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