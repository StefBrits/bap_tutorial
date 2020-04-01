package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class Template {
    @Expose
    String name = "example-template";
    @Expose
    ArrayList<Transport> transports = new ArrayList<>();
    @Expose
    ArrayList<Addon> addons = new ArrayList<>();

    public Template() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport> getTransports() {
        return transports;
    }

    public void setTransports(ArrayList<Transport> transports) {
        this.transports = transports;
    }

    public ArrayList<Addon> getAddons() {
        return addons;
    }

    public void setAddons(ArrayList<Addon> addons) {
        this.addons = addons;
    }

    public void addTransport_T(Transport transport) {
        this.transports.add(transport);
    }

    public void addAddon_T(Addon addon) {
        this.addons.add(addon);
    }

}
