package com.springboot.petclinic.model;

import lombok.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PetOwner extends Person {

    private String address;
    private String city;
    private String phoneNumber;

    private Set<Pet> pets = new HashSet<>();

    public void addPets(Pet... pets) {
        this.pets.addAll(Arrays.asList(pets));
    }
}
