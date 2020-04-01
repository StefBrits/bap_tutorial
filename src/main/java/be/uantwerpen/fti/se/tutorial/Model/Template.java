package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class Template {
    @Expose
    String name;
    @Expose
    ArrayList<Transport> transports_T = new ArrayList<>();
    @Expose
    ArrayList<Addon> addons_T = new ArrayList<>();

    public Template() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport> getTransports_T() {
        return transports_T;
    }

    public void setTransports_T(ArrayList<Transport> transports_T) {
        this.transports_T = transports_T;
    }

    public ArrayList<Addon> getAddons_T() {
        return addons_T;
    }

    public void setAddons_T(ArrayList<Addon> addons_T) {
        this.addons_T = addons_T;
    }

    public void addTransport_T(Transport transport) {
        this.transports_T.add(transport);
    }

    public void addAddon_T(Addon addon) {
        this.addons_T.add(addon);
    }

}
