package homeWork.hw15;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите с клавиатуры в консоль: Я тестирую замечательно. Что еще нужно?");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next().replace(".", "");
       /* String string4 = input.nextLine().trim();*/
        String string4 = input.next() +" "+ input.next() +" "+ input.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println("____________");

        System.out.println("Введите три целочисленных числа:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(((a + c) > b) && ((a + b) > c) && ((b + c) > a) ?
                "Из этих сторон можно построить треугольник"
                :"Из этих сторон нельзя построить треугольник");
        System.out.println("____________");

        System.out.println("Введите свой год рождения:");
        Scanner year = new Scanner(System.in);
        int birthYear = year.nextInt();
        Date date = new Date();
        int currentYear = date.getYear() + 1900;
        System.out.println("Ваш возраст: " + (currentYear - birthYear));
        System.out.println("____________");

        System.out.printf("Чтобы написать код нам нужны: " +
                "%n1) Язык программирования " +
                "%n2) Среда разработки" +
                "%n3) Воодушевление%n%n");

        System.out.println("Введите два целочисленных числа:");
        Scanner in1 = new Scanner(System.in);
        int X0 = in1.nextInt();
        int Y0 = in1.nextInt();
        System.out.printf(X0>Y0?"Число %1$s больше %2$s, и это true %n":"Число %1$s больше %2$s, и это false %n", X0, Y0);
        System.out.println("____________");

        System.out.println("Введите спецификатор формата даты/времени (например, c или T): ");
        Scanner spec = new Scanner(System.in);
        String specifier = spec.nextLine();
        String formatSpecifier = "%t" + specifier;
        Date date1 = new Date();
        System.out.printf(formatSpecifier, date1);
        System.out.println("\n____________");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Введите Ваше имя и номер задания: ");
        String X = input1.next();
        int Y = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.printf("%1$s, введите через пробел время в часах " +
                "в момент выполнения программы, %nвремя в минутах в " +
                "момент выполнения программы,%nдень недели: ", X);
        int Z = input2.nextInt();
        int W = input2.nextInt();
        String V = input2.nextLine();
        System.out.printf("Уважаемый %1$s, Вы выполняете задание номер %2$s, " +
                "и делаете это в %3$s часов %4$s минут в%5$s.", X, Y, Z, W, V);

    }
}
