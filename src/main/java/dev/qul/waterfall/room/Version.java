package dev.qul.waterfall.room;

import java.util.ArrayList;

public class Version {
    private String name;
    private ArrayList<Patch> patches;
    private ArrayList<Tag<Version>> tags;
    private Game game;
    private boolean isDefault;

    public Version(String path) {

    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Patch> getPatches() {
        return patches;
    }

    public void setPatches(ArrayList<Patch> patches) {
        this.patches = patches;
    }

    public ArrayList<Tag<Version>> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag<Version>> tags) {
        this.tags = tags;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
