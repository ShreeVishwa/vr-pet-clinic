package com.vrlabs.vrpetclinic.repositories;

import com.vrlabs.vrpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
