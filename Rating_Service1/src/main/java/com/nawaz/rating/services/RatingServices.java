package com.nawaz.rating.services;

import com.nawaz.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nawaz
 */
@Service
public interface RatingServices {

    Rating create(Rating rating);



    List<Rating> getRatings();


    List<Rating> getRatingByUserId(String userId);


    List<Rating> getRatingByHotelId(String hotelId);


}
