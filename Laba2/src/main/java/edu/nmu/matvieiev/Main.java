package edu.nmu.matvieiev;

import javax.lang.model.type.PrimitiveType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static int MAX_RAND = 20;
    private final static int MIN_RAND = -20;
    private final static int INPUT_MATRIX = 1;
    private final static int FIND_MIN = 2;
    private final static int FIND_MAX = 3;
    private final static int FIND_ARITHMETIC = 4;
    private final static int EXIT = 5;

    public static void main(String[] args) {
        int mode;
        List<List<Integer>> matrix = null;

        do {
            mode = Menu();
            if (mode == INPUT_MATRIX) {
                matrix = fillMatrix();
            }
            if (matrix == null) {
                System.out.println("Заповніть матрицю!");
                continue;
            }
            switch (mode) {
                case FIND_MIN: {
                    System.out.printf("Мінімальне значення матриці: %d \n", Extreme(matrix, false));
                    break;
                }
                case FIND_MAX: {
                    System.out.printf("Максимальне значення матриці: %d \n", Extreme(matrix, true));
                    break;
                }
                case FIND_ARITHMETIC: {
                    System.out.printf("Середнє арифметичне значення матриці: %f \n", Average(matrix));
                    break;
                }
            }
            System.out.println("\n");
        } while (mode != EXIT);
    }

    private static int Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню:");
        System.out.println(INPUT_MATRIX + ". Створити матрицю");
        System.out.println(FIND_MIN + ". Знайти мінімальне значення матриці");
        System.out.println(FIND_MAX + ". Знайти максимальне значення матриці");
        System.out.println(FIND_ARITHMETIC + ". Знайти середнє арифметичне значення матриці");
        System.out.println(EXIT + ". Вихід");
        System.out.println("\nВаш вибір[1-5]:");
        int mode = scanner.nextInt();
        return mode;
    }

    private static double Average(List<List<Integer>> matrix) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < matrix.size(); ++i) {
            List<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); ++j) {
                sum += row.get(j);
                counter++;
            }
        }
        return sum / counter;
    }

    private static int Extreme(List<List<Integer>> matrix, Boolean isMaximum) {

        List<Integer> extremes = new ArrayList<Integer>();
        for (int i = 0; i < matrix.size(); ++i) {
            if (isMaximum) {
                extremes.add(Collections.max(matrix.get(i)));
            } else {
                extremes.add(Collections.min(matrix.get(i)));
            }
        }
        return isMaximum ? Collections.max(extremes) : Collections.min(extremes);
    }

    private static int input(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.printf("Введіть %s: ", NameOfValue);
            value = scanner.nextInt();
            if (value > 0 && value <= 20) {
                return value;

            } else {
                System.out.print("Невірне значення!!\n\n");
            }
        } while (true);
    }

    private static List<List<Integer>> fillMatrix() {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Scanner scanner = new Scanner(System.in);


        int width = input("ширину");
        int height = input("висоту");


        for (int i = 0; i < height; ++i) {
            List<Integer> col = new ArrayList<Integer>();
            for (int j = 0; j < width; ++j) {
                int random = (int) (Math.random() * (MAX_RAND - MIN_RAND) + MIN_RAND);
                System.out.printf("Матриця [%d][%d] = %d \n", i, j, random);
                col.add(random);

            }
            result.add(col);
        }

        return result;
    }
}