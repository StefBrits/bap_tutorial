package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class Addon {
    @Expose
    String type;
    @Expose
    int batch_size;



    HashMap<String, Integer> addonMap = new HashMap<String, Integer>();

    public Addon() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBatch_size() {
        return batch_size;
    }

    public void setBatch_size(int batch_size) {
        this.batch_size = batch_size;
    }

    public HashMap<String, Integer> getAddonMap() {
        return addonMap;
    }

    public void setAddonMap(HashMap<String, Integer> addonMap) {
        this.addonMap = addonMap;
    }
}
