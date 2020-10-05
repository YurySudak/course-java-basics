package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String result = "undefined";
        if (letter >= '\u0400' && letter <= '\u04FF')
            result = "cyrillic";
        if (letter >= '\u0030' && letter <= '\u0039')
            result = "digit";
        if (letter >= '\u0041' && letter <= '\u007A')
            if (letter < '\u005B' || letter > '\u0060')
                result = "latin";
        System.out.println(result);
    }
}