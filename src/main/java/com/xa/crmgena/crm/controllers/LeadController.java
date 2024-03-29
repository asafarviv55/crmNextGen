package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.dtos.LeadDTO;
import com.xa.crmgena.crm.models.Lead;
import com.xa.crmgena.crm.repositories.LeadRepository;
import com.xa.crmgena.crm.services.LeadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/leads")
public class LeadController {

        private static final Logger logger = LoggerFactory.getLogger(LeadController.class);

        @Autowired
        LeadRepository leadRepository;

        @Autowired
        LeadService leadService;



        @GetMapping("/welcome")
        public String hello(){
            logger.info(" LeadController.hello ---> Lead API Work !!");
            return "leads area";
        }

    // Create
        @PostMapping("/")
        public Lead createLead(@RequestBody LeadDTO leadDTO) {
            logger.info(" LeadController.createLead ---> leadDTO is "+ leadDTO.toString());

            Lead lead = new Lead();
            leadService.convertLeadDTO(leadDTO, lead);
            return leadRepository.save(lead);
        }



    // Read
        @GetMapping("/")
        public List<Lead> getAllLeads() {
            logger.info(" LeadController.getAllLeads ");

            return leadRepository.findAll();
        }


        @GetMapping("/{id}")
        public ResponseEntity<Lead> getLeadById(@PathVariable Long id) {
            logger.info(" LeadController.getLeadById ");

            Optional<Lead> lead = leadRepository.findById(id);

            return lead.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }



        // Update
        @PutMapping("/{id}")
        public ResponseEntity<Lead> updateLead(@PathVariable Long id, @RequestBody Lead updatedLead) {
            logger.info(" LeadController.updateLead ");

            Optional<Lead> existingLead = leadRepository.findById(id);
            if (existingLead.isPresent()) {
                updatedLead.setId(id);
                leadRepository.save(updatedLead);
                return new ResponseEntity<>(updatedLead, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        // Delete
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteLead(@PathVariable Long id) {
            logger.info(" LeadController.deleteLead ");

            if (leadRepository.existsById(id)) {
                leadRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }






    }




