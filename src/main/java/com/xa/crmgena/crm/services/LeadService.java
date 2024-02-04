package com.xa.crmgena.crm.services;

import com.xa.crmgena.crm.dtos.LeadDTO;
import com.xa.crmgena.crm.models.Lead;
import org.springframework.stereotype.Service;


@Service
public class LeadService {






    public void convertLeadDTO(LeadDTO leadDTO, Lead lead) {
        lead.setEmail(leadDTO.getEmail());
        lead.setAssignTo(lead.getAssignTo());
        lead.setPhone(lead.getPhone());
        lead.setName(lead.getName());
        lead.setStatus(lead.getStatus());
        lead.setSource(lead.getSource());
        lead.setPriority(lead.getPriority());
        lead.setIndustry(lead.getIndustry());
        lead.setCustomerId(lead.getCustomerId());
        lead.setNote(lead.getNote());
    }




}
