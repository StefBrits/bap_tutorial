package be.uantwerpen.fti.se.tutorial;

import be.uantwerpen.fti.se.tutorial.Model.Application;
import org.springframework.stereotype.Component;

@Component
public class GeneratorBlock {
    //Application application = new Application();

    public String generateConfig(Application application) {
        JsonBuilder json = new JsonBuilder();
        return json.makeJson(application);
    }
}
