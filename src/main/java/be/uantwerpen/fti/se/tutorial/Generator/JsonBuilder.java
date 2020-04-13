package be.uantwerpen.fti.se.tutorial.Generator;

import be.uantwerpen.fti.se.tutorial.Model.Application;
import be.uantwerpen.fti.se.tutorial.Model.DustBlock;
import be.uantwerpen.fti.se.tutorial.Model.Serializer.ApplicationSerializer;
import be.uantwerpen.fti.se.tutorial.Model.Template;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;


public class JsonBuilder {
    public String makeJson(Application application){
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        String json = gson.toJson(application);
        return json;
    }

    public String makeJsonTemplates(Application application){
        GsonBuilder gsonBuilder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting();
        //Type dustBlockType = new TypeToken<HashMap<String, DustBlock>>(){}.getType();
        Type dustBlockType = new TypeToken<HashMap<String, DustBlock>>() {
        }.getType();
        Type templateType = new TypeToken<Template>(){}.getType();
        JsonSerializer<Application> serializer = new JsonSerializer<Application>() {
            @Override
            public JsonElement serialize
                    (Application src, Type TypeOfSrc, JsonSerializationContext context) {



                JsonObject jObject = new JsonObject();

                JsonElement blocks = context.serialize(src.getDustBlockHashMap(), dustBlockType);
                JsonElement template = context.serialize(src.get_templatesMap(),templateType);
                jObject.add("_templatesCUSTOM",template);
                jObject.add("blocksCustom", blocks);
                return jObject;
            }
        };
        gsonBuilder.registerTypeAdapter(dustBlockType,serializer);
        Gson customGson = gsonBuilder.create();
        return customGson.toJson(application.get_templatesMap());
    }

    public String makeJsonDustBlocks(Application application){
        GsonBuilder gsonBuilder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting();
        //Type dustBlockType = new TypeToken<HashMap<String, DustBlock>>(){}.getType();
        Type dustBlockType = new TypeToken<HashMap<String, DustBlock>>() {
        }.getType();
        Type templateType = new TypeToken<Template>(){}.getType();
        JsonSerializer<Application> serializer = new JsonSerializer<Application>() {
            @Override
            public JsonElement serialize
                    (Application src, Type TypeOfSrc, JsonSerializationContext context) {



                JsonObject jObject = new JsonObject();

                JsonElement blocks = context.serialize(src.getDustBlockHashMap(), dustBlockType);
                JsonElement template = context.serialize(src.get_templatesMap(),templateType);
                jObject.add("_templatesCUSTOM",template);
                jObject.add("blocksCustom", blocks);
                return jObject;
            }
        };
        gsonBuilder.registerTypeAdapter(dustBlockType,serializer);
        Gson customGson = gsonBuilder.create();
        return customGson.toJson(application.getDustBlockHashMap());
    }
    }

