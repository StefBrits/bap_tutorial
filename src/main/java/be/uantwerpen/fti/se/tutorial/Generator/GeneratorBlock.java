package be.uantwerpen.fti.se.tutorial.Generator;

import be.uantwerpen.fti.se.tutorial.Generator.JsonBuilder;
import be.uantwerpen.fti.se.tutorial.Model.Application;
import org.springframework.stereotype.Component;

@Component
public class GeneratorBlock {
    public String generateConfig(Application application) {
        JsonBuilder json = new JsonBuilder();
        return json.makeJson(application);
    }

}