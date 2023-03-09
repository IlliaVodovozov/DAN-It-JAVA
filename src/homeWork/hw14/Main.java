package homeWork.hw14;
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + ", b = " + b + ".");
        System.out.println("_____________");

        double chislitel = 7.0;
        double znamenatel = 5.0;
        double chastnoe = chislitel / znamenatel;
        int ostatokDel = (int)chislitel % (int)znamenatel;
        System.out.println("Целая часть равна " + (int)chastnoe);
        System.out.println("Остаток от деления равен " +ostatokDel);
        System.out.println("Знаменатель равен " +(int)znamenatel);
        System.out.println("_____________");

        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        System.out.println(string1.length());
        String string2 = string1.replace(" it is too long", "");
        System.out.println(string2);
        System.out.println(string2.length());
        String string3 = string2.replace(" i ", " don't ");
        string3 = string3  + " it is perfect";
        System.out.println(string3);
        System.out.println(string3.length());
        System.out.println("_____________");

        /*Создать строку string = "Testing, is my favourite job"
        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слова).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слова).
        и т.д.
                Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/
        String string = "Testing, is my favourite job";
        String[] words = string.split(" ");
        String word1 = words[0].replace(",","");
        String word2 = words[1];
        String word3 = words[2];
        String word4 = words[3];
        String word5 = words[4];
        System.out.println("Cлово1 = "+word1+", Длина этого слова = "+word1.length());
        System.out.println("Cлово2 = "+word2+", Длина этого слова = "+word2.length());
        System.out.println("Cлово3 = "+word3+", Длина этого слова = "+word3.length());
        System.out.println("Cлово4 = "+word4+", Длина этого слова = "+word4.length());
        System.out.println("Cлово5 = "+word5+", Длина этого слова = "+word5.length());
        boolean res = (word1.length()>word2.length()&&
                word1.length()>word3.length()&&
                word1.length()>word4.length()&&
                word1.length()>word5.length());
        System.out.println(res);
        System.out.println("_____________");
        /*Зная из урока что при применении к массиву строк метода length, можно узнать сколько
        элементов находится в массиве. Попробовать вывести на экран какое количество раз
        символ 'a' встречается в данной строке:
        Completely random text in English. In it, we just need to determine how many times
        the character 'a' occurs there. And we can use the split method and the length method.
                Решить данную задачу с использованием метода split,
        а также с учетом верхнего и нижнего регистра символа 'a'*/
        String string4 = "Completely random text in English. In it, " +
                "we just need to determine how many times the character 'a' occurs " +
                "there. And we can use the split method and the length method";
        String[] strings = string4.toLowerCase().split("a");
        System.out.println(strings.length-1);
    }
}