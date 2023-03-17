package homeWork.hw17;

import java.util.Scanner;
import java.util.Arrays;

public class WorkWithArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите индексы имени[0..6], времени[0..5], места[0..5]: ");
        int nameIndex = scan.nextInt();
        int timeIndex = scan.nextInt();
        int placeIndex = scan.nextInt();
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        String name = names[nameIndex];
        int time = times[timeIndex];
        String place = places[placeIndex];

        System.out.printf("%1$s будет идти в %2$s в %3$d:00 %n", name, place, time);
        System.out.println("_____________");

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == num) {
                found = true;
                break;
            }
        }
        System.out.printf(found?"Число %s найдено в массиве:":"Число %s не найдено в массиве:%n",num);
        System.out.println(Arrays.toString(intArray));
        System.out.println("_____________");

        int[] intArray2 = new int[45];
        int min = 51; // начальное значение мин. элемента, которое гарантированно будет больше максимального
        int max = -51; // начальное значение макс. элемента, которое гарантированно будет меньше минимального
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = ((int) (Math.random() * 101) - 50);
            if (intArray2[i] < min) {
                min = intArray2[i];
            }
            if (intArray2[i] > max) {
                max = intArray2[i];
            }
        }
        System.out.println("Массив: " + Arrays.toString(intArray2));
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("_________________");

        System.out.print("Введите четное число элементов массива: ");
        int sizeArray = scan.nextInt();
        if (sizeArray % 2 != 0) {
            System.out.println("Введено нечетное число элементов.");
            return;
        }
        int[] intArray3 = new int[sizeArray];
        for (int i = 0; i < intArray3.length; i++) {
            intArray3[i] = (int) (Math.random() * 101);
        }
        System.out.println("Исходный массив: " + Arrays.toString(intArray3));
        Arrays.sort(intArray3, 0, sizeArray / 2);
        Arrays.sort(intArray3, sizeArray / 2, sizeArray);
        for (int i = sizeArray / 2, j = sizeArray - 1; i < j; i++, j--) {
            int temp = intArray3[i];
            intArray3[i] = intArray3[j];
            intArray3[j] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(intArray3));
        System.out.println("_____________");

        System.out.print("Введите основание треугольника: ");
        int base = scan.nextInt();
        // Вывод заполненного треугольника
        for (int i = base; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Вывод пустого треугольника
        for (int i = base; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == base || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}