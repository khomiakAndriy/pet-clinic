package com.springboot.petclinic.service;

import com.springboot.petclinic.model.PetOwner;

public interface PetOwnerService extends CrudService<PetOwner, Long>{

    PetOwner findByLastName(String lastName);
}
