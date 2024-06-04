package com.example.houseownermanagment.repository;

import com.example.houseownermanagment.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HouseRepository extends JpaRepository<House, Integer> {

    Optional<House> findHouseByHouseId(int id);
}
