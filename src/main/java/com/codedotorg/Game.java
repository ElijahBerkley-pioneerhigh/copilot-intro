package com.codedotorg;

public class Game implements Comparable{
    
    /** The title of a game */
    private String title;

    /**
     * Constructor for the Game class.
     *
     * @param title The title of the game.
     */
    public Game(String title) {
        this.title = title;
    }

    /**
     * Gets the title of the game.
     * @return String The title of the game.
     */
    public String getTitle() {
        return title;
    }

    public int compareTo(Object o) {
        Game other = (Game) o;
        return this.title.compareTo(other.title);
    }
}
