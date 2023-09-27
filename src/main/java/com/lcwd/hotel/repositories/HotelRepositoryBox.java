package com.lcwd.hotel.repositories;

import com.lcwd.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepositoryBox extends JpaRepository <Hotel ,String> {

}
