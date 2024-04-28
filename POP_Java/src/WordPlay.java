import java.util.Random;
/**
 * 
 * WordPlay class 
 * used to explore if and loop statements
 * @Since 2019
 */

public class WordPlay {

	//Task1 |Returns the word that comes first in the alphabet
	public String whatComesFirst(String word1, String word2)
	{
		int compare = word1.compareToIgnoreCase(word2);//int compare will now perform this method (Compare the to names together to see which come first in the alphabet) it will out put bigger than 0 if word1 is first 
		String first = null;
		String last = null;

		if (compare > 0)
		{
			first = word2;
			last = word1;
		}
		else if (compare < 0)
		{
			first = word1;
			last = word2;
		}
		else
		{
			return word1 + " is the same as " + word2;
		}



		return first + " comes before " + last + " in the alphabet" ;
	}

	//Task 2 |Flips a string backwards
	public String backwardsString(String wordForward)
	{
		String wordBackwards = new StringBuffer(wordForward).reverse().toString();//StringBuffer is like a String but can be modified (eg. reversing the String)
		return wordBackwards;
	}

	//task 3 |Adds names and numbers together in an array
	public String[] addressBook(String[] names, String[] numbers)
	{
		String[] namesNumbers = new String[names.length];
		for(int count = 0; count < names.length; count+=1) 
		{
			namesNumbers[count] = names[count] + " " + numbers[count];//adds each value from each array together
		}

		return namesNumbers;	
	}

	//Task 4 |A game of rock paper scissors with a computer
	public String rockPaperScissors(String userChoise) 
	{
		String[] computerChoises = {"rock","paper","scissors"};
		int randomNumber = new Random().nextInt(3);//random number from 0 to 3
		String computerChoise = computerChoises[randomNumber];//Chooses from the array of computer choices
		String compWin = "COMPUTER wins";
		String userWin = "user wins";
		String result = "";

		if(userChoise == computerChoise)// if the Chooses are the same the output: 
		{
			result = "it is a draw";
		}
		else if(userChoise == "rock" && computerChoise == computerChoises[2])//if the user chooses rock and the computer Chooses paper then the user wins
		{
			result = userWin;
		}
		else if(userChoise == "rock" && computerChoise == computerChoises[1]) 
		{
			result = compWin;
		}

		else if(userChoise == "paper" && computerChoise == computerChoises[0])
		{
			result = userWin;
		}
		else if(userChoise == "paper" && computerChoise == computerChoises[2]) 
		{
			result = compWin;
		}

		else if(userChoise == "scissors" && computerChoise == computerChoises[1])
		{
			result = userWin;
		}
		else if(userChoise == "scissors" && computerChoise == computerChoises[0]) 
		{
			result = compWin;
		}

		String output = "USER:" + userChoise + " vs COMP:" + computerChoise + " " + result;

		return output;

	}

}
