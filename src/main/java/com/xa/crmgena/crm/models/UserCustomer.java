package com.xa.crmgena.crm.models;

import jakarta.persistence.*;


@Entity
@Table(name = "user_customer")
public class UserCustomer {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
