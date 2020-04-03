package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class Channel {


    String name = "default-channel-name";
    @Expose
    String templateName;
    @Expose
    ArrayList<Addon> addons = new ArrayList<>();
    @Expose
    Transport transport;

    Template template;




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

    /*
    public ArrayList<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(ArrayList<Template> templates) {
        this.templates = templates;
    }

    public void addTemplates(Template template) {
        this.templates.add(template);
    }
    */
    public void addAddon(Addon addon) {
        this.addons.add(addon);
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
