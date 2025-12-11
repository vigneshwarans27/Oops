package oops;

	class Movie {
		String name;
		String genre;
		double rating;

		void displayDetails() {
			System.out.println("Name: " + name);
			System.out.println("Genre: " + genre);
			System.out.println("Rating: " + rating);
			System.out.println("Hit Status: " + (isHit() ? "Hit" : "Not a Hit"));
		}
	
	boolean isHit() {
		return rating > 8;
	}	
}
public class mov{
	
    public static void main(String[] args) {
     
        Movie m = new Movie();
        m.name = "Coolie";
        m.genre = "Action";
        m.rating = 9.0;

      
        m.displayDetails();
    }
}
