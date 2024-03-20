package com.codurance;

public class Tile {
    private final int tileNumber;

    public Tile(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    public char toCharacter() {
        return (char) (tileNumber + '0');
    }
}
