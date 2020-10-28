package com.rakovets.course.javabasics.practice.jcf.map;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {

    @Test
    void test1() {
        String text = "Hash table based implementation of the Map interface Hash Map interface Hash";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);
        assertEquals(8, textMonitoring.getCountUniqueWords());
        assertEquals("[the, based, implementation, of, Hash, interface, Map, table]", textMonitoring.getUniqueWords().toString());
        assertEquals(3, textMonitoring.get("Hash"));
        assertEquals(2, textMonitoring.get("interface"));
        assertEquals(1, textMonitoring.get("table"));
        assertEquals("{the=1, based=1, implementation=1, of=1, table=1, interface=2, Map=2, Hash=3}", textMonitoring.getWordFrequencyDesc(true).toString());
        assertEquals("{Hash=3, interface=2, Map=2, the=1, based=1, implementation=1, of=1, table=1}", textMonitoring.getWordFrequencyDesc(false).toString());
    }
}
