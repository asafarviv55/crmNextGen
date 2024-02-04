package com.xa.crmgena.crm.dtos;

public class LeadDTO {


    private String name;
    private String source;
    private String phone;
    private String email;
    private String status;

    private Long assignTo;
    private String priority;
    private String note;
    private String dateOfEntry;
    private Long customerID;
    private Long createdBy;

    private String industry;


    public LeadDTO(String name, String source, String phone, String email, String status, Long assignTo, String priority, String note, String dateOfEntry, Long customerID, Long createdBy, String industry) {
        this.name = name;
        this.source = source;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.assignTo = assignTo;
        this.priority = priority;
        this.note = note;
        this.dateOfEntry = dateOfEntry;
        this.customerID = customerID;
        this.createdBy = createdBy;
        this.industry = industry;
    }

    public LeadDTO(String name) {
        this.name = name;
    }

    public LeadDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(Long assignTo) {
        this.assignTo = assignTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }


    @Override
    public String toString() {
        return "LeadDTO{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", assignTo=" + assignTo +
                ", priority='" + priority + '\'' +
                ", note='" + note + '\'' +
                ", dateOfEntry='" + dateOfEntry + '\'' +
                ", customerID=" + customerID +
                ", createdBy=" + createdBy +
                ", industry='" + industry + '\'' +
                '}';
    }




}
