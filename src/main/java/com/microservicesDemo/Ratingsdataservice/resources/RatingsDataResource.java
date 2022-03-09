package com.microservicesDemo.Ratingsdataservice.resources;

import com.microservicesDemo.Ratingsdataservice.models.Rating;
import com.microservicesDemo.Ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
@GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){

    return new Rating(movieId,4);

    }
@RequestMapping("/users/{userId}")
public UserRating getUserRating(@PathVariable String userId){
    List<Rating> ratings = Arrays.asList(new Rating("1234",5),new Rating("3456",4));
    UserRating userRating= new UserRating();
    userRating.setUserRating(ratings);
    return userRating;

}
}
