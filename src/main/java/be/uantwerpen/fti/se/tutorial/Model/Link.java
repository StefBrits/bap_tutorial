package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;

public class Link {
    @SerializedName("channels")
    @Expose
    HashMap<String,Channel> channelHashMap = new HashMap<>();


    ArrayList<Channel> channels = new ArrayList<>();


    public Link() {
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public HashMap<String, Channel> getChannelHashMap() {
        return channelHashMap;
    }

    public void setChannelHashMap(HashMap<String, Channel> channelHashMap) {
        this.channelHashMap = channelHashMap;
    }
}
