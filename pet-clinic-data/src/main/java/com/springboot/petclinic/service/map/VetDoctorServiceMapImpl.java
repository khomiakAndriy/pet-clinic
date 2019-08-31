package com.springboot.petclinic.service.map;

import com.springboot.petclinic.model.VetDoctor;
import com.springboot.petclinic.service.VetDoctorService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetDoctorServiceMapImpl extends AbstractMapService<VetDoctor, Long> implements VetDoctorService {
}
