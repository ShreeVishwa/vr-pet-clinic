package com.vrlabs.vrpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class Person extends BaseEntity {

    // @Column annotation indicates what column name should be for that field in the database
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
