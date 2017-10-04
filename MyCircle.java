public class MyCircle{
	public static void main (String args[]){
	
		double radius = Double.parseDouble(args[0]);
		double pi = 3.1415926;
		double radiusSquared = radius *radius;

			System.out.println("The radius of the circle is " +radius + " cm");
			System.out.println("Its Circumference is " +2 *radius *pi);
			System.out.println("And it's area is " +4 *radiusSquared *pi);




	}
}



