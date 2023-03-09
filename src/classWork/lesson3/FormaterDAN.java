package classWork.lesson3;

import java.util.Date;
import java.util.Scanner;

public class FormaterDAN {
    public static void main(String[] args) {
        /*String string1 = "Мое имя {name}. Мой возраст {age}. Но чувствую я себя на все {newAge}.";
        String string2 = string1.replace("{name}","%1$s")
                .replace("{age}","%2$d")
                .replace("{newAge}","%3$d");
        System.out.printf(string2,"Illia",73,25);*/

        /* Пользователь вводит с клавиатуры произвольную строку.
   Необходимо чтобы вместо второго слова введенной строки
   выводилось слово "конечно". И это слово должно писаться отдельной строкой.
   Ну и после добавлялась фраза типа:
   Напечатано сегодня в {день недели вывода этого сообщения}, в {время вывода сообщения формата 22:22}. (В верхнем регистре.)*/
        Scanner input = new Scanner(System.in);
        System.out.println("Введите предложение");
        String string = input.nextLine();
        String[] strings = string.split(" ");
        String word2 = strings[1];
        String word3 =strings[2];
        String string3 = string.replace(word2, "\nконечно\n");
        Date date = new Date();
        System.out.println(string3);
        System.out.printf("Напечатано сегодня в %1$tA, в %1$tH:%1$tM.".toUpperCase(), date);

    }
}
