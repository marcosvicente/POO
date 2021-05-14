package movie;

public class Main {

	public static void main(String[] args) {
		Movie movie = new MoveiImpl();		
		
		Comedy comedy = new Comedy(movie);
		
		System.out.println(comedy.type());
	}

}
