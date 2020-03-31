package be.uantwerpen.fti.se.tutorial;

import be.uantwerpen.fti.se.tutorial.Model.Application;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class JsonBuilder {
    public String makeJson(Application application){
        //Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        Gson gson = new Gson();
        String json = gson.toJson(application);
        return json;
    }
}
