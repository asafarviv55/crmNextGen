package com.xa.crmgena.crm.models;

import jakarta.persistence.*;



@Entity
@Table(name = "articles")
public class Article {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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
