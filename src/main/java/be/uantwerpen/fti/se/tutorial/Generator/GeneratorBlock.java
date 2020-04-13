package be.uantwerpen.fti.se.tutorial.Generator;

import be.uantwerpen.fti.se.tutorial.Generator.JsonBuilder;
import be.uantwerpen.fti.se.tutorial.Model.Application;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

@Component
public class GeneratorBlock {
    public String generateConfig(Application application) {
        JsonBuilder json = new JsonBuilder();
        String tempJson = json.makeJsonTemplates(application);
        String tempJson2 = json.makeJsonDustBlocks(application);
        tempJson = tempJson.substring(0,tempJson.length()-1);

        tempJson = tempJson + ",";
        tempJson2 = tempJson2.substring(1);

        String samen = tempJson.concat(tempJson2);

        return samen;
    }

}
