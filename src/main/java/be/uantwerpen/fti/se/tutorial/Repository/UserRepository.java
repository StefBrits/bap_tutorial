package be.uantwerpen.fti.se.tutorial.Repository;

import be.uantwerpen.fti.se.tutorial.Model.Privilege;
import be.uantwerpen.fti.se.tutorial.Model.Role;
import be.uantwerpen.fti.se.tutorial.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users; public UserRepository() {
        super();
        Privilege p1 = new Privilege("logon");
        Privilege p2 = new Privilege("secret-message");
        Role administrator = new Role("Administrator");
        Role tester = new Role("Tester");
        List<Privilege> privileges = new ArrayList<Privilege>();
        privileges.add(p1);
        tester.setPrivileges(privileges);
        privileges = new ArrayList<Privilege>();
        privileges.add(p1);
        privileges.add(p2);
        administrator.setPrivileges(privileges);
        User u1 = new User("Siegfried","Mercelis");
        List<Role> roles = new ArrayList<>();
        roles.add(administrator); u1.setRoles(roles);
        User u2 = new User("Reinout","Eyckerman");
        roles = new ArrayList<>();
        roles.add(tester);
        u2.setRoles(roles);
        User u3 = new User("Filip","Van der Schueren");
        roles = new ArrayList<>();
        roles.add(tester);
        u3.setRoles(roles);
        users = new
                ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    public List<User> findAll() {
        return new ArrayList<User>(this.users);
    }
    public void add(final User user) {
        this.users.add(user);
    }
}