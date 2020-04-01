package be.uantwerpen.fti.se.tutorial.Controller;

import be.uantwerpen.fti.se.tutorial.Generator.GeneratorBlock;
import be.uantwerpen.fti.se.tutorial.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private GeneratorBlock generatorBlock;
    @GetMapping("/test")
    @ResponseBody
    public String showTest(){

        //aanmaken testobject om naar JSON te parsen
        Application testapplication = new Application();
        DustBlock testBlock = new DustBlock();
        DustBlock testBlock2 = new DustBlock();
        Link testLink = new Link();
        Link testLink2 = new Link();
        Channel testChannel = new Channel();
        Channel testChannel2 = new Channel();
        Addon testAddon = new Addon();
        Transport testTransport = new Transport();
        Transport testTransport2 = new Transport();

        Template testTemplate = new Template();
        Transport testTransport_T = new Transport();
        Addon testAddon_T = new Addon();

        //nieuwe applicatie
        testapplication.setName("TestApplicatie");
        testapplication.addTemplate(testTemplate);


        //nieuwe DUST block toevoegen aan applicatie en een link + naam geven
        testBlock.setName("publisher");
        testBlock2.setName("subscriber");
        testapplication.addDustBlock(testBlock);
        testapplication.addDustBlock(testBlock2);
        testBlock.setLink(testLink);
        testBlock2.setLink(testLink2);

        //link een naam en channel geven
        testLink.addChannel(testChannel);
        testLink2.addChannel(testChannel2);

        //channel naam en template geven
        //testChannel.addAddon(testAddon);
        testChannel.setTemplate(testTemplate);
        testChannel.setName("publish-tcp");
        testChannel2.setTemplate(testTemplate);
        testChannel2.setName("subscribe-tcp");

        //batch addon type en size geven
        testAddon.setBatch_size(2);
        testAddon.setType("Batch");

        testTransport.setPublish(true);
        testTransport.setHost_server(false);

        testTransport2.setPublish(false);
        testTransport2.setHost_server(true);

        testAddon_T.setType("templateAddonType");
        testAddon_T.setBatch_size(12);

        testTemplate.addAddon_T(testAddon_T);
        testTemplate.addTransport_T(testTransport_T);

        ////////////////////////////////////////////////////



        return generatorBlock.generateConfig(testapplication);
    }


    @RequestMapping({"/","/home"})
    @ResponseBody
    public String showHomepage(){
        return "Hello world";
    }

}