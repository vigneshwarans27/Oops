package oops;


public class main {

	public static void main(String[] args) {
		car car1 = new car();
		car1.brand = "honda";
		car1.model = "civic";
		
		car car2 = new car();
		car2.brand = "bmw";
		car2.model = "m3";
		
		car1.startengine();
		car2.startengine();

	}

}
