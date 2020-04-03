package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;

public class Template {

    String name;



    @Expose
    ArrayList<Addon_Template> addons = new ArrayList<>();

    @SerializedName("transport")
    @Expose
    Transport_Template transport;

    //HashMap<String,Transport_Template> transportTemplateHashMap = new HashMap<>();

    //niet in json steken
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

    public Transport_Template getTransport() {
        return transport;
    }

    public void setTransport(Transport_Template transport) {
        this.transport = transport;
    }
}
