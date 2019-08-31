package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.Speciality;
import com.springboot.petclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMapImpl extends AbstractMapService<Speciality, Long> implements SpecialityService {

}
