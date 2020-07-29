package com.vrlabs.vrpetclinic.services;

import com.vrlabs.vrpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);

}
