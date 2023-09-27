package com.lcwd.hotel.controller;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    // create
    @PostMapping("/create")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));

    }
    //get single
    @GetMapping("/GetById")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));

    }
    // getall
    @GetMapping("GetAll")
    public ResponseEntity <List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelService.getAll());

    }


}
