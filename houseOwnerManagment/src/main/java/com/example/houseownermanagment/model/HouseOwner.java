package com.example.houseownermanagment.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "houseOwner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HouseOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int houseOwnerId;

    @NotBlank(message = "empty null are not allowed")
    private String firstName;

    @NotBlank(message = "empty null are not allowed")
    private String lastName;

    @NotBlank(message = "phone number can not be empty")
    private String phoneNumber;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "house_houseOwners",
            joinColumns = {
                    @JoinColumn(name = "houseOwner_id", referencedColumnName = "houseOwnerId"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "house_id", referencedColumnName = "houseId")
            }

    )
    private List<House> houses;

    public HouseOwner(String firstName, String lastName, String phoneNumber, List<House> houses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", houses=" + houses +
                '}';
    }
}
