package com.xa.crmgena.crm.services;

import com.xa.crmgena.crm.dtos.LeadDTO;
import com.xa.crmgena.crm.dtos.UserDTO;
import com.xa.crmgena.crm.models.Lead;
import com.xa.crmgena.crm.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    public void convertUserDTO(UserDTO userDTO, User user) {
        user.setEmail(userDTO.getEmail());
        //user.setRoles(userDTO.getRoles());
        user.setUserName(userDTO.getName());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(userDTO.getPassword());
        user.setAccountExpiryDate(userDTO.getAccountExpiryDate());
        user.setAccountLocking(userDTO.getAccountLocking());
        user.setCredentialsExpiryDate(userDTO.getCredentialsExpiryDate());
    }



}
