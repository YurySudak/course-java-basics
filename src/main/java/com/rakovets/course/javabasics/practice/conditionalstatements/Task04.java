package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог, если известно:
 *
 * @param weekDayNumber - номер дня недели
 * @return день недели на английском языке (lower case)
 */
public class Task04 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int weekdayNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String weekDay = "Are you hucker?";
        switch (weekdayNumber) {
            case 1:
                weekDay = "monday";
                break;
            case 2:
                weekDay = "tuesday";
                break;
            case 3:
                weekDay = "wednesday";
                break;
            case 4:
                weekDay = "thursday";
                break;
            case 5:
                weekDay = "friday";
                break;
            case 6:
                weekDay = "saturday";
                break;
            case 7:
                weekDay = "sunday";
                break;
        }
        System.out.println(weekDay);
    }
}