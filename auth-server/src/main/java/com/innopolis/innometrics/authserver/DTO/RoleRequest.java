package com.innopolis.innometrics.authserver.DTO;
import com.innopolis.innometrics.authserver.entitiy.Permission;
import com.innopolis.innometrics.authserver.entitiy.User;

import javax.persistence.PreUpdate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.Serializable;

public class RoleRequest implements Serializable {

    private String name;

    private String description;

    private String isactive;

    private Date creationdate;

    private String createdby;

    private Date lastupdate;

    private String updateby;

    private Set<User> users;


    private Set<Permission> permissions ;



//    public List<String> getPermissions()
//    {
//        return permissions.stream().map( permission -> permission.getPage()).collect(Collectors.toList());
//    }

    public RoleRequest() {
    }

    public RoleRequest(String name, String description, String isactive, Date creationdate, String createdby, Date lastupdate, String updateby) {
        this.name = name;
        this.description = description;
        this.isactive = isactive;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.lastupdate = lastupdate;
        this.updateby = updateby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @PreUpdate
    public void preUpdate(){
        this.lastupdate = new Date();
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
