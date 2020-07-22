package com.innopolis.innometrics.authserver.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User implements Serializable {
//public class User implements Serializable {

    @Id
    @Column(updatable = false)
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(name = "confirmed_at", insertable = false, updatable = false)
    private Date confirmed_at;

    @ManyToMany
    @JoinTable(
            name = "project_users",
            joinColumns = @JoinColumn(name = "email"),
            inverseJoinColumns = @JoinColumn(name = "projectid"))
    Set<Project> projects;


    @Column
    private String isactive;

    @Column(name = "creationdate", insertable = false, updatable = false)
    private Date creationdate;

    @Column(name = "createdby", insertable = false, updatable = false)
    private String createdby;

    @Column(name = "lastupdate", insertable = false)
    private Date lastupdate;

    @Column(name = "updateby", insertable = false)
    private String updateby;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "role", insertable = false, updatable = false)
    //@JoinColumn(name="role", referencedColumnName = "name", insertable = false, updatable = false)
    private Role role;

    /*
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role")//, cascade = CascadeType.ALL)
    private Set<Role> roles = new HashSet<>();

     */
    /*
    public User() {
    }

    public User(String email, String password, String name, String surname, Date confirmed_at, String isactive, Date creationdate, String createdby, Date lastupdate, String updateby, Set<Role> roles) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.confirmed_at = confirmed_at;
        this.isactive = isactive;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.lastupdate = lastupdate;
        this.updateby = updateby;
        //this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getConfirmed_at() {
        return confirmed_at;
    }

    public void setConfirmed_at(Date confirmed_at) {
        this.confirmed_at = confirmed_at;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    /*
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

     */








//
//    @PreUpdate
//    public void preUpdate(){
//        this.lastupdate = new Date();
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return new HashSet<Role>(){{
//            add(getRole());
//        }};
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
