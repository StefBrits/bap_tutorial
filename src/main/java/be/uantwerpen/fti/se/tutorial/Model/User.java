package be.uantwerpen.fti.se.tutorial.Model;

import be.uantwerpen.fti.se.tutorial.Model.Role;
import org.springframework.data.jpa.domain.AbstractPersistable;


import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private List<Role> roles;

    public User(String firstName, String lastName){
        this.firstName = firstName; this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}