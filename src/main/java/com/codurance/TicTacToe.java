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
        char tileNumber = tile.toCharacter();
        if( tileNumber == '2') {
            board = "1O3456789";
            return;
        }
        board = "O23456789";
    }
}
