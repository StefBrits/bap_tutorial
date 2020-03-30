package be.uantwerpen.fti.se.tutorial.Controller;

import be.uantwerpen.fti.se.tutorial.Service.UserService;
import be.uantwerpen.fti.se.tutorial.Model.Application;
import be.uantwerpen.fti.se.tutorial.Model.Test;
import be.uantwerpen.fti.se.tutorial.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

/*
    @RequestMapping({"/","/home"})
    public String showHomepage(ModelMap model) {
        User user = new User("Stef","Brits");
        Application application = new Application("Als je dit leest heeft stef het gefixt en ben je omo");
        Test test = new Test("sneffiepooh");
        model.addAttribute("usertje",user);
        model.addAttribute("app", application);
        model.addAttribute("testje", test);

        return "homepage";
    }


Anita is omo en <span th:text="${app.name}"/>
<span th:text="${testje.testNaam}"/> is echt epic

 */

    @Autowired
    private UserService userService;
    @ModelAttribute("allUsers")
    public List<User> populateUsers() {
        return this.userService.findAll();
    }
    @RequestMapping({"/","/home"})
    public String showHomepage(){
        return "homepage";
    }

}