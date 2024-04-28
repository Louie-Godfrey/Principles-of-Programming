
public class Craps {

	public static Dice firstDice = new Dice();//creates a public Dice(The class on the Dice.java page with all its functions)
	public static Dice secondDice = new Dice();

	//Task 1 |Rolls both dice
	public void shoot()//this method rolls both dice
	{
		firstDice.roll();
		secondDice.roll();
	}

	//Task 1 |Returns the result of the firstDice
	public static Dice getDice1()
	{
		return firstDice;//returns the value of the firstDice
	}

	//Task 1 |Returns the result of the secondDice
	public static Dice getDice2()
	{
		return secondDice;//returns the value of the secondDice
	}

	//Task 2 |Adds both dice values together
	public int addUpScore() 
	{
		int totalValue = firstDice.getFaceValue() + secondDice.getFaceValue();//gets the faceValue(remember Dice.java) from each dice and adds them togther
		return totalValue;
	}

	//Task 3 |Decides the outcome of each roll total
	public String decideOutcome(int total)//The game craps has specific total values that determine if you win or lose
	{
		if (total == 7 || total == 11)//rolling a total of 7 or 11 is a win
		{
			return "You win";
		}
		else if (total == 2 || total == 3 || total == 12) 
		{
			return "You lose";
		}
		else 
		{
			return"Throw again";//if it is any other value (1 to 12) then print this
		}
	}

	//Task 4 - No UNIT TEST FOR THIS ONE - Check the output |Outputs the previouse results into a string
	public String getResults()//here we call many methods made before
	{
		return	"Dice 1 is " + firstDice.getFaceValue() + "\n" +
				"Dice 2 is " + secondDice.getFaceValue() + "\n" +
				"Total is: " + addUpScore() + "\n" + //calls the addUpScore() method 
				"Result is " + decideOutcome(addUpScore());//like the decideOutcome() method this one needs input data, and we need to input the total of the 2 dice, and the addUpScore() method dose just that
	}

	//Task 5 - No UNIT TEST FOR THIS ONE - Check the output |Plays a game of Craps
	public String playCraps()
	{
		String output = getResults() + "\n--------------- \n";//to get a value for the while loop we need to run the getResults() first
		while (decideOutcome(addUpScore()).equals(("Throw again")))//now if the output of decideOutcome() is throw again then loop
		{
			shoot();//make sure to roll the dice each time to change the values
			output = output + getResults() + "\n--------------- \n";//now append the new getResults() to the end of the old one
		}
		return output;
	}

	/*Task 6 Additional tasks - OPTIONAL AND NOT ASSESSED
	Can you add a method that asks the user if they want to play again?
	public ?? playAgain(??){

	}*/



}
