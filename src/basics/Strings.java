package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Rings";
		bookTitle = "The Lord of the Rings";
		 if(bookTitle.contains(wordChoice)) {
			 System.out.println("The book contains " + wordChoice);
		 }
		 
		 
		 String Browser = "Chrome"; 
		 if (Browser.equalsIgnoreCase("chrome")) {
			 System.out.println("The browser is Chrome");
		 }
		 
		 String firstName = "dave";
		 String lastName  = "Solatre";
		 String SSS = "91231212";
		 
		 
		 System.out.println("There are " + SSS.length() + " digit in your SSS.");
		 System.out.print(firstName.substring(0,1));
		 System.out.print(lastName.substring(0,3));
		 System.out.print(SSS.substring(4));
		 

	}

}
