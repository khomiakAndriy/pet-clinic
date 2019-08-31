package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.PetOwner;
import com.springboot.petclinic.service.PetOwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetOwnerServiceMapImpl extends AbstractMapService<PetOwner, Long> implements PetOwnerService {

    @Override
    public PetOwner findByLastName(String lastName) {
        return null;
    }
}
