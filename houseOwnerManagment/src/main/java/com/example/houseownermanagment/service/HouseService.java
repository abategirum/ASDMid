package com.example.houseownermanagment.service;

import com.example.houseownermanagment.model.House;

import java.util.Optional;

public interface HouseService {
    Optional<House> addHouse(House house);

    Optional<House> updateHouse(House house);

    void deleteHouse(House house);


}
