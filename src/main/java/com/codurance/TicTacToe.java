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
        String topRow = board.substring(0, 3);
        return topRow.equals("XXX") || board.equals("123XXX789") || board.equals("123456XXX");
    }
}
