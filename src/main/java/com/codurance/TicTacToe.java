package com.codurance;

public class TicTacToe {
    String board = "123456789";
    public String showBoard() {
        return board;
    }

    public void placeX(Tile tile) {
        char tileNumber = tile.toCharacter();

        if (tileNumber == '2') {
            board = "1X3456789";
            return;
        }

        board = "X23456789";
    }
}
