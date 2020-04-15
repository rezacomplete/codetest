package com.rezacomplete.codetest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Reza on 4/15/2020.
 */
public class Circle {

    /**
     * Calculating complexity:
     * for n = 5 & k = 1 ==> 5 reads
     * for n = 5 & k = 2 ==> 10 reads
     * for n = 5 & k = 3 ==> 12 reads
     * for n = 5 & k = 4 ==> 16 reads
     * for n = 5 & k = 5 ==> 20 reads
     * for n = 5 & k = 6 ==> 24 reads
     * for n = 5 & k = 7 ==> 28 reads
     *
     * for the first 2 rows the complexity is kn but for the rest is k(n-1). we can ignore the k therefore
     * the complexity of this code is O(n)
     */
    public static Result executeCircle(int numberOfChildren,int k) {
        validateInputs(numberOfChildren, k);

        List<Integer> children = new LinkedList<>();
        List<Integer> losers = new ArrayList<>();

        //initializing the circle table
        for (int i = 1; i <= numberOfChildren; i++) {
            children.add(i);
        }

        int index = 0;
        while (!children.isEmpty()) {
            index = index + k - 1;
            while (index >= children.size()) {
                index = index - children.size();
            }

            int looser = children.remove(index);
            losers.add(looser);
        }

        int winner = losers.remove(losers.size() - 1);

        Result result = new Result();
        result.setLosers(losers);
        result.setWinner(winner);

        return result;
    }

    private static void validateInputs(int numberOfChildren, int k) {
        if (numberOfChildren <= 0) {
            throw new InvalidNumberOfChildren("Number of children should be more than zero");
        }

        if (k <= 0) {
            throw new InvalidIndex("K should be greater than zero");
        }
    }
}
