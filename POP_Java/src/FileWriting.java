import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;


public class FileWriting {

	//Task 1 |Writes a name to a file
	public String writeYourName(String name) throws IOException
	{
		String fileName = "myNamefile.txt";
		PrintWriter writer = new PrintWriter (new BufferedWriter(new FileWriter(fileName)));// the PrintWriter will take the input name
		{
			Scanner nameScan = new Scanner(name);
			while (nameScan.hasNextLine())//loop till no data left in the file
			{
				String splitName = nameScan.next();//stop at each space as opposed to each line to spilt the name across the file
				writer.println(splitName);//print the split name to the file
			}

			nameScan.close();
		}
		writer.close();
		return fileName;
	}




	//Task 2 |Writes a range of random numbers to a file
	public String writeRandomNumbers(int numberAmount) throws IOException, FileNotFoundException
	{
		int count = 0;
		{
			String fileName = "randomNumbersFileToWrite.txt";
			PrintWriter writer = new PrintWriter (new BufferedWriter(new FileWriter(fileName)));
			{
				while (count < numberAmount && count < 20)//will create the desierd amount if intigers and will not go over 20 values
				{
					int randomNumber = 1000 + new Random().nextInt(9999 - 1000);//will choose a random number between 1000 and 9999
					writer.println(randomNumber);//prints the random number to the file
					count+=1;
				}
			}
			writer.close();
			return fileName;
		}

	}

}