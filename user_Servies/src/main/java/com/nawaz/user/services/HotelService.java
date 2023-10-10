package com.nawaz.user.services;


import com.nawaz.user.entities.Hotel;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author nawaz
 */
//@FeignClient(name = "HOTEL_SERVICE")
@Service
public interface HotelService {

    @GetMapping("/hotels/{hotelId}")
    Hotel getHotel(@PathVariable("hotelId") String hotelId);

   
}
