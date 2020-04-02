package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;


public class Application {
    String name= "default-application-name";
    @Expose
    ArrayList<Template> _templates = new ArrayList<>();
    @Expose
    ArrayList<DustBlock> dustBlocks = new ArrayList<>();


    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DustBlock> getDustblocks() {
        return dustBlocks;
    }

    public void setDustblocks(ArrayList<DustBlock> dustblocks) {
        this.dustBlocks = dustblocks;
    }

    public void addDustBlock(DustBlock dustBlock) {

        this.dustBlocks.add(dustBlock);
    }

    public ArrayList<Template> get_templates() {
        return _templates;
    }

    public void set_templates(ArrayList<Template> _templates) {
        this._templates = _templates;
    }

    public void addTemplate(Template template) {
        this._templates.add(template);
    }
}
