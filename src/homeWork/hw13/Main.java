package homeWork.hw13;
public class Main {
    public static void main(String[] args) {
        /*int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(opel);
        System.out.println("____________");*/

        /*int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("____________");*/

        /*boolean a = (85/5 + (19 - 25%3)) == (-3)*(-2 + 14/(-2)) && (2%7 - 1)*3 <= 2;
        boolean b = !a||a&&!a;
        boolean c = false&&!true||!((23%3+14)%3==7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("____________");*/

        int first = 5;
        int second = first*5;
        int third = second - first;
        first = first*third;
        System.out.println(first+", "+second+", "+third);
        System.out.println(first+second);
        System.out.println(first % third);
        System.out.println("____________");

        String string1 = "Казнить";
        String string2 = " нельзя";
        String string3 = " помиловать";
        String string4 = ",";
        String string5 = ".";
        System.out.println(string1+string4+string2+string3+string5);
        System.out.println(string1+string2+string4+string3+string5);
        System.out.println("____________");

        System.out.println("Anyone who has never made\n a mistake has never tried\n " +
                "anything new.\n Albert Einstein.");
        System.out.println("____________");

        int number = 13;
        int two = 2;
        boolean chet = number%two == 0;
        System.out.println("Число number имеет значение " +number+".\n " +
                "Является ли оно четным?");
        System.out.println(chet);
    }
}
