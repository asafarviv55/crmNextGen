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
