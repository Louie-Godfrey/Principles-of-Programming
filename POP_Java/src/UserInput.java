import java.util.Scanner;

public class UserInput {

	//Task 1 |Takes a name from the keyboard
	public String sayHello()
	{
		Scanner userInput = new Scanner(System.in);//opens a scanner for the system.in(The default input for your pc, most likely a keyboard)
		String userName;

		System.out.print("Enter your name here:");
		userName = userInput.next();//will wait for you to input data/your name
		userInput.close();
		return "Hello " + userName;
	}

	//Task 2 |Takes 10 numbers from the keyboard and puts them in an array
	public int[] readTenNumbers()
	{
		Scanner userInput = new Scanner(System.in);
		int num = 0;

		int[] tenNumbersArray = new int[10];

		for (int count=0; count<tenNumbersArray.length; count+=1)//will loop for the length of the array
		{
			int amount = count+1;
			System.out.print("Enter number " + amount + " here:");
			num = userInput.nextInt();//will take a number you input here and place it in the array
			tenNumbersArray[count] = num;
		}
		userInput.close();

		return tenNumbersArray;
	}

	//Task 3 |Takes 10 names from the keyboard and puts them in an array
	public String[] readTenNames()
	{
		Scanner userInput = new Scanner(System.in);
		String name;

		String[] tenNamesArray = new String[10];

		for (int count=0; count<tenNamesArray.length; count+=1)
		{
			int amount = count+1;
			System.out.print("Enter name " + amount + " here:");
			name = userInput.nextLine();//Takes a input name from you and puts it in the array
			tenNamesArray[count] = name;
		}
		userInput.close();

		return tenNamesArray;
	}

}
