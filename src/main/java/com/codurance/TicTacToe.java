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
        String middleRow = board.substring(3, 6);
        return topRow.equals("XXX") || middleRow.equals("XXX") || board.equals("123456XXX");
    }
}
