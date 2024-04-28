/**

a * MyArrays class This class contains all the array tasks following the week 13
 * lecture.
 * 
 * @author melanie
 * @since 2019
 */

import java.util.Random;

public class MyArrays {

	// Task 1 |Adds up numbers
	public int addUpNumbers(int int1, int int2, int int3, int int4, int int5)//Here each input is assigned a data type(int)
	{
		int sum = int1 + int2 + int3 + int4 + int5;
		return sum;
	}

	//Task 2 |Adds up numbers in an array
	public int addUpNumbers(int[] array1)
	{
		int arrayTotal = array1[0] + array1[1] + array1[2] + array1[3] + array1[4];//each value in the array is added together
		return arrayTotal;		
	}



	//Task 3 |Calculates the Average of numbers in an array
	public double averageOfNumbers(int[] array2)
	{
		double arrayTotal = array2[0] + array2[1] + array2[2] + array2[3] + array2[4];
		double arrayLength = array2.length;//.length gets the length of array2
		double arrayAverage = arrayTotal / arrayLength;
		return arrayAverage;
	}


	//Task 4 |Converts the first array from Fahrenheit to Celsius
	public int[] convertToCelsius(int[] arrayFahrenheit)
	{
		int[] arrayCelsius = new int[arrayFahrenheit.length];

		for (int arrayCount = 0; arrayCount < arrayFahrenheit.length ; arrayCount+=1)//This is a for loop and will increment till it reches the value defined (the Length of the array))
		{
			arrayCelsius[arrayCount] = (arrayFahrenheit[arrayCount] - 32) * 5 / 9; 
		}

		return arrayCelsius;
	}


	//Task 5 |Puts unitMarks in an array
	public String[] unitMarks(int[] arrayMarks)
	{

		String[] arrayCodes = {"APP","BSAD","CF","DAD","N&CS","POP"};//This is an array with data defined in it already,0 - 5

		String[] arrayMarksCodes = new String[arrayMarks.length + 1];//Here is a new array with no data but will be the same length as the other one

		for (int arrayCount = 0; arrayCount < arrayMarks.length ; arrayCount+=1)
		{
			arrayMarksCodes[arrayCount] = arrayCodes[arrayCount] + ":" + arrayMarks[arrayCount];// This will take the data from both tables and enter them into the empty array
		}
		double arrayTotal = 0;


		for (int arrayCount2 = 0; arrayCount2 < arrayMarks.length;arrayCount2+=1)
		{
			arrayTotal = arrayTotal + arrayMarks[arrayCount2];
		}
		double arrayLength = arrayMarks.length;
		double arrayAverage = arrayTotal / arrayLength;

		String arrayAverageString = String.valueOf(arrayAverage);//This converts the Integer of array average to string 

		arrayMarksCodes[arrayMarks.length] = "Average:" + arrayAverageString ;

		return arrayMarksCodes;
	}


	//Task 6 |Selects a random value from an array
	public String andTheWinnerIs(String[] names)
	{
		int randomNum = new Random().nextInt(names.length); //This code generates a random value from 0 to 6(The length of the array)

		String winner = names[randomNum];//This chooses a random value from the array

		return winner;
	}

}