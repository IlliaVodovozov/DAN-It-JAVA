public class App {
    public static void main(String[] args) {
        int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(opel);
        
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        boolean a = (85/5 + (19 - 25%3)) == (-3)*(-2 + 14/(-2)) && (2%7 - 1)*3 <= 2;
        boolean b = !a||a&&!a;
        boolean c = false&&!true||!((23%3+14)%3==7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       
        int first = 5;
        int second = first*5;
        int third = second - first;
        first = first*third;
        System.out.println(first","second","third);
        System.out.println(first+second);
        System.out.println(first%third);
    
    }
}
