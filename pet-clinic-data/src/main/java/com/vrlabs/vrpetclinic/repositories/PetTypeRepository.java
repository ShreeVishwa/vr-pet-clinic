package com.vrlabs.vrpetclinic.repositories;

import com.vrlabs.vrpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
