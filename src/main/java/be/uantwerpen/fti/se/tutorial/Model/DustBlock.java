package be.uantwerpen.fti.se.tutorial.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class DustBlock {
    String name = "dustBlockName";
    Link link;

    public DustBlock() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
