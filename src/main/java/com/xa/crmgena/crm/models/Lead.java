package com.xa.crmgena.crm.models;
import jakarta.persistence.*;

@Entity
@Table(name = "leads")
public class Lead {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "source")
    private String source;

    @Column(name = "status")
    private String status;

    @Column(name = "created_on")
    private java.sql.Timestamp createdOn;

    @Column(name = "edited_on")
    private java.sql.Timestamp editedOn;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "edited_by")
    private Long editedBy;

    @Column(name = "customer_id")
    private Long customerId;

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

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
