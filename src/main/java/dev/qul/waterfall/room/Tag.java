package dev.qul.waterfall.room;

import java.util.ArrayList;

public class Tag {
    private String name;
    private boolean isVisable;
    private boolean isGametag;

    private ArrayList<Game> games;
    private ArrayList<Version> versions;

    private static ArrayList<Tag> all_tags;

    public Tag(String path) {

    }
}
