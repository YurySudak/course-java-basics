package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 *
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 *
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String chineseSign = "";
        String zodiacSign = "";
        if ((year - 1900) % 12 == 0) chineseSign = "Rat";
        if ((year - 1901) % 12 == 0) chineseSign = "Ox";
        if ((year - 1902) % 12 == 0) chineseSign = "Tiger";
        if ((year - 1903) % 12 == 0) chineseSign = "Rabbit";
        if ((year - 1904) % 12 == 0) chineseSign = "Dragon";
        if ((year - 1905) % 12 == 0) chineseSign = "Snake";
        if ((year - 1906) % 12 == 0) chineseSign = "Horse";
        if ((year - 1907) % 12 == 0) chineseSign = "Ram";
        if ((year - 1908) % 12 == 0) chineseSign = "Monkey";
        if ((year - 1909) % 12 == 0) chineseSign = "Rooster";
        if ((year - 1910) % 12 == 0) chineseSign = "Dog";
        if ((year - 1911) % 12 == 0) chineseSign = "Pig";

        if ((month == 1 && day <= 20) || (month == 12 && day >=22)) zodiacSign = "Goat";
        if ((month == 2 && day <= 19) || (month == 1 && day >=21)) zodiacSign = "Water-bearer";
        if ((month == 3 && day <= 20) || (month == 2 && day >=20)) zodiacSign = "Fish";
        if ((month == 4 && day <= 20) || (month == 3 && day >=21)) zodiacSign = "Ram";
        if ((month == 5 && day <= 20) || (month == 4 && day >=21)) zodiacSign = "Bull";
        if ((month == 6 && day <= 21) || (month == 5 && day >=21)) zodiacSign = "Twins";
        if ((month == 7 && day <= 22) || (month == 6 && day >=22)) zodiacSign = "Crab";
        if ((month == 8 && day <= 22) || (month == 7 && day >=23)) zodiacSign = "Lion";
        if ((month == 9 && day <= 21) || (month == 8 && day >=23)) zodiacSign = "Maiden";
        if ((month == 10 && day <= 22) || (month == 9 && day >=22)) zodiacSign = "Scales";
        if ((month == 11 && day <= 22) || (month == 10 && day >=23)) zodiacSign = "Scorpion";
        if ((month == 12 && day <= 21) || (month == 11 && day >=23)) zodiacSign = "Archer";
        System.out.println("Zodiac Sign: " + zodiacSign + ". Chinese Zodiac: " + chineseSign);

    }
}