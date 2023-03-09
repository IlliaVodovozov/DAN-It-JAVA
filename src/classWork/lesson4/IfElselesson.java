package classWork.lesson4;

import java.util.Scanner;

public class IfElselesson  {
    public static void main(String[] args) {
       /*   if(условие){
          (этот блок выполнится
          если условие = true);
    } else {
          (этот блок выполнится
          если условие = false);
          }*/

        /*int x = 15;
        if(x<10){
            System.out.println("Блок if");
        } else if (x>20) {
            System.out.println("Блок else if");
        } else
         {
            System.out.println("Блок else");
        }*/
        /*Ползователь вводит с клавиатуры предложение.
                Если количество слов в нем больще трех но меньше девяти и это количество четное,
                то в консоль выводится сообщение "выполнилось первое условие".
                Если количество слов больше двенадцати но меньше двадцати, и это количество не
        делится на три, то в консоль выводится сообщение "выполнилось второе условие".
                Если колтчество слов в предложении равно трем,  то в консоль выводится сообщение
        "выполнилось третье условие".
                В противном случае вывести сообщение "Не выполнилось ни одно условие".*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение");
        String string = in.nextLine();
        int count = string.split(" ").length;
        if(count>12&&count<20&&count%3!=0){
            System.out.println("block1");
        } else if (count>3&&count<9&&count%2==0){
            System.out.println("block2");
        } else if (count==3) {
            System.out.println("block3");
        } else {
            System.out.println("nothing");
        }


        //Задана стоимость билета по маршруту Днепр - Киев.
        //В зависимости от возраста предоставляется скидка
        /*double cost = 500;
        Scanner in = new Scanner(System.in);
        System.out.println("Age");
        int age = in.nextInt();
        if(age<18){
            if(age==13){
                cost = cost*0.5;
                System.out.println("цена "+ cost);
            }
            cost = cost*0.75;
            System.out.println("Цена билета "+ cost);
        } else if (age>55) {
            cost = cost*0.85;
            System.out.println("Цена билета "+ cost);
        }
        else  {
            System.out.println("Цена билета "+ cost);
        }*/
    }
}