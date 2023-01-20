package MovieCatalogService.RestController;

import MovieCatalogService.Model.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class McsRestController {

    @Autowired
    private Service service;

    @GetMapping(value = "/moviesList/{userid}")
    public List<MovieDTO> getMoviesDetails(@PathVariable String userid){
       return service.getMovieList(userid);
    }

}
