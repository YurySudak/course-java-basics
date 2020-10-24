package com.rakovets.course.javabasics.practice.generics;

import com.rakovets.course.javabasics.practice.generics.pair.Pair;
import com.rakovets.course.javabasics.practice.generics.pair.PairUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    void pairTest() {
        Pair<Integer, String> pair = new Pair(10, "ten");
        Pair<String, Integer> swapedPair = PairUtil.swap(pair);
        Assertions.assertEquals("ten", swapedPair.getKey());
        Assertions.assertEquals(10, swapedPair.getValue());
        Pair<Double, Integer> pair2 = new Pair(9.99, 10);
        Pair<Integer, Double> swapedPair2 = PairUtil.swap(pair2);
        Assertions.assertEquals(10, swapedPair2.getKey());
        Assertions.assertEquals(9.99, swapedPair2.getValue());
    }
}
