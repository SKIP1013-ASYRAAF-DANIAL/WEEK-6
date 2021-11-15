package exercise;

import java.util.Scanner;

public class BMI {
	
	//Masukkan bmi.. jika kurang dari 18.5 - underweight,   
	//jika kurang dari 25 - normal,
	//jika kurang dari 30 - overweight
	//dan lain-lain Obese
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight;
		double height;
		double BMI;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your weight (KG) : ");
		weight = scan.nextDouble();
		System.out.println();
		
		System.out.println("Enter your height (cm) : ");
		height = scan.nextDouble();
		System.out.println();
		
		BMI = weight / (height/100 * height/100);
		
		System.out.printf("Your BMI is : %.2f" , BMI);
		System.out.println();
		
		if (BMI < 18.5)
		{
			System.out.println("You are underweight");
		}
		
		else if (BMI < 25)
		{
			System.out.println("You are normal");
		}
		
		else if (BMI < 30)
		{
			System.out.println("You are overweight");
		}
		
		else if (BMI >= 30)
		{
			System.out.println("You are obese");
		}

	}

}
