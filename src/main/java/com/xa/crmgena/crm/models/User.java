package com.xa.crmgena.crm.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "UserName"),
                @UniqueConstraint(columnNames = "email")
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "accountExpiryDate")
    private String accountExpiryDate;

    @Column(name = "accountLocking")
    private String accountLocking;

    @Column(name = "credentialsExpiryDate")
    private String credentialsExpiryDate;



    @Column(name = "created_on")
    private java.sql.Timestamp created_on;

    @Column(name = "updated_on")
    private java.sql.Timestamp updated_on;

    @Column(name = "created_by")
    private long created_by;

    @Column(name = "updated_by")
    private long updated_by;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_roles",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public User(Long id, String firstName, String lastName, String userName,
                String email, String password, boolean isActive,
                String accountExpiryDate, String accountLocking,
                String credentialsExpiryDate, Timestamp created_on,
                Timestamp updated_on, long created_by, long updated_by, Set<Role> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.accountExpiryDate = accountExpiryDate;
        this.accountLocking = accountLocking;
        this.credentialsExpiryDate = credentialsExpiryDate;
        this.created_on = created_on;
        this.updated_on = updated_on;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.roles = roles;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAccountExpiryDate() {
        return accountExpiryDate;
    }

    public void setAccountExpiryDate(String accountExpiryDate) {
        this.accountExpiryDate = accountExpiryDate;
    }

    public String getAccountLocking() {
        return accountLocking;
    }

    public void setAccountLocking(String accountLocking) {
        this.accountLocking = accountLocking;
    }

    public String getCredentialsExpiryDate() {
        return credentialsExpiryDate;
    }

    public void setCredentialsExpiryDate(String credentialsExpiryDate) {
        this.credentialsExpiryDate = credentialsExpiryDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(long created_by) {
        this.created_by = created_by;
    }

    public long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(long updated_by) {
        this.updated_by = updated_by;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
