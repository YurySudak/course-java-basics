package com.rakovets.course.javabasics.practice.generics;

import java.math.BigDecimal;
import java.util.Arrays;

public class Math {

    //Task1
    public static <T extends Comparable<T>> T max(T type1, T type2, T type3) {
        if (type1.compareTo(type2) >= 0) {
            if (type1.compareTo(type3) >= 0) {
                return type1;
            }
        }
        if (type2.compareTo(type1) >= 0) {
            if (type2.compareTo(type3) >= 0) {
                return type2;
            }
        }
        if (type3.compareTo(type1) >= 0) {
            if (type3.compareTo(type2) >= 0) {
                return type3;
            }
        }
        return null;
    }

    //Task2
    public static <T extends Comparable<T>> T min(T type1, T type2, T type3, T type4, T type5) {

        if (type1.compareTo(type2) <= 0) {
            if (type1.compareTo(type3) <= 0) {
                if (type1.compareTo(type4) <= 0) {
                    if (type1.compareTo(type5) <= 0) {
                        return type1;
                    }
                }
            }
        }

        if (type2.compareTo(type1) <= 0) {
            if (type2.compareTo(type3) <= 0) {
                if (type2.compareTo(type4) <= 0) {
                    if (type2.compareTo(type5) <= 0) {
                        return type2;
                    }
                }
            }
        }

        if (type3.compareTo(type1) <= 0) {
            if (type3.compareTo(type2) <= 0) {
                if (type3.compareTo(type4) <= 0) {
                    if (type3.compareTo(type5) <= 0) {
                        return type3;
                    }
                }
            }
        }
        if (type4.compareTo(type1) <= 0) {
            if (type4.compareTo(type2) <= 0) {
                if (type4.compareTo(type3) <= 0) {
                    if (type4.compareTo(type5) <= 0) {
                        return type4;
                    }
                }
            }
        }
        if (type5.compareTo(type1) <= 0) {
            if (type5.compareTo(type2) <= 0) {
                if (type5.compareTo(type3) <= 0) {
                    if (type5.compareTo(type4) <= 0) {
                        return type5;
                    }
                }
            }
        }
        return null;
    }

    //Task3
    public static <T extends Number> String average(T[] arr) {
        BigDecimal sum = new BigDecimal(0);
        for (T type : arr) {
            sum = sum.add(new BigDecimal(type.toString()));
        }
        return sum.divide((BigDecimal.valueOf(arr.length))).toString();
    }

    //Task4
    public static <T extends Comparable> T arrayMax(T[] arr) {
        T max = arr[0];
        for (T type : arr) {
            if (type.compareTo(max) > 0) {
                max = type;
            }
        }
        return max;
    }

    //Task5
    public static <T extends Comparable> T arrayMin(T[] arr) {
        T min = arr[0];
        for (T type : arr) {
            if (type.compareTo(min) < 0) {
                min = type;
            }
        }
        return min;
    }

    //Task6
    public static <T extends Comparable> T[] arraySort(T[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    //Task7
    public static <T extends Comparable> int arraySearch(T[] arr, T type) {
        return Arrays.binarySearch(arr, type);
    }

}
