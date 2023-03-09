package classWork.lesson4;

import java.util.Scanner;

public class ternarniy {
    public static void main(String[] args) {
        /*пользователь вводит с клавиатуры два числа и символ
        - или + или % или / или *
                На экран выводится резултат действия над двумя введенными числами.
        Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа и действие");
        int a = in.nextInt();
        int b = in.nextInt();
        String st = in.next().trim();
        System.out.println(st.equals("-")?a-b:st.equals("+")?a+b:st.equals("*")?a*b:st.equals("%")?a%b:st.equals("/")?a/b:0);

    }
}
