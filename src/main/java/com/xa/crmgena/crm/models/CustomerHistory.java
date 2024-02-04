package com.xa.crmgena.crm.models;

import jakarta.persistence.*;


@Entity
@Table(name = "customer_history")
public class CustomerHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note")
    private String note;

    @Column(name = "customerID")
    private Long customerId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }





}
