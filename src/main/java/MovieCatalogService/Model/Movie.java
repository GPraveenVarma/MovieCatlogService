package MovieCatalogService.Model;

public class Movie {
    private String movieName;
    private  String id;
    private String relateDate;
    private String hero;
    private String heroin;
    private String director;

    public Movie(String movieName, String id, String relateDate, String hero, String heroin, String director) {
        this.movieName = movieName;
        this.id = id;
        this.relateDate = relateDate;
        this.hero = hero;
        this.heroin = heroin;
        this.director = director;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRelateDate() {
        return relateDate;
    }

    public void setRelateDate(String relateDate) {
        this.relateDate = relateDate;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroin() {
        return heroin;
    }

    public void setHeroin(String heroin) {
        this.heroin = heroin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
