package com.example.houseownermanagment;

import com.example.houseownermanagment.model.House;
import com.example.houseownermanagment.model.HouseOwner;
import com.example.houseownermanagment.service.HouseOwnerService;
import com.example.houseownermanagment.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class HouseOwnerManagmentApplication implements CommandLineRunner {

    private final HouseService houseService;
    private final HouseOwnerService houseOwnerService;

    public static void main(String[] args) {
        SpringApplication.run(HouseOwnerManagmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //add new owner
        HouseOwner newHouseOwner = new HouseOwner();
        newHouseOwner.setFirstName("John");
        newHouseOwner.setLastName("Doe");
        newHouseOwner.setPhoneNumber("2494283728");
        List<House> houses = List.of(
                new House("1000 4th st, IA", "564"),
                new House("boolevard st, MA", "12400")
        );
        newHouseOwner.setHouses(houses);

        houseOwnerService.addHouseOwner(newHouseOwner);

        HouseOwner newHouseOwner2 = new HouseOwner();
        newHouseOwner2.setFirstName("Daniel");
        newHouseOwner2.setLastName("Logombo");
        newHouseOwner2.setPhoneNumber("9373622122");
        List<House> house2 = List.of(
                new House("1432 sky rd", "2344"),
                new House("kenedy bolevard","3221"),
                new House("springlake","122")
        );
        newHouseOwner2.setHouses(house2);
        houseOwnerService.addHouseOwner(newHouseOwner2);


        //update owner




        System.out.println(houseOwnerService.getAllHouseOwners());



    }
}
