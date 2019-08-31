package com.springboot.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PetType extends BaseEntity{

    private String name;
}
