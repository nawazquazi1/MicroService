package com.nawaz.rating.repository;

import com.nawaz.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nawaz
 */
@Repository
@EnableJpaRepositories
public interface RatingRepo extends JpaRepository<Rating,Integer> {
     List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
