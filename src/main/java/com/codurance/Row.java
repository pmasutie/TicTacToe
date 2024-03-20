package com.codurance;

public class Row {
    private final String substring;

    public Row(String substring) {
        this.substring = substring;
    }

    public boolean isWin() {
        return substring.equals("XXX") || substring.equals("OOO");
    }
}
