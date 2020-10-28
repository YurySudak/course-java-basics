package com.rakovets.course.javabasics.practice.generics;

import com.rakovets.course.javabasics.practice.generics.pair.Pair;
import com.rakovets.course.javabasics.practice.generics.pair.PairUtil;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    void pairTest() {
        Pair<Integer, String> pair = new Pair(10, "ten");
        PairUtil<Integer, String> pairUtil = new PairUtil<>();
        Pair<String, Integer> swapedPair = pairUtil.swap(pair);
        assertEquals("ten", swapedPair.getKey());
        assertEquals(10, swapedPair.getValue());

        Pair<Double, Integer> pair2 = new Pair(9.99, 10);
        PairUtil<Double, Integer> pairUtil2 = new PairUtil<>();
        Pair<Integer, Double> swapedPair2 = pairUtil2.swap(pair2);
        assertEquals(10, swapedPair2.getKey());
        assertEquals(9.99, swapedPair2.getValue());
    }
}
