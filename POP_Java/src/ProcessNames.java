import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProcessNames {

	//Task 1 |read in all data from a file
	public ArrayList<String> readNames(String fileName) throws FileNotFoundException 
	{
		ArrayList<String> names = new ArrayList<String>();//creates an array list

		File file = new File(fileName);
		Scanner fileScan = new Scanner(file);
		int count =0;
		while (fileScan.hasNextLine())
		{
			String name = fileScan.nextLine();//reads names from the input file
			names.add(count, name);//adds the names to the array list
			count+=1;
		}
		fileScan.close();

		return names;
	}

	//Task 2 |sort the data
	public ArrayList<String> sortNames(ArrayList<String> myNames)
	{
		Collections.sort(myNames);//Collections.sort will sort the names into alphabetical order
		return myNames;
	}


	//Task3 |find name position
	public int findNamePosition(ArrayList<String> myNames, String name)
	{	
		int output = -1;
		for(int count = 0; count < myNames.size(); count+=1)
		{
			if (name.equals(myNames.get(count)))//when the selected name is the same as the input one, output the place in the array(count)
			{
				output = count;
			}
		}
		return output;
	}

	//Task4 |delete name
	public ArrayList<String> deleteName(ArrayList<String> myNames, String redundantName)
	{
		myNames.remove(redundantName);//the input name(redundantName) is found in the array and removed
		return myNames;
	}


	//Task5 |change name 
	public ArrayList<String> changeName(ArrayList<String> myNames, String redundantName, String newName)
	{
		myNames.set (findNamePosition(myNames, redundantName), newName);//.set will replace the value at the selected position, in this case using the findNamePosition method
		return myNames;
	}

}
