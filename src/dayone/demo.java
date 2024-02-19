package dayone;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		number=sc.nextInt();
		
		Operations.checkPositiveNegative(number);
		Operations.checkPositiveNegative(-16);
		Operations.checkPositiveNegative(24);
		
		System.err.println("Is "+number+" even?" + Operations.isEven(number));
		System.out.println("Is 4 even?" + Operations.isEven(4));
		

	}

}
