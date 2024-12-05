package dev.qul.waterfall.room;

import java.util.ArrayList;

public class Library {
    private ArrayList<Game> games;
    private ArrayList<Tag<Game>> game_tags;

    public Library() {
        Tag<Game> game_tag = new Tag<Game>("#Hello");
        Tag<Version> version_tag = new Tag<Version>(":World");

        System.out.println(game_tag.getName()+": "+game_tag.isVisable());
        System.out.println(version_tag.getName()+": "+version_tag.isVisable());
    }

    // Getters and setters
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<Tag<Game>> getGame_tags() {
        return game_tags;
    }

    public void setGame_tags(ArrayList<Tag<Game>> game_tags) {
        this.game_tags = game_tags;
    }
}
