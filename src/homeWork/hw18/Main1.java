package homeWork.hw18;

import java.util.Scanner;

public class Main1 {
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Метод вьіводит сумму " + a + " и " + b + " равную " + sum);
    }
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        printSum(number1, number2);

        int sum = calculateSum(number1, number2);
        System.out.println("Метод возвращает сумму " + number1 + " и " + number2 + " равную " + sum);
        System.out.println("_____________________");
    }
}