package com.spring5.sfgpetclinic;

import com.spring5.sfgpetclinic.dataSourceConfig.DataSourceFake;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext app = SpringApplication.run(SfgPetClinicApplication.class, args);
        DataSourceFake d = (DataSourceFake) app.getBean("dataSourceFake");
        System.out.println(d.getUser());
        System.out.println(d.getUrl());
    }

}

