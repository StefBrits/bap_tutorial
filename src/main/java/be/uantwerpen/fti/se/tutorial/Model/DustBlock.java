package be.uantwerpen.fti.se.tutorial.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DustBlock {
    String name = "dustBlockName";
    //ArrayList<Channel> channels;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
