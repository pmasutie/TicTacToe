package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowShould {
    @Test
    public void be_a_win_if_XXX() {
        Row row = new Row("XXX");

        assertTrue(row.isWin());
    }

    @Test
    public void not_be_a_win_if_XOX() {
        Row row = new Row("XOX");

        assertFalse(row.isWin());
    }

    @Test
    public void be_a_win_if_OOO() {
        Row row = new Row("OOO");

        assertTrue(row.isWin());
    }

}