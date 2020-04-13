package be.uantwerpen.fti.se.tutorial.Generator;

import be.uantwerpen.fti.se.tutorial.Model.Addon;
import be.uantwerpen.fti.se.tutorial.Model.Application;
import be.uantwerpen.fti.se.tutorial.Model.Transport;
import com.google.gson.*;

import java.lang.reflect.Type;

public class IgnoreZero implements ExclusionStrategy {
    public boolean shouldSkipClass(Class<?> arg0) {
        return false;
    }

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        Addon addon = new Addon();
        Transport transport = new Transport();

        return (f.getDeclaringClass() == Transport.class && transport.getPort() ==0)||
                (f.getDeclaringClass() == Addon.class && addon.getBatch_size() == 0);
    }
}
