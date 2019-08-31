package com.springboot.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class VetDoctor extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public void addSpecialities(Speciality... specialities){
        this.specialities.addAll(Arrays.asList(specialities));
    }
}
