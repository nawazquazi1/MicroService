package com.nawaz.hotal.servies.respositories;


import com.nawaz.hotal.servies.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
