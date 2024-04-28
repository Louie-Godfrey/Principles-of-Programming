import java.util.Random;

public class Dice {

	private int faceValue;//declares a integer value that any method in this class can call

	//Task 1 |Rolls a dice
	public void roll()
	{
		faceValue = new Random().nextInt(6)+1;//sets the faceValue to a random num from 1 to 6 (Like a dice)
	}

	//Task 1 - second bit |Gets the value of the roll
	public int getFaceValue()
	{
		return faceValue;//returns the faceValue variable so it can be used in other methods
	}

	//Task 2 |Converts the result to a String
	public String toString()
	{
		return Integer.toString(faceValue);//Integer.toString() converts the interger of faceValue to a string so it can be used in an output easer
	}

}
