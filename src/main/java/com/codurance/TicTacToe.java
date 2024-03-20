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
        String firstColumn = "" + board.charAt(0) + board.charAt(3) + board.charAt(6);
        String secondColumn = "" + board.charAt(1) + board.charAt(4) + board.charAt(7);
        String thirdColumn = "" + board.charAt(2) + board.charAt(5) + board.charAt(8);

        return topRow.isWin() || middleRow.isWin() || bottomRow.isWin() || firstColumn.equals("XXX") || secondColumn.equals("XXX") || thirdColumn.equals("XXX");
    }
}
