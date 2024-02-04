package com.xa.crmgena.crm;

import com.xa.crmgena.crm.models.Role;
import com.xa.crmgena.crm.repositories.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }


    private static final Logger logger =  LoggerFactory.getLogger(CrmApplication.class);

    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository){
        logger.info("CrmApplication initDatabase start ");
        return args -> {
            if(roleRepository.count() == 0){
                logger.info("Preloading " + roleRepository.save(
                        new Role("Admin")));
                logger.info("Preloading " + roleRepository.save(
                        new Role("Sales Representative")));
                logger.info("Preloading " + roleRepository.save(
                        new Role("Sales Manager")));
            }
        };
    }
}
