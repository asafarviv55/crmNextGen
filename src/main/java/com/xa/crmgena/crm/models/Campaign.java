package com.xa.crmgena.crm.models;
import jakarta.persistence.*;


@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private java.sql.Date startDate;

    @Column(name = "end_date")
    private java.sql.Date endDate;

    @Column(name = "created_on")
    private java.sql.Timestamp createdOn;

    @Column(name = "edited_on")
    private java.sql.Timestamp editedOn;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "edited_by")
    private Long editedBy;

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

    public java.sql.Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(java.sql.Date startDate) {
        this.startDate = startDate;
    }

    public java.sql.Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(java.sql.Date endDate) {
        this.endDate = endDate;
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
}
