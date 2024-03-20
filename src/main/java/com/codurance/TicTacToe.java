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
        board = board.replace(tileNumber, 'O');
    }

    public boolean isWin() {
        Row topRow = new Row(board.substring(0, 3));
        Row middleRow = new Row(board.substring(3, 6));
        Row bottomRow = new Row(board.substring(6, 9));

        return topRow.isWin() || middleRow.isWin() || bottomRow.isWin();
    }
}
