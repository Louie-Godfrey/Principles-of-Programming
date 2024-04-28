
/**
 * 
 * Salary calculator class used to explore if and loop statements
 * 
 */

public class SalaryCalculator {


	//Task 1 |Calculates salary based on specific numbers and total salary
	public double salaryTax(double grossSalary)
	{
		double totalSalary = 0;
		double salaryTax;
		if(grossSalary >= 45000)//if the grossSalary is bigger or equal to 45000 then the following code will be ran
		{
			salaryTax = grossSalary*0.50;
			totalSalary = grossSalary - salaryTax;
		}
		else if(grossSalary >= 30000)//These are the different tax bands
		{
			salaryTax = (grossSalary*0.30);
			totalSalary = grossSalary - salaryTax;
		}
		else
		{
			salaryTax = grossSalary*0.15;
			totalSalary = grossSalary - salaryTax;
		}
		return totalSalary;
	}

	//Task 2 |Calculates salary based on tax bands and total salary
	public double calculateNI(double grossSalary, char taxBand)
	{
		double taxBandDouble = 0;
		if(taxBand == 'A')//This if statement just defines the different tax bands, so band A = 12%
		{
			taxBandDouble = 0.12;
		}
		else if(taxBand == 'B') 
		{
			taxBandDouble = 0.0585;
		}
		else if(taxBand == 'C') 
		{
			taxBandDouble = 0.02;
		}
		else
		{
			return grossSalary;
		}

		double netsalary = grossSalary -(grossSalary * taxBandDouble);//this just calculates the net salary after tax
		return netsalary;
	}

	//Task 3 |Calculates the total of all the salaries in the array.
	public double salaryTotal(double[] salaries)
	{
		double salarySum = 0;
		for (int count = 0; count <= salaries.length-1; count+=1)
		{
			salarySum = salaries[count] + salarySum;
		}
		return salarySum;
	}

	//Task 4 |Calculates the average of the array
	public double salaryAverage(double[] salaries)
	{
		double arrayTotal = 0;
		for (int count = 0; count <= salaries.length-1; count+=1)
		{
			arrayTotal = salaries[count] + arrayTotal;//This code adds all the salaries in the array, so we can calculate the mean average
		}


		double arrayLength = salaries.length;//finds the array length
		double arrayAverage = arrayTotal / arrayLength;
		return arrayAverage;
	}


	//Task5 |Adds a percentage value of a salary to the salary to get a new salary
	public double[] salaryIncrease(double[] salaries)
	{
		double[] newSalaries = new double [salaries.length];//here is the array for the updated values
		double[] salariesPercentage = new double [salaries.length];
		double increase = 0.05;//The percentage amount the salaries are increased

		for (int count = 0; count <=salaries.length-1; count+=1)
		{
			salariesPercentage[count] = salaries[count] * increase;//Creates the values that the salaries are increased by
		}

		for (int count = 0; count <=salaries.length-1; count+=1)
		{
			newSalaries[count] = salaries[count] + salariesPercentage[count];//add the amounts to each salary
		}

		return newSalaries;
	}

}
