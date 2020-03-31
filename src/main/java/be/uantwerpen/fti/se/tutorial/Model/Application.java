package be.uantwerpen.fti.se.tutorial.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Application {
    String name= "";
    //ArrayList<Template> templates;
    ArrayList<DustBlock> dustBlocks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DustBlock> getDustblocks() {
        return dustBlocks;
    }

    public void setDustblocks(ArrayList<DustBlock> dustblocks) {
        this.dustBlocks = dustblocks;
    }

    public void addDustBlock(DustBlock dustBlock) {
        this.dustBlocks.add(dustBlock);
    }
}
