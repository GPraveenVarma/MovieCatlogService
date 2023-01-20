package MovieCatalogService.RestController;

import MovieCatalogService.Model.MovieDTO;
import MovieCatalogService.Model.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
public class Service {
    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private Handler handler;

    public List<MovieDTO> getMovieList(String userId) {
        List<Rating> list = new ArrayList<>();

        MultiValueMap<String, String> params = new LinkedMultiValueMap();
        params.add("UserId", userId);

        URI uri = getUri();
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        try {
            ResponseEntity<List<Rating>> exchange;
            exchange = restTemplate.exchange(uri, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Rating>>() {});
            list = exchange.getBody();
            if(!list.isEmpty()){
              return  handler.getMovieDto(list);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private HttpHeaders getHeaders() {
        return new HttpHeaders();
    }

    private URI getUri() {
        return UriComponentsBuilder.fromHttpUrl("http://localhost:9999/Rating/micro1/getratings/user1")
                .build()
                .toUri();
    }


}
