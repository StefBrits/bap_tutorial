package be.uantwerpen.fti.se.tutorial.Controller;

import be.uantwerpen.fti.se.tutorial.Generator.GeneratorBlock;
import be.uantwerpen.fti.se.tutorial.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

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

        //aanmaken testobject templates
        Template testTemplate = new Template();
        Transport testTransport_T = new Transport();
        Transport_Template testTransport_Template = new Transport_Template();
        Addon testAddon_T = new Addon();
        Addon_Template testAddon_Template = new Addon_Template();


        HashMap<String,Template> testTemplatesMap = new HashMap<>();
        HashMap<String,Transport_Template> testTransportTemplateMap = new HashMap<>();
        HashMap<String,DustBlock> testDustBlocksMap = new HashMap<>();
        HashMap<String,Channel> testChannelMap = new HashMap<>();
        HashMap<String,Channel> testChannelMap2 = new HashMap<>();
        HashMap<String,Integer> testAddonMap = new HashMap<>();

        //nieuwe applicatie + Maps
        testapplication.setName("TestApplicatie");
        //testapplication.addTemplate(testTemplate);
        testTemplatesMap.put("default-template",testTemplate);
        testTransportTemplateMap.put("transport",testTransport_Template);
        testDustBlocksMap.put("publisher",testBlock);
        testDustBlocksMap.put("subscriber",testBlock2);
        testChannelMap.put("publish-tcp",testChannel);
        testChannelMap2.put("subscribe-tcp", testChannel2);
        testAddonMap.put("batch_size",2);

        //HASHMAP BABY
        testapplication.set_templatesMap(testTemplatesMap);
        testapplication.setDustBlockHashMap(testDustBlocksMap);
        testTemplate.setTransport(testTransport_Template);
        testLink.setChannelHashMap(testChannelMap);
        testLink2.setChannelHashMap(testChannelMap2);
        testAddon.setAddonMap(testAddonMap);

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
        testChannel.addAddon(testAddon);
        testChannel2.addAddon(testAddon);
        testChannel.setTransport(testTransport);
        testChannel2.setTransport(testTransport2);

        //template naam geven
        testChannel.setTemplateName("default-template");
        testChannel2.setTemplateName("default-template");


        //batch addon type en size geven
        testAddon.setBatch_size(2);
        testAddon.setType("batch");


        testTransport.setPublish(true);
        testTransport.setHost_server(false);



        testTransport2.setPublish(false);
        testTransport2.setHost_server(true);

        testTransport_Template.setType("socket");
        testTransport_Template.setProtocol("tcp");
        testTransport_Template.setAddress("127.0.0.1");
        testTransport_Template.setPort(3000);

        testAddon_Template.setType("batch");
        testAddon_Template.setBatch_size(2);

        testTemplate.addAddon_T(testAddon_Template);
        testTemplate.addTransport_T(testTransport_Template);

        ////////////////////////////////////////////////////



        return generatorBlock.generateConfig(testapplication);
    }


    @RequestMapping({"/","/home"})
    @ResponseBody
    public String showHomepage(){
        return "Hello world";
    }

}