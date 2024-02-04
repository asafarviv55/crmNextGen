package com.xa.crmgena.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;


    @Column(name = "address")
    private String address;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "purchaseHistory")
    private String purchaseHistory;

    @Column(name = "communicationPreferences")
    private String communicationPreferences;

    @Column(name = "customerStatus")
    private String customerStatus;

    @Column(name = "subscriptionInformation")
    private String subscriptionInformation;

    @Column(name = "paymentTerms")
    private String paymentTerms;


    @Column(name = "assignedSalesRepresentative")
    private String assignedSalesRepresentative;




    @Column(name = "created_on")
    private java.sql.Timestamp createdOn;

    @Column(name = "updated_on")
    private java.sql.Timestamp updatedOn;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;


    public String getAssignedSalesRepresentative() {
        return assignedSalesRepresentative;
    }

    public void setAssignedSalesRepresentative(String assignedSalesRepresentative) {
        this.assignedSalesRepresentative = assignedSalesRepresentative;
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

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public java.sql.Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(java.sql.Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public java.sql.Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(java.sql.Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }
}
