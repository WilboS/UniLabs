//A leap year is a year divisible by 4, unless it is also divisible by 100 but not 400.

public class LeapYear{
	public static void main (String args[]){

		int year = Integer.parseInt(args[0]);


		if (year % 400 != 0 && year % 100 == 0)
			System.out.println("Not a Leap Year");

		else if (year % 4 == 0)
			System.out.println("Leap Year");

		else 
			System.out.println("Not a leap year");
		

	}
}

