package com.example.houseownermanagment.service;

import com.example.houseownermanagment.model.HouseOwner;

import java.util.List;
import java.util.Optional;

public interface HouseOwnerService {

    Optional<HouseOwner> addHouseOwner(HouseOwner houseOwner);

    Optional<HouseOwner> updateHouseOwner(HouseOwner houseOwner);

    List<HouseOwner> getAllHouseOwners();

    void deleteHouseOwner(HouseOwner houseOwner);

}
