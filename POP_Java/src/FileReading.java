
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReading {

	//Task 1 |Reads a name from a file
	public String readName1(String fileName) throws FileNotFoundException//Throws and error if no file is found
	{
		File file = new File(fileName);//This will look for the selected file name
		Scanner fileScan = new Scanner(file);//This will open a scanner in the selected file
		String FirstName = fileScan.nextLine();//Will scan in the first line in the file
		String secondName = fileScan.nextLine();//Will scan in the second line in the file
		fileScan.close();//will close the scanner

		return FirstName + " " + secondName;//adds the 2 variables together
	}

	//Task 2 |Reads a name from a file with a custom exception
	public String readName2(String fileName)
	{
		String firstName = "";//all the variables must be defined outside the try cathc
		String secondName = "";
		String fullName =  "";
		try
		{// opens the try catch
			File file = new File(fileName);
			Scanner fileScan = new Scanner(file);

			firstName = fileScan.nextLine();
			secondName = fileScan.nextLine();

			fullName = firstName + " " + secondName;

			fileScan.close();


		}
		catch(Exception FileNotFoundException)//closes the try catch and will throw the FileNotFoundException error and insted perform the following code
		{
			fullName = "Invalid filename";
		}

		return fullName;
	}

	//Task 3 |Store names from a file in an array
	public String[] readNames(String fileName) throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner fileScan = new Scanner(file);
		String name;

		String[] namesArray = new String[10];//defines the array

		for (int count=0; count<namesArray.length; count+=1)
		{
			name = fileScan.nextLine();//will set name as the first value on the page, then will go to the next line in the next loop
			namesArray[count] = name;//inputs the name into the array
		}
		fileScan.close();//closes the scanner to prevent memory leaks

		return namesArray;
	}

	//Task 4 |Adds all numbers in a file to an array
	public int[] readNumbers1(String fileName) throws FileNotFoundException
	{
		int[] numberArray = new int[20];

		File fileCount = new File(fileName);
		Scanner fileScanCount = new Scanner(fileCount);
		int totalNumbers = 0;
		int number;

		while (fileScanCount.hasNextInt())//will loop while there is more data to read in the file
		{
			fileScanCount.nextInt();//will move the scanner down each loop
			totalNumbers+=1;//and increment the amount of numbers by 1
		}
		fileScanCount.close();

		File file = new File(fileName);
		Scanner fileScan = new Scanner(file);
		for (int count = 0; count < totalNumbers; count+=1)//with the last loop we know how long to loop for to get all the data
		{
			number = fileScan.nextInt();
			numberArray[count] = number;
		}
		fileScan.close();

		return numberArray;
	}

	//Task5 |Adds all numbers in a file to an array ignoring any other data type
	public int[] readNumbers2(String fileName) throws FileNotFoundException, InputMismatchException
	{
		int[] numberArray = new int[20];
		File file = new File(fileName);
		int number;
		Scanner fileScan = new Scanner(file);
		int count = 0;

		while (fileScan.hasNextLine() && count <= 20)//This code is similar to the last task but will not read anything but integers
		{
			if(fileScan.hasNextInt())//if the current value is an int the add it to the array and increment count
			{
				number = fileScan.nextInt();
				numberArray[count] = number;
				count+=1;
			}
			else// if it is anything else (not and integer) then it will skip to the next line
			{
				fileScan.nextLine();
			}

		}

		fileScan.close();

		return numberArray;
	}

	//Task 6 |Reads names and numbers from a file and puts them together in an array
	public String[] readAddressBook(String fileName) throws FileNotFoundException, InputMismatchException
	{
		String[] adressArray = new String[5];
		File file = new File(fileName);
		Scanner fileScan = new Scanner(file);
		int count = 0;

		while (fileScan.hasNextLine())
		{
			adressArray[count] = fileScan.nextLine() + ": " + fileScan.nextLine();//will add odd values in the file to the name and the even to the numbers
			count+=1;
		}
		fileScan.close();

		return adressArray;
	}
}
