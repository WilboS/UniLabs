public class TestBookRental{
	 public static void main (String[] args){

		Book myBook1 = new Book();

		myBook1.title = "Head First Java";
		myBook1.author = "Kathy Sierra and Bert Bates";
		myBook1.isbn = "0596009208";
		myBook1.availability = true;

		Book myBook2 = new Book();

		myBook2.title = "Java, How to Program";
		myBook2.author = "PJ Deitel and HM Deitel";
		myBook2.isbn = "0132575663";

		System.out.println(myBook1.title + " " + myBook1.author + " " + myBook1.isbn + " " + myBook1.availability);
		System.out.println(myBook2.title + " " + myBook2.author + " " + myBook2.isbn);

	}
}


