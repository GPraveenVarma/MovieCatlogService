package MovieCatalogService.Model;

import java.util.List;

public class MovieDTO {
    private List<Movie> movie;
    private Integer rating;

    public MovieDTO(Integer rating,List<Movie> movie){
        this.movie = movie;
        this.rating = rating;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
