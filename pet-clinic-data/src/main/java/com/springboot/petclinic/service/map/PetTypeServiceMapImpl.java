package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.PetType;
import com.springboot.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMapImpl extends AbstractMapService<PetType, Long> implements PetTypeService {

}
