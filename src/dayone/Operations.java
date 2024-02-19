package dayone;

public class Operations {
	public static boolean isEven(int number) {
		return number%2==0;
	}
	public static void checkPositiveNegative(int number) {
		if(number >=0)
			System.out.println(number+":is Positive");
		else
			System.out.println(number+":Is Negative");
	}

}
