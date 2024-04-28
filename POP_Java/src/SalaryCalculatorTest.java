import java.util.Arrays;

public class SalaryCalculatorTest {

	public static void main(String[] args){
		SalaryCalculator salary = new SalaryCalculator();

		// Task1
		System.out.println(salary.salaryTax(20000));

		// Task 2
		System.out.println(salary.calculateNI(50000, 'D'));

		// Array example for next three tasks
		//double[] sals = {23000.50, 25478.66, 78496.56};

		// Task 3
		double[] salaryTotal = {23000.50, 25478.66, 78496.56};
		System.out.println(salary.salaryTotal(salaryTotal));

		// Task 4
		double[] salaryAverage = {23000.50, 25478.66, 78496.50};
		System.out.println(salary.salaryAverage(salaryAverage));

		// Task 5
		double[] salaryIncrease = {23000.50, 25478.66, 78496.50};
		System.out.println(Arrays.toString(salary.salaryIncrease(salaryIncrease)));
	}

}
