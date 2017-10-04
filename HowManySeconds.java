public class HowManySeconds{
	public static void main (String args[]){

		int seconds = Integer.parseInt(args[0]);
		int hours = seconds / 3600;
		
		int totalMinutes = seconds / 60;
		int minutes = totalMinutes % 60;

		int remainderSeconds = seconds % 60;

		System.out.println(seconds + " seconds is:");
		System.out.println(hours + " hours " + minutes + " minutes and " + remainderSeconds + " seconds");



	}
}
