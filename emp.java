package oops;

	class employee{
		int id;
		String name;
		double sallary;
		
		void displaydetails() {
			System.out.println("id: "+id);
			System.out.println("name: "+name);
			System.out.println("sallary: "+sallary);
			System.out.println("_________________________________");
		}
	}

public class emp {

	public static void main(String[] args) {
		employee e1 = new employee();
		
		e1.id = (1);
		e1.name = ("kumar");
		e1.sallary = (50000);
		
		employee e2 = new employee() ;
		
		e2.id = (2);
		e2.name = ("keerthi");
		e2.sallary = (45000);
		
		
		e1.displaydetails();
		e2.displaydetails();

	}

}
