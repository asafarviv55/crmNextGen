package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.models.Campaign;
import com.xa.crmgena.crm.repositories.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {


    @Autowired
    CampaignRepository campaignRepository;


    @GetMapping("welcome")
    public String hello(){
        return "campaigns area";
    }

    // Create
    @PostMapping("/create")
    public Campaign createCampaign(@RequestBody Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    // Read
    @GetMapping
    public List<Campaign> getAllLeads() {
        return campaignRepository.findAll();
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<Campaign> getCampaignById(@PathVariable Long id) {
        Optional<Campaign> campaign = campaignRepository.findById(id);
        return campaign.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<Campaign> updateCampaign(@PathVariable Long id, @RequestBody Campaign updatedCampaign) {
        Optional<Campaign> existingTicket = campaignRepository.findById(id);
        if (existingTicket.isPresent()) {
            updatedCampaign.setId(id);
            campaignRepository.save(updatedCampaign);
            return new ResponseEntity<>(updatedCampaign, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCampaign(@PathVariable Long id) {
        if (campaignRepository.existsById(id)) {
            campaignRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
