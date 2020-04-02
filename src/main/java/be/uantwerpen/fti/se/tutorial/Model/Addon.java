package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;

public class Addon {
    @Expose
    String type = "default-addon-type";
    @Expose
    int batch_size;

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
}
