package com.rakovets.course.javabasics.practice.jcf.collection;

import java.util.Collection;
import java.util.Iterator;

public class StringCollectionUtil {

    public static Collection<String> resetWordsByLength(Collection<String> collection, int length) {
        Iterator<String> iterator = collection.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (iterator.next().length() == length) {
                iterator.remove();
                i++;
            }
        }
        while (i > 0) {
            collection.add("*");
            i--;
        }
        return collection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> collection, int length) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == length) {
                iterator.remove();
            }
        }
        return collection;
    }
}
