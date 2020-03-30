package be.uantwerpen.fti.se.tutorial.Model;

import java.util.List;

public class Role {
    private String name;
    private List<Privilege> privileges;
    public Role(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List< Privilege > getPrivileges() {
        return privileges;
    }
    public void setPrivileges(List< Privilege > privileges) {
        this. privileges = privileges;
    }
}