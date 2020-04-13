package be.uantwerpen.fti.se.tutorial.Model.Serializer;

        import be.uantwerpen.fti.se.tutorial.Model.Application;
        import be.uantwerpen.fti.se.tutorial.Model.DustBlock;
        import be.uantwerpen.fti.se.tutorial.Model.Template;
        import com.google.gson.JsonElement;
        import com.google.gson.JsonObject;
        import com.google.gson.JsonSerializationContext;
        import com.google.gson.JsonSerializer;
        import com.google.gson.reflect.TypeToken;

        import java.lang.reflect.Type;
        import java.util.HashMap;

        import static com.google.gson.JsonObject.*;

public class ApplicationSerializer implements JsonSerializer<Application> {
    @Override
    public JsonElement serialize
            (Application src, Type TypeOfSrc, JsonSerializationContext context) {
        Type dustBlockType = new TypeToken<HashMap<String,DustBlock>>(){}.getType();
        //Type templateType = new TypeToken<Template>(){}.getType();

        JsonObject jObject = new JsonObject();

        JsonElement blocks = context.serialize(src.getDustBlocks(),dustBlockType);
        //JsonElement template = context.serialize(src.get_templates(),templateType);
        //jObject.add("_templatesomo",template);
        jObject.add("omo",blocks);
        return jObject;
    }
}
