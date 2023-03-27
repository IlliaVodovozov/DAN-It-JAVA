package homeWork.hw18;

public class Main2 {
    public static void printEvenNumbers(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void printOddNumbers(int[] nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        int[] ints = {1054, 2, 73, 4, 15, 6, 7, 45, 78, 2, 9};

        System.out.println("Четные числа:");
        printEvenNumbers(ints);

        System.out.println("Нечетные числа:");
        printOddNumbers(ints);
    }
}