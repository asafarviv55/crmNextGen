package com.xa.crmgena.crm.dtos;

public class CustomerDTO {

    private Long customerID;
    private String customerName;
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

    public CustomerDTO(Long customerID, String customerName, String email, String phone, String address, String accountNumber,
                       String purchaseHistory, String communicationPreferences, String customerStatus, String subscriptionInformation,
                       String assignedSalesRepresentative, String paymentTerms) {
        this.customerID = customerID;
        this.customerName = customerName;
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

    public CustomerDTO() {

    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
