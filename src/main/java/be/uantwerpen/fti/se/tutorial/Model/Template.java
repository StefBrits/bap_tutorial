package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class Template {
    @Expose
    String name = "example-template";
    @Expose
    ArrayList<Addon_Template> addons = new ArrayList<>();
    @Expose
    ArrayList<Transport_Template> transports = new ArrayList<>();

    public Template() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport_Template> getTransports() {
        return transports;
    }

    public void setTransports(ArrayList<Transport_Template> transports) {
        this.transports = transports;
    }

    public ArrayList<Addon_Template> getAddons() {
        return addons;
    }

    public void setAddons(ArrayList<Addon_Template> addons) {
        this.addons = addons;
    }

    public void addTransport_T(Transport_Template transport) {
        this.transports.add(transport);
    }

    public void addAddon_T(Addon_Template addon) {
        this.addons.add(addon);
    }

}
