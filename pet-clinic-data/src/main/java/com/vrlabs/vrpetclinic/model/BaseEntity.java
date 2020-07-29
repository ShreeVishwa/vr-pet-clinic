package com.vrlabs.vrpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // hibernate requires us to write them as box types(Long) instead of long because those types can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
