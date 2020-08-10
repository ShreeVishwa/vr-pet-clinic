package com.vrlabs.vrpetclinic.repositories;

import com.vrlabs.vrpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
