package be.uantwerpen.fti.se.tutorial.Controller;

import be.uantwerpen.fti.se.tutorial.GeneratorBlock;
import be.uantwerpen.fti.se.tutorial.Model.DustBlock;
import be.uantwerpen.fti.se.tutorial.Service.UserService;
import be.uantwerpen.fti.se.tutorial.Model.Application;
import be.uantwerpen.fti.se.tutorial.Model.Test;
import be.uantwerpen.fti.se.tutorial.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


<span th:text="${app.name}"/>
<span th:text="${testje.testNaam}"/> is echt epic

 */

    @Autowired
    private UserService userService;
    @ModelAttribute("allUsers")
    public List<User> populateUsers() {
        return this.userService.findAll();
    }

    @Autowired
    private GeneratorBlock generatorBlock;
    @GetMapping("/test")
    @ResponseBody
    public String showTest(){

        //aanmaken testobject om naar JSON te parsen
        Application application = new Application();
        DustBlock testBlock = new DustBlock();

        application.setName("TestApplicatie");
        testBlock.setName("Block1");
        application.addDustBlock(testBlock);
        return generatorBlock.generateConfig(application);
    }


    @RequestMapping({"/","/home"})
    @ResponseBody
    public String showHomepage(){
        return "Hello world";
    }

}