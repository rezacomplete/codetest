package com.rezacomplete.codetest;

import java.util.List;

/**
 * Created by Reza on 4/15/2020.
 */
public class Result {

    private List<Integer> losers;
    private int winner;

    public List<Integer> getLosers() {
        return losers;
    }

    public void setLosers(List<Integer> losers) {
        this.losers = losers;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}
