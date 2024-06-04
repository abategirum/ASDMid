package com.example.houseownermanagment.repository;

import com.example.houseownermanagment.model.HouseOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HouseOwnerRepository extends JpaRepository<HouseOwner, Integer> {
 Optional<HouseOwner> findHouseOwnerByHouseOwnerId(int id);
}
