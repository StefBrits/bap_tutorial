package be.uantwerpen.fti.se.tutorial.Model.Serializer;

import be.uantwerpen.fti.se.tutorial.Model.Application;
import be.uantwerpen.fti.se.tutorial.Model.Template;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class TemplateSerializer implements JsonSerializer<Template> {

    @Override
    public JsonElement serialize(Template template, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jObject = new JsonObject();
        return jObject;
    }
}