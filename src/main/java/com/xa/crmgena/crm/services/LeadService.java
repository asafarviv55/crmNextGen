package com.xa.crmgena.crm.services;

import com.xa.crmgena.crm.dtos.LeadDTO;
import com.xa.crmgena.crm.models.Lead;
import org.springframework.stereotype.Service;


@Service
public class LeadService {






    public void convertLeadDTO(LeadDTO leadDTO, Lead lead) {
        lead.setEmail(leadDTO.getEmail());
        lead.setAssignTo(leadDTO.getAssignTo());
        lead.setPhone(leadDTO.getPhone());
        lead.setName(leadDTO.getName());
        lead.setStatus(leadDTO.getStatus());
        lead.setSource(leadDTO.getSource());
        lead.setPriority(leadDTO.getPriority());
        lead.setIndustry(leadDTO.getIndustry());
        lead.setCustomerId(leadDTO.getCustomerID());
        lead.setNote(leadDTO.getNote());
    }




}
