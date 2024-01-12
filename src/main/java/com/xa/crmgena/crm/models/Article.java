package com.xa.crmgena.crm.models;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "created_on")
    private java.sql.Timestamp created_on;

    @Column(name = "updated_on")
    private java.sql.Timestamp updated_on;

    @Column(name = "created_by")
    private Long created_by;

    @Column(name = "updated_by")
    private Long updated_by;

    @Column(name = "customer_id")
    private Long customerId;


    public Article() {
    }

    public Article(Long id, String title, String content, Timestamp created_on, Timestamp updated_on, Long created_by, Long updated_by, Long customerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created_on = created_on;
        this.updated_on = updated_on;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.customerId = customerId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
