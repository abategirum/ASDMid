package com.example.houseownermanagment.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "house")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int houseId;

    private String location;

    private String areaInSqMeter;

    @ManyToMany(mappedBy = "houses")
    private List<HouseOwner> houseOwners;

    public House(String location, String areaInSqMeter) {
        this.location = location;
        this.areaInSqMeter = areaInSqMeter;

    }

//    @Override
//    public String toString() {
//        return "House{" +
//                "location='" + location + '\'' +
//                ", areaInSqMeter='" + areaInSqMeter + '\'' +
//                ", houseOwners=" + houseOwners +
//                '}';
//    }
}
