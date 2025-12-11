package oops;

	class laptop{
		String Brand;
		String Processor;
		int Ram;
		
		void DisplaySpec() {
			System.out.println("Brand: " +Brand );
			System.out.println("Processor: "+Processor);
			System.out.println("Ram: "+Ram);
			System.out.println("_________________________________");
		}
	}

public class laps {

	public static void main(String[] args) {
		laptop lap1 = new laptop();
		
		lap1.Brand = "ASUS";
		lap1.Processor = "Ryzen7";
		lap1.Ram = 16;
		
		laptop lap2 = new laptop();
		
		lap2.Brand = "DELL";
		lap2.Processor = "Intel7";
		lap2.Ram = 8;
		
		lap1.DisplaySpec();
		lap2.DisplaySpec();

	}

}
