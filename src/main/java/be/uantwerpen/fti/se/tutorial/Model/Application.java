package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;


public class Application {
    String name= "default-application-name";
    @SerializedName("_templates")
    @Expose
    HashMap<String, Template> _templatesMap = new HashMap<>();

    @SerializedName("Deze string moet weg maar hier komen de blocks")
    @Expose
    HashMap<String, DustBlock> dustBlockHashMap = new HashMap<>();

    ArrayList<Template> _templates = new ArrayList<>();
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

    public ArrayList<DustBlock> getDustBlocks() {
        return dustBlocks;
    }

    public void setDustBlocks(ArrayList<DustBlock> dustBlocks) {
        this.dustBlocks = dustBlocks;
    }

    public HashMap<String, Template> get_templatesMap() {
        return _templatesMap;
    }

    public void set_templatesMap(HashMap<String, Template> _templatesMap) {
        this._templatesMap = _templatesMap;
    }

    public HashMap<String, DustBlock> getDustBlockHashMap() {
        return dustBlockHashMap;
    }

    public void setDustBlockHashMap(HashMap<String, DustBlock> dustBlockHashMap) {
        this.dustBlockHashMap = dustBlockHashMap;
    }
}
