package com.vrlabs.vrpetclinic.repositories;

import com.vrlabs.vrpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
