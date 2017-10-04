public class LeapYear{
	public static void main (String args[]){


		int year = Integer.parseInt(args[0]);


		if (year % 4 == 0)
			System.out.println("Leap Year");

		if (year % 400 == 0)
			System.out.println("Leap Year");

		if (year % 100 == 0)
			System.out.println("Not a Leap Year");
		
		else
			System.out.println("Not a Leap Year");


	}
}
