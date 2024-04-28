/**
 * Salary class This class contains all the Salary tasks following the week 13
 * lecture.
 * 
 * @author melanie
 * @since 2019
 */

import java.text.DecimalFormat;


public class Salary {

	// Task 1 |Increases the salary
	public int salaryIncrease(int salary) {
		int newSalary;
		newSalary = salary + 200;//Just adds 200 to the value
		return newSalary;
	}

	// Task 2 |Increases the salary with a decimal
	public double salaryIncrease(double salary) {
		double newSalary;
		newSalary = salary + 200.50;//Same as task 1 but using double to include decimals
		return newSalary;
	}

	// task 3 |Increases the salary by a percentage
	public double salaryIncrease(double salary, int percent) {
		double newSalary;
		newSalary = salary * ((percent / 100.0) + 1); //converts the Interger percent to decimal to be multiplied by salary
		return newSalary;
	}

	// Task 4 |Calculates pay with tax and pension removed
	public double calculatePay(double salary) {

		double tax = salary * .15;//The value of tax is 15% of salary
		double pension = salary * .13;//The value of pension is 13% of salary

		double newSalary;
		newSalary = (salary - (tax + pension)) / 12;// The new salary is /12 after tax and pension
		return newSalary;
	}

	// Task 5 |Formats currency to have 2 decimal place and a £ symbol
	public String formatCurrency(double mySalary)
	{
		DecimalFormat formatter = new DecimalFormat ("###,###,##0.00");//Formats the currency to have 2 decimal place, the # are stand-ins for any value
		String formattedsalary = "£" + formatter.format(mySalary);//Adds a £ to the front of the data
		return formattedsalary;			
	}

}
