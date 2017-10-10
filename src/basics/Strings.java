package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordchoice= "rungz";
		bookTitle = "Lord of the rungz";
		
		if (bookTitle.contains(wordchoice)){
			System.out.println("The book's name contains the word " + wordchoice);
			
			
		}
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName ="Gabesz";
		String lastName ="Czecze";
		String SSN = "123838774";
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,2));
		System.out.println(SSN.substring(5,9));
	}

}
