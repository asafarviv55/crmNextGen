package com.xa.crmgena.crm.models;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "leads")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "source")
    private String source;

    @Column(name = "status")
    private String status;

    @Column(name = "phone")
    private String phone;

    @Column(name = "industry")
    private String industry;

    @Column(name = "priority")
    private String priority;

    @Column(name = "note")
    private String note;



    @Column(name = "email")
    private String email;


    @Column(name = "AssignTo")
    private Long AssignTo;

    @Column(name = "created_on")
    private java.sql.Timestamp createdOn;

    @Column(name = "updated_on")
    private java.sql.Timestamp updated_on;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updated_by;

    @Column(name = "customer_id")
    private Long customerId;


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public Long getAssignTo() {
        return AssignTo;
    }

    public void setAssignTo(Long assignTo) {
        AssignTo = assignTo;
    }

    public Timestamp getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }

    public Long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Long updated_by) {
        this.updated_by = updated_by;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.sql.Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(java.sql.Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
