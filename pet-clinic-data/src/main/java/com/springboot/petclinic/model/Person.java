package com.springboot.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

}
