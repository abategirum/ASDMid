package com.example.houseownermanagment.service.impl;

import com.example.houseownermanagment.model.HouseOwner;
import com.example.houseownermanagment.repository.HouseOwnerRepository;
import com.example.houseownermanagment.service.HouseOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class HouseOwnerServiceImpl implements HouseOwnerService {

    private final HouseOwnerRepository houseOwnerRepository;
    @Override
    public Optional<HouseOwner> addHouseOwner(HouseOwner houseOwner) {
      HouseOwner newHouseOwner = houseOwnerRepository.save(houseOwner);
      return  Optional.of(newHouseOwner);
    }

    @Override
    public Optional<HouseOwner> updateHouseOwner(HouseOwner houseOwner) {
        return Optional.empty();
    }

    @Override
    public List<HouseOwner> getAllHouseOwners() {
       return  houseOwnerRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(HouseOwner::getPhoneNumber))
                .toList();
    }

    @Override
    public void deleteHouseOwner(HouseOwner houseOwner) {

    }
}
