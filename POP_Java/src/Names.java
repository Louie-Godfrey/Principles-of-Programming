
/**
 * Names class This class contains all the String tasks following the week 13
 * lecture.
 * 
 * @author melanie
 * @since 2019
 */

public class Names {

	// Task 1 |Makes the input uppercase
	public String upperCaseName(String uppercase) {
		String names = uppercase.toUpperCase(); //.toUpperCase() converts string from lowercase to uppercase

		return names;
	}

	// Task 2 |Combines two names
	public String fullName(String Firstname, String Surname) {
		return Firstname + " " + Surname; //The 2 variables(Firstname & Surname) are added togther
	}

	// Task 3 |Counts how many letters in a name
	public int letterCount(String Name) {

		int length = Name.length();//Same as before the length of the input is counted

		return length;

	}

	// Task 4 |Checks if two names are the same
	public boolean theSameName(String Name1, String Name2) {
		return (Name1.equalsIgnoreCase(Name2));//The .equalsIgnoreCase command will compare the 2 inputs and return True or False
	}

	// Task 5 |Formats a name in the correct case
	public String properCaseName(String LowerCaseName) {
		String UpperCaseName = LowerCaseName.substring(0, 1).toUpperCase() + LowerCaseName.substring(1).toLowerCase();//So here the command .substring(0, 1).toUpperCase() finds the range of letters to make uppercase and the second command does the same thing to make them lowercase

		return UpperCaseName;
	}

}