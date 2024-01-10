package com.xa.crmgena.crm.models;

import jakarta.persistence.*;


@Entity
@Table(name = "emailtemplates")
public class Emailtemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "subject")
    private String subject;

    @Column(name = "body")
    private String body;

    @Column(name = "created_on")
    private java.sql.Timestamp createdOn;

    @Column(name = "edited_on")
    private java.sql.Timestamp editedOn;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "edited_by")
    private Long editedBy;

    @Column(name = "opportunity_id")
    private Long opportunityId;

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

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public java.sql.Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(java.sql.Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public java.sql.Timestamp getEditedOn() {
        return this.editedOn;
    }

    public void setEditedOn(java.sql.Timestamp editedOn) {
        this.editedOn = editedOn;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getEditedBy() {
        return this.editedBy;
    }

    public void setEditedBy(Long editedBy) {
        this.editedBy = editedBy;
    }

    public Long getOpportunityId() {
        return this.opportunityId;
    }

    public void setOpportunityId(Long opportunityId) {
        this.opportunityId = opportunityId;
    }
}
