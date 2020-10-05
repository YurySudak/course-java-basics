package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String month;
        switch (monthNumber) {
            case 1:
                month = "JANUARY";
                break;
            case 2:
                month = "FEBRUARY";
                break;
            case 3:
                month = "MARCH";
                break;
            case 4:
                month = "APRIL";
                break;
            case 5:
                month = "MAY";
                break;
            case 6:
                month = "JUNE";
                break;
            case 7:
                month = "JULY";
                break;
            case 8:
                month = "AUGUST";
                break;
            case 9:
                month = "SEPTEMBER";
                break;
            case 10:
                month = "OCTOBER";
                break;
            case 11:
                month = "NOVEMBER";
                break;
            case 12:
                month = "DECEMBER";
                break;
            default:
                month = "Don't play with me!";
        }
        System.out.println(month);
    }
}