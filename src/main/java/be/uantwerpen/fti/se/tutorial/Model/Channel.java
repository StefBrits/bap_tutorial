package be.uantwerpen.fti.se.tutorial.Model;

import java.util.ArrayList;

public class Channel {
    String name;
    ArrayList<Addon> addons;
    Transport transport;
    ArrayList<Template> templates;

    public Channel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Addon> getAddons() {
        return addons;
    }

    public void setAddons(ArrayList<Addon> addons) {
        this.addons = addons;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public ArrayList<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(ArrayList<Template> templates) {
        this.templates = templates;
    }

    public void addAddon(Addon addon) {
        this.addons.add(addon);
    }

    public void addTemplates(Template template) {
        this.templates.add(template);
    }
}
