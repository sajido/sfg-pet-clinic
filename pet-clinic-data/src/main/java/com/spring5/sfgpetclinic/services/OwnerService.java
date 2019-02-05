package com.spring5.sfgpetclinic.services;

import com.spring5.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner o);
    Set<Owner> findAll();
}
