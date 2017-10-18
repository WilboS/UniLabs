public class TestBook{
	 public static void main (String[] args){

		Book myBook1 = new Book();
	

		myBook1.title = "Head First Java";
		myBook1.author = "Kathy Sierra and Bert Bates";
		myBook1.isbn = "0596009208";
		myBook1.description = "This is a book!";
		myBook1.printTitle();
		myBook1.printAuthor();
		myBook1.printIsbn();
		myBook1.printDescription();

			System.out.println(myBook1); 
			// printing from the toString line 			
			// in Book.java
			// Returns "Book@60f09995" without "toString"


		Book myBook2 = new Book();

		myBook2.title = "Java, How to Program";
		myBook2.author = "PJ Deitel and HM Deitel";
		myBook2.isbn = "0132575663";
		myBook2.description = "This is also a book!";
		myBook2.printTitle(); 
			//this is where you are calling the method here from Book.java
			//below, you were just printing it out from the varaibles above 
		myBook2.printAuthor();
		myBook2.printIsbn();
		myBook2.printDescription();

			System.out.println(myBook2); 


	//	System.out.println(myBook1.title + " " + myBook1.author + " " + myBook1.isbn);
	//	System.out.println(myBook2.title + " " + myBook2.author + " " + myBook2.isbn);

	}
}


