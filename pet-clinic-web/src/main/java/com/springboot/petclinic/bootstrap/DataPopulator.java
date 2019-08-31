package com.springboot.petclinic.bootstrap;

import com.springboot.petclinic.model.*;
import com.springboot.petclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataPopulator implements CommandLineRunner {

    private PetOwnerService petOwnerService;
    private VetDoctorService vetDoctorService;
    private PetTypeService petTypeService;
    private PerService petService;
    private SpecialityService specialityService;

    public DataPopulator(PetOwnerService petOwnerService, VetDoctorService vetDoctorService, PetTypeService petTypeService, PerService petService, SpecialityService specialityService) {
        this.petOwnerService = petOwnerService;
        this.vetDoctorService = vetDoctorService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        if (petService.findAll().size() == 0){
            loadData();
        }
    }

    private void loadData() {

        PetType dog = PetType.builder().name("Dog").build();
        dog = petTypeService.save(dog);
        Pet michaelPet = new Pet();
        michaelPet.setPetType(dog);
        michaelPet.setName("Rex");
        michaelPet.setBirthDate(LocalDate.of(2015, 1, 9));

        PetType cat = PetType.builder().name("Cat").build();
        cat = petTypeService.save(cat);
        Pet fionaPet = new Pet();
        michaelPet.setPetType(cat);
        michaelPet.setName("Chuck");
        michaelPet.setBirthDate(LocalDate.of(2015, 7, 23));

        PetOwner owner1 = new PetOwner();
        michaelPet.setPetOwner(owner1);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Some address");
        owner1.setCity("Lviv");
        owner1.setPhoneNumber("+380631234567");
        owner1.addPets(petService.save(michaelPet));

        petOwnerService.save(owner1);

        PetOwner owner2 = new PetOwner();
        fionaPet.setPetOwner(owner2);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setPhoneNumber("+380693145646");
        owner2.setAddress("Fiona address");
        owner2.setCity("Odessa");
        owner2.addPets(petService.save(fionaPet));

        petOwnerService.save(owner2);

        System.out.println("Loaded Owners....");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");

        VetDoctor vet1 = new VetDoctor();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.addSpecialities(specialityService.save(radiology));

        vetDoctorService.save(vet1);

        VetDoctor vet2 = new VetDoctor();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.addSpecialities(surgery);

        vetDoctorService.save(vet2);

        System.out.println("Loaded VetDoctorss....");
    }
}
