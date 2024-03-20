package com.codurance;

public class TicTacToe {
    String board = "123456789";
    public String showBoard() {
        return board;
    }

    public void placeX(Tile tile) {
        char tileNumber = tile.toCharacter();
        board = board.replace(tileNumber, 'X');
    }

    public void placeO(Tile tile) {
        board = "O23456789";
    }
}
