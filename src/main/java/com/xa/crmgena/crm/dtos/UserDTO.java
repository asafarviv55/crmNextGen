package com.xa.crmgena.crm.dtos;

public class UserDTO {


    private String name;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String roles;

    private boolean isActive;

    private String accountExpiryDate;

    private String accountLocking;

    private String credentialsExpiryDate;


    public UserDTO() {
    }

    public UserDTO( String name, String firstName, String lastName,
                   String password, String email, String roles, boolean isActive,
                   String accountExpiryDate, String accountLocking, String credentialsExpiryDate) {

        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.roles = roles;
        this.isActive = isActive;
        this.accountExpiryDate = accountExpiryDate;
        this.accountLocking = accountLocking;
        this.credentialsExpiryDate = credentialsExpiryDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAccountExpiryDate() {
        return accountExpiryDate;
    }

    public void setAccountExpiryDate(String accountExpiryDate) {
        this.accountExpiryDate = accountExpiryDate;
    }

    public String getAccountLocking() {
        return accountLocking;
    }

    public void setAccountLocking(String accountLocking) {
        this.accountLocking = accountLocking;
    }

    public String getCredentialsExpiryDate() {
        return credentialsExpiryDate;
    }

    public void setCredentialsExpiryDate(String credentialsExpiryDate) {
        this.credentialsExpiryDate = credentialsExpiryDate;
    }
}
