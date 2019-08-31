package com.springboot.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private PetOwner petOwner;
    private LocalDate birthDate;
 }

