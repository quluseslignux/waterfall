package dev.qul.waterfall.room;

import java.util.ArrayList;

public class Tag<E> extends ArrayList<E> {
    private String name;
    private boolean isVisable;

    public Tag(String path) //Example Tag<Game> tag = new Tag<Game>("#combat")
    {
        this.isVisable=path.startsWith("#");
        this.name=path.substring(1);
    }
    @Override
    public boolean add(E element)
    {
        if(element instanceof Game)
        {
            ((Game) element).getGame_tags().add((Tag<Game>) this); // Adding this tag to the list of all tags of the game
            ((Game) element).getLibrary().getGame_tags().add((Tag<Game>) this); // Adding this tag to the list of all game tags of the library
        }
        else if (element instanceof Version)
        {
            ((Version) element).getTags().add((Tag<Version>) this); // Adding this tag to the list of all the tags of this version
            ((Version) element).getGame().getVersion_tags().add((Tag<Version>) this); // Adding this tag to the list of all version tags of the game
        }
        return super.add(element);
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisable() {
        return isVisable;
    }

    public void setVisable(boolean visable) {
        isVisable = visable;
    }
}
