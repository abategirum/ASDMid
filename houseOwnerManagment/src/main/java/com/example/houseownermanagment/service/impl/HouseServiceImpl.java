package com.example.houseownermanagment.service.impl;

import com.example.houseownermanagment.model.House;
import com.example.houseownermanagment.repository.HouseRepository;
import com.example.houseownermanagment.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;
    @Override
    public Optional<House> addHouse(House house) {
        House newHouse = houseRepository.save(house);
        return Optional.of(newHouse);
    }

    @Override
    public Optional<House> updateHouse(House house) {
        Optional<House> houseFound = houseRepository.findHouseByHouseId(house.getHouseId());
        if(houseFound.isPresent()){
            houseFound.get().setLocation(house.getLocation());
            houseFound.get().setAreaInSqMeter(house.getAreaInSqMeter());
            houseFound.get().setHouseOwners(house.getHouseOwners());
        }

        return Optional.of(houseRepository.save(houseFound.get()));
    }

    @Override
    public void deleteHouse(House house) {
        houseRepository.findHouseByHouseId(house.getHouseId())
                .ifPresent(houseRepository::delete);
    }
}
