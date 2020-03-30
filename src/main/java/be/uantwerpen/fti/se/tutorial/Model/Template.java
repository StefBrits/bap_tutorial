package be.uantwerpen.fti.se.tutorial.Model;

import java.util.ArrayList;

public class Template {
    String name;
    ArrayList<Transport> transports_T;
    ArrayList<Addon> addons_T;

    public Template(String name, ArrayList<be.uantwerpen.fti.se.tutorial.Model.Transport> transports_T, ArrayList<be.uantwerpen.fti.se.tutorial.Model.Addon> addons_T) {
        this.name = name;
        this.transports_T = transports_T;
        this.addons_T = addons_T;
    }
}
