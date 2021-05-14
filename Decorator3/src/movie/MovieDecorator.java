package movie;
public class MovieDecorator  implements Movie{
	private Movie movie;

	public MovieDecorator(Movie movie){
		this.movie=movie;
	}

	    
	public String type(){
		return movie.type();
	}

}
