package com.vrlabs.vrpetclinic.services;

import com.vrlabs.vrpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
