package exercise;

import java.util.Scanner;

public class EvenOddNumber {
	
	//Guna scanner input, masukkan satu nombor integer.    
	//Bahagikan nomber tersebut dengan 5, jika ia berbaki dengan 0,
	//maka print nomber tersebut adalah odd.
	//Bahagikan nombor tersebut dengan 2, jika baklinya adalah kosong,
	//maka print nomber tersebut ialah even
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		num = scan.nextInt();
		
		if (num%5 != 0)
		{
			System.out.println("Odd Number");
		}
		
		else if (num%2 == 0)
		{
            System.out.println("Even number");
		}
		

	}

}
