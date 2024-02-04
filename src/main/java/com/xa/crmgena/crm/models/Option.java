package com.xa.crmgena.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "options")
public class Option {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "metakey")
    private String metakey;

    @Column(name = "metavalue")
    private String metavalue;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMetakey() {
        return this.metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetavalue() {
        return this.metavalue;
    }

    public void setMetavalue(String metavalue) {
        this.metavalue = metavalue;
    }
}
