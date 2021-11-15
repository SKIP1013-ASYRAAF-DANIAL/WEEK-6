package exercise;

import java.util.Scanner;

public class Grade {
	
	//Guna scanner input:
	//Masukkan dua subject dan markah
    //Nyatakan subjek mana yang lebih besar markah dan mana yang lebih kecil
	//Nyatakan subjek yang mempunyai markah lebih besar daripada 50, calon di kira lulus
	//Nyatakan subjek mana yang lulus dan yang mana gagal
	    
	//Kira purata markah. Markah 80-100 adalah Gred A, 
	//markah 60-79 adalah Gred B dan markah 50-59 adalah gred C.
	//Lain2 markah adalah Gagal

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sub1;
		String sub2;
		char grade;
		int mark1;
		int mark2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first subject : ");
		sub1 = scan.next();
		System.out.println();
		
		System.out.println("Enter your mark for first subject : ");
		mark1 = scan.nextInt();
		System.out.println();
		
		System.out.println("Enter your second subject : ");
		sub2 = scan.next();
		System.out.println();
		
		System.out.println("Enter your mark for second subject : ");
		mark2 = scan.nextInt();
		System.out.println();
		
		double avg = (mark1 + mark2) / 2;
		
		if (mark2 > mark1)
		{
			System.out.println("Your subject for " + sub1 + " is higher than " + sub2);
		}

		else
		{
			System.out.println("Your subject for " + sub2 + " is higher than " + sub1);
		}
		
		
		if ((mark1 >= 50) || (mark2 >= 50))
		{
			System.out.println("Pass");
		}

		else if ((mark1 < 50) || (mark2 < 50))
		{
			System.out.println("Failed");
		}
		
		System.out.println();
		
		if (mark1 >= 50)
		{
			System.out.println("Your subject for " + sub1 + " is pass");
		}
		
		else 
		{
			System.out.println("Your subject for " + sub1 + " is failed");
		}
		
		System.out.println();
		
		if (mark2 >= 50)
		{
			System.out.println("Your subject for " + sub2 + " is pass");
		}
		
		else 
		{
			System.out.println("Your subject for " + sub2 + " is failed");
		}
		
		System.out.println();
		
		if (avg >= 80)
			grade = 'A';
		else if (avg >= 60)
			grade = 'B';
		else if (avg >= 50)
			grade = 'C';
		else 
			grade = 'F';
		
			System.out.println("Your average mark is " + avg);
			System.out.println("Your average grade is " + grade);

	}

}
