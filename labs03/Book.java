public class Book {
    
    public String title;
    public String author;
    public String isbn;
    public String description;

    

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printIsbn() {
        System.out.println("ISBN: " + isbn);
    }

    public void printDescription() {
	System.out.println("Description: " + description);
    }

    public String toString() {
        return ("'" + title + "' by " + author);
    }

    public void rentBook () {
    	System.out.println("Book rented"); //this is the method
    }
    public void returnBook () {
    	System.out.println("Book returned"); //this is the method
    }
    
	
	
}
		 
