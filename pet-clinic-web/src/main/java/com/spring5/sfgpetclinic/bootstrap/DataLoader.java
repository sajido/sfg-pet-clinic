package com.spring5.sfgpetclinic.bootstrap;

import com.spring5.sfgpetclinic.model.Owner;
import com.spring5.sfgpetclinic.model.Vet;
import com.spring5.sfgpetclinic.services.OwnerService;
import com.spring5.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("sajid");
        owner1.setLastName("loukili");

        Owner owner2 = new Owner();
        owner2.setFirstName("rim");
        owner2.setLastName("loukili");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("owners saved");

        Vet vet1 = new Vet();
        vet1.setFirstName("anas");
        vet1.setLastName("loukili");

        Vet vet2 = new Vet();
        vet2.setFirstName("narjiss");
        vet2.setLastName("loukili");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("vets saved");
    }
}
