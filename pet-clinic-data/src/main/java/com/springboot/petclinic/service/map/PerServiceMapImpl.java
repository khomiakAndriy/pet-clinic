package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.Pet;
import com.springboot.petclinic.service.CrudService;
import com.springboot.petclinic.service.PerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerServiceMapImpl extends AbstractMapService<Pet, Long> implements PerService{
}
