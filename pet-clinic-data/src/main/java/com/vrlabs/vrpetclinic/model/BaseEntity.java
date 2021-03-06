package com.vrlabs.vrpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

// This indicates that this class is a base class and will be inherited by other classes and no need to create a seperate
// table for this class
@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    // hibernate requires us to write them as box types(Long) instead of long because those types can be null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
