package oops;

	class Mobile {
		String modelName;
		double price;

		void displayDetails() {
			System.out.println("Model Name: " + modelName);
			System.out.println("Price: ₹" + price);
		}
	}

public class Phone{
	

    public static void main(String[] args) {
 
        Mobile m= new Mobile();
        
        m.modelName = "Realme 6i";
        m.price = 14999.0;

     
        m.displayDetails();
    }
}