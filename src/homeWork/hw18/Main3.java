package homeWork.hw18;

import java.util.Scanner;

public class Main3 {
    public static void printReverseDoubleNumber(int num) {
        if (num < 10) {
            System.out.print(num + "" + num + " ");
        } else
        { // рекурсия
            int doubleDigit = num % 10;
            System.out.print(doubleDigit + "" + doubleDigit + " ");
            printReverseDoubleNumber(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        System.out.println("Число в обратном порядке с повторяющимися цифрами:");
        printReverseDoubleNumber(num);
    }
}


