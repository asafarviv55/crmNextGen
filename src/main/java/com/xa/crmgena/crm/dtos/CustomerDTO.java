package com.xa.crmgena.crm.dtos;

public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String accountNumber;
    private String purchaseHistory;
    private String communicationPreferences;
    private String customerStatus;
    private String subscriptionInformation;
    private String assignedSalesRepresentative;
    private String paymentTerms;


    public CustomerDTO() {

    }

    public CustomerDTO(Long id, String name, String email,
                       String phone, String address, String accountNumber,
                       String purchaseHistory, String communicationPreferences,
                       String customerStatus, String subscriptionInformation,
                       String assignedSalesRepresentative, String paymentTerms) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.accountNumber = accountNumber;
        this.purchaseHistory = purchaseHistory;
        this.communicationPreferences = communicationPreferences;
        this.customerStatus = customerStatus;
        this.subscriptionInformation = subscriptionInformation;
        this.assignedSalesRepresentative = assignedSalesRepresentative;
        this.paymentTerms = paymentTerms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCustomerID() {
        return id;
    }

    public void setCustomerID(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public String getCommunicationPreferences() {
        return communicationPreferences;
    }

    public void setCommunicationPreferences(String communicationPreferences) {
        this.communicationPreferences = communicationPreferences;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getSubscriptionInformation() {
        return subscriptionInformation;
    }

    public void setSubscriptionInformation(String subscriptionInformation) {
        this.subscriptionInformation = subscriptionInformation;
    }

    public String getAssignedSalesRepresentative() {
        return assignedSalesRepresentative;
    }

    public void setAssignedSalesRepresentative(String assignedSalesRepresentative) {
        this.assignedSalesRepresentative = assignedSalesRepresentative;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
}
