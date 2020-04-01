package be.uantwerpen.fti.se.tutorial.Generator;

import be.uantwerpen.fti.se.tutorial.Model.Application;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonBuilder {
    public String makeJson(Application application){
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        String json = gson.toJson(application);
        return json;
    }
}
