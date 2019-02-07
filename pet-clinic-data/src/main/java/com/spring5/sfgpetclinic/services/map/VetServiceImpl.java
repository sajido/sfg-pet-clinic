package com.spring5.sfgpetclinic.services.map;

import com.spring5.sfgpetclinic.model.Vet;
import com.spring5.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceImpl extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
