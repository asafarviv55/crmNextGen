package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.models.Lead;
import com.xa.crmgena.crm.repositories.LeadRepository;
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




        @Autowired
        LeadRepository leadRepository;



        @GetMapping("welcome")
        public String hello(){
            return "leads area";
        }

    // Create
        @PostMapping("/create")
        public Lead createLead(@RequestBody Lead lead) {
            return leadRepository.save(lead);
        }

        // Read
        @GetMapping
        public List<Lead> getAllLeads() {
            return leadRepository.findAll();
        }


        @GetMapping("/get/{id}")
        public ResponseEntity<Lead> getLeadById(@PathVariable Long id) {
            Optional<Lead> lead = leadRepository.findById(id);
            return lead.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }



        // Update
        @PutMapping("/update/{id}")
        public ResponseEntity<Lead> updateLead(@PathVariable Long id, @RequestBody Lead updatedLead) {
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
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteLead(@PathVariable Long id) {
            if (leadRepository.existsById(id)) {
                leadRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }




