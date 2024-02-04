package com.xa.crmgena.crm.models;


import jakarta.persistence.*;

@Entity
@Table(name = "lead_history")
public class LeadHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "note")
    private String note;

    @Column(name = "leadID")
    private Long leadId;

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

    public Long getLeadId() {
        return this.leadId;
    }

    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }
}
