package movie;

public class Comedy extends MovieDecorator{
	public Comedy(Movie movie) {
		super(movie);
	}
	public String mytype() {
		return "Comedy";
	}
	public String type() {
		return super.type()+mytype();
	}
}
