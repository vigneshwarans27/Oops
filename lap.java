package oops;

	class books{
		String title;
		String author;
		Double price;
		
		void display() {
			System.out.println("Title:"+ title);
			System.out.println("Author:" + author);
			System.out.println("Price:"+price);
			
		}
	}

public class lap {

	public static void main(String[] args) {
		books book1 = new books() ;
		
		book1.title = "Wings of fire";
		book1.author = "APJ abdul kalam";
		book1.price = 300.0;
		
		books book2 = new books();
		
		book2.title = "isyai";
		book2.author = "Muthu kumar";
		book2.price = 260.0;
		
		books book3 = new books();
		
		book3.title = "Maha bharatham";
		book3.author = "Raman";
		book3.price = 480.0;
		
		
		book1.display();
		book2.display();
		book3.display();
		}

	}


