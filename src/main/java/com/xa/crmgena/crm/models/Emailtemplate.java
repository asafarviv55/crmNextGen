package com.xa.crmgena.crm.models;

import jakarta.persistence.*;

import java.sql.Timestamp;


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
    private java.sql.Timestamp created_on;

    @Column(name = "updated_on")
    private java.sql.Timestamp updated_on;

    @Column(name = "created_by")
    private Long created_by;

    @Column(name = "updated_by")
    private Long updated_by;


    @Column(name = "opportunity_id")
    private Long opportunityId;


    public Emailtemplate() {
    }

    public Emailtemplate(Long id, String name, String subject, String body, Timestamp created_on, Timestamp updated_on, Long created_by, Long updated_by, Long opportunityId) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.body = body;
        this.created_on = created_on;
        this.updated_on = updated_on;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.opportunityId = opportunityId;
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


    public Timestamp getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }

    public Timestamp getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }

    public Long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Long created_by) {
        this.created_by = created_by;
    }

    public Long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Long updated_by) {
        this.updated_by = updated_by;
    }

    public Long getOpportunityId() {
        return this.opportunityId;
    }

    public void setOpportunityId(Long opportunityId) {
        this.opportunityId = opportunityId;
    }
}
