package projects;
/*
The total revenue for 2020 is: $1307750.00 
The projected revenue for 2025 is: $1478659.89
 */
public class Raeanne_Corpuz_Project4 {

	public static void main(String[] args) {
		// This file is to compute the revenue of Orange Inc. from years 2020-2025
		// Step 0: Declare variables
		double totalRevenue2020 = 0;
		double totalRevenue2025 = 0;
		int size = 5; // there are 5 products hence the number 5
		int numberOfYears = 5; // 2025-2020 = 5
		
		// Step 1: Create arrays using the given table
		int[] productPrice = {1825, 670, 880, 1910, 485};
		int[] productSales2020 = {320, 140, 530, 45, 160};
		double[] growthRate = {2.25, 3.5, 2.5, 4.3, 0.8};
		
		// Step 2: Create a for loop to compute the product revenue and total revenue for 2020
		int[] productRevenue2020 = new int [size];
		
		for(int i = 0; i < size; i++) {
			productRevenue2020[i] = productPrice[i] * productSales2020[i];
			totalRevenue2020 += productRevenue2020[i];
		}
		System.out.printf("The total revenue for 2020 is: $%.2f \n", totalRevenue2020); // Prints out the revenue for 2020
		
		// Step 3: Invoke the ProjSales method defining the variable productSales2025
		double [] productSales2025 = ProjSales(productSales2020, growthRate, numberOfYears);
		
		// Step 4: Calculate the total revenue in 2025 using the array above in a for loop
		double[] productRevenue2025 = new double [size];
		for(int i = 0; i < size; i++) {
			productRevenue2025[i] = productPrice[i] * productSales2025[i];
			totalRevenue2025 += productRevenue2025[i];
		}
		System.out.printf("The projected revenue for 2025 is: $%.2f", totalRevenue2025); // Prints out projected revenue for 2025

	}
	// This is the method ProjSales that calculates the sales growth for 2025 using the formula baseSales(1 + growthRate/100) ^ years
	public static double [] ProjSales (int[] productSales2020, double[] growthRate, int numberOfYears) { 
		double[] projectedSales = new double [productSales2020.length];
		for(int i = 0; i < productSales2020.length; i++) {
		projectedSales[i] = productSales2020[i] * Math.pow(1+ growthRate[i] / 100, numberOfYears); // The formula to calculate the sales growth
		}
		return projectedSales;

	}
}
