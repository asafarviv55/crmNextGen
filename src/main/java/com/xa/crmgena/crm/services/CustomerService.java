package com.xa.crmgena.crm.services;


import com.xa.crmgena.crm.dtos.CustomerDTO;
import com.xa.crmgena.crm.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void convertCustomerDTO(CustomerDTO customerDTO, Customer customer) {

        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setPhone(customerDTO.getPhone());
        customer.setAddress(customerDTO.getAddress());
        customer.setAccountNumber(customerDTO.getAccountNumber());
        customer.setPurchaseHistory(customerDTO.getPurchaseHistory());
        customer.setCommunicationPreferences(customerDTO.getCommunicationPreferences());
        customer.setCustomerStatus(customerDTO.getCustomerStatus());
        customer.setSubscriptionInformation(customerDTO.getSubscriptionInformation());
        customer.setAssignedSalesRepresentative(customerDTO.getAssignedSalesRepresentative());
        customer.setPaymentTerms(customerDTO.getPaymentTerms());

    }

}
