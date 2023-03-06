
/* 1) Создать переменную типа int с названием i и присвоить ей значение 100;
   Cоздать переменную типа char c названием сh и присвоить ей такое значение
   (именно символьное) чтобы при действии i+ch у нас получалось 222.
   Вывести на экран значение ch */
public class Main {
    public static void main(String[] args) {
        /*int i = 100;
        char ch = 122;
        System.out.println(ch);
        System.out.println(i + ch);
        int w = 3;
        System.out.println(String.valueOf(w));
        System.out.println(w);
        System.out.print(w);
        System.out.print(w);
        System.out.println("\n Я тестирую как \'боженька\'");
        int a = 45;
        int b = 3;
        System.out.println(a + ", " + b + " .");
        String string = "I love testing very much";
        String string2 = string.replace("love", "hate" );
        System.out.println(string);
        System.out.println(string2);*/
        String string = "I am testing like a god";
        String string2 = "the best of the best";
        int index = string.indexOf('e');
        System.out.println(index);
        char ch =string.charAt(6);
        System.out.println(ch);
        boolean result = string.contains("e");
        System.out.println(result);
        System.out.println("Строка \""+string+"\" содержит в себе символ \'"+ch+"\' и єто "+result+".\n" +
                "Символ \'"+ch+"\' находится в строке номер один под номером "+index+".");


    }
}