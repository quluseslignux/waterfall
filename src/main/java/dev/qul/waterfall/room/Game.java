package dev.qul.waterfall.room;

import java.util.ArrayList;

public class Game {

    //Attributes
    private Library library;
    private String id;
    private String slug;
    private String title;
    private String description;
    private String developer;
    private String publisher;
    private Graphics graphics;
    private ArrayList<Tag<Game>> game_tags;
    private ArrayList<Tag<Version>> version_tags;
    private ArrayList<Version> verions;

    public Game() {

    }

    //Getters and setters

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public ArrayList<Tag<Game>> getGame_tags() {
        return game_tags;
    }

    public void setGame_tags(ArrayList<Tag<Game>> game_tags) {
        this.game_tags = game_tags;
    }

    public ArrayList<Tag<Version>> getVersion_tags() {
        return version_tags;
    }

    public void setVersion_tags(ArrayList<Tag<Version>> version_tags) {
        this.version_tags = version_tags;
    }
}