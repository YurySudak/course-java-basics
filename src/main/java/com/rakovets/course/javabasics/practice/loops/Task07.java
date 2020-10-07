package com.rakovets.course.javabasics.practice.loops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Разработать программу для фитнес браслета:
 * Программа позволяет расчитать пробег, который необходимо совершить спортсмену для подготовки к марафону. Известно:
 *
 * @param startDistance  дистанция которую пробегает спортсмен до начала тренировок
 * @param finishDistance дистанция которую желает пробежать спортсмен после окончания тренировок
 * @param dailyProgress  ежедневный прогресс % по одношению к предыдущему забегу
 * @author Dmitry Rakovets
 * @version 1.0
 * @return пробег (точность 10 метров)
 */
public class Task07 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int startDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int finishDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        double dailyProgress = (args.length != 3) ? scanner.nextDouble() : Double.parseDouble(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if (startDistance == 0)
            System.out.println("0.00");
        else {
            double distance = startDistance;
            double totalDistance = 0;
            do {
                totalDistance += distance;
                distance += distance * dailyProgress / 100;
                if (totalDistance == 0) break;
            } while (distance < finishDistance);
            System.out.println(new BigDecimal(totalDistance).setScale(2, RoundingMode.HALF_EVEN).doubleValue());
        }
    }
}