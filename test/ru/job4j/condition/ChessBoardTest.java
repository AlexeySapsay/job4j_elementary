package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

    @Test
    public void when0066Then6() {
        int way = ChessBoard.way(0, 0, 6, 6);
        assertThat(way, is(6));
    }

    @Test
    public void when0055Then5() {
        int way = ChessBoard.way(0, 0, 5, 5);
        assertThat(way, is(5));
    }

    @Test
    public void when1100Then1() {
        int way = ChessBoard.way(1, 1, 0, 0);
        assertThat(way, is(1));
    }

    @Test
    public void when0088Then8() {
        int way = ChessBoard.way(0, 0, 8, 8);
        assertThat(way, is(8));
    }
}