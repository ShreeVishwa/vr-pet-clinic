package com.vrlabs.vrpetclinic.services;

import com.vrlabs.vrpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
