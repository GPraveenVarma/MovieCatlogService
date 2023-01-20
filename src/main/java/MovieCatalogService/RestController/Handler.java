package MovieCatalogService.RestController;

import MovieCatalogService.Model.Movie;
import MovieCatalogService.Model.MovieDTO;
import MovieCatalogService.Model.Rating;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class Handler {
    public static List<Movie> movies;

    static{
         movies = Arrays.asList(new Movie("pokiri","movie120","1-2-1995","mahesh","illiyana","puri")
                ,new Movie("murari","movie121","1-2-1995","mahesh","sonali","puri")
                ,new Movie("indra","movie122","1-2-1995","chiru","sonali","rajamoli")
                ,new Movie("tagore","movie123","1-2-1995","chiru","arthi","srikanth"));
          }
    public List<MovieDTO> getMovieDto(List<Rating> ratingList){
        List<MovieDTO> movieDTOS = new ArrayList<>();

        Map<String,Integer> map1 = ratingList.stream()
                        .collect(Collectors.toMap(Rating::getMovieId,Rating::getRating));

        map1.forEach((k,v)->movieDTOS.add(new MovieDTO(v,movies.stream()
                .filter(a -> a.getId().equals(k)).collect(Collectors.toList()))));

        return movieDTOS;
    }
}
