import java.util.Random;

/**
 * 
 * LabExample class used to explore if and loop statements
 * 
 */


public class LabExample {


	//Task 1 |Compares two numbers and sees which is higher
	public int highestOfTwo(int number1, int number2)
	{		
		int highestNumber = 0;
		if (number1 > number2)//if the first value is higher than (>) the second the following code will be output
		{
			highestNumber = number1;//sets highest number to number1
		}
		else if (number2 > number1)//same as the first if but comparing number2 to number1
		{
			highestNumber = number2;
		}
		else 
		{
			highestNumber = -1;// if neither are higher the output -1
		}
		return highestNumber;
	}


	//Task 2 |Calculates a grade based on marking bands
	public String calculateGrade(int mark)
	{
		String grade;
		if (mark < 0 ) //checks if the mark is < 0
		{
			grade = "Invalid mark";// the output grade
		}
		else if (mark < 40)//checks if mark is < 40
		{
			grade = "Fail";
		}
		else if (mark < 50) 
		{
			grade ="3rd";
		}
		else if (mark < 60 ) 
		{
			grade = "2ii";
		}
		else if (mark < 70 ) 
		{
			grade = "2i";
		}
		else if (mark < 100 ) 
		{
			grade = "1st";
		}
		else if (mark < 0 ) 
		{
			grade = "Invalid mark";
		}
		else
		{
			grade = "Invalid mark";
		}
		return grade;
	}


	//Task 3 |A game of heads or tails
	public String headsOrTails(String input)
	{

		int randomNumber =  new Random().nextInt(2); //random number from 0 to 2
		int coinFlipHeads = 0;
		int coinFlipTails = 0;
		if (randomNumber == 1)//if the random number is 1 set the coinFlipHeads var to 1
		{
			coinFlipHeads = 1;
		}
		else
		{
			coinFlipTails = 1;
		}

		String result = null;
		if (coinFlipHeads == 1 && input == "heads")//if the random number was 1 aka heads and(&&) the user choose heads output String
		{
			result = "Correct: you guessed heads and I flipped heads";
		}
		else if (coinFlipTails == 1 && input == "tails")
		{
			result = "Correct: you guessed tails and I flipped tails";
		}
		else if (coinFlipTails == 1 && input == "heads")
		{
			result = "Incorrect: you guessed heads and I flipped tails";
		}
		else
		{
			result = "Incorrect: you guessed tails and I flipped heads";
		}
		return result;
	}

	//Task 4 |Adds all numbers from 1 to a chosen value
	public int sumFromOneToWhat(int inputMax)//inputMax is the top value to sum to
	{		
		int sum = 0;
		for (int count = 1; count < inputMax+1; count+=1)//increment till you reach imputMax+1
		{
			sum = sum + count;//add sum to the sum plus the number in the count
		}

		return sum;
	}

	//Task 5 |Adds all numbers from a chosen value to another chosen value
	public int sumFromWhatToWhat(int inputMin,int inputMax)//now we have a inputMin to start from
	{
		int sum = 0;
		for (int count = inputMin; count < inputMax+1; count+=1)//in a for the first value(int count) is the start so we can just input the variable there
		{
			sum = sum + count;
		}
		return sum;
	}
}