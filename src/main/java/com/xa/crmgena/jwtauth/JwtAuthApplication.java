package com.xa.crmgena.jwtauth;

import com.xa.crmgena.jwtauth.models.Role;
import com.xa.crmgena.jwtauth.repositories.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthApplication.class, args);
    }


    private static final Logger log =  LoggerFactory.getLogger(JwtAuthApplication.class);

    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository){
        return args -> {
            if(roleRepository.count() == 0){
                log.info("Preloading " + roleRepository.save(
                        new Role("ROLE_ADMIN")));
                log.info("Preloading " + roleRepository.save(
                        new Role("ROLE_USER")));
                log.info("Preloading " + roleRepository.save(
                        new Role("ROLE_MODERATOR")));
            }
        };
    }
}
