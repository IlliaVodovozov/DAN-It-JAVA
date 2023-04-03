package homeWork.hw19.calculator;
import java.util.Scanner;

public class Calculator {
    public void summ(double a, double b) {
        System.out.println("Ответ: " + (a + b));
    }

    public void minus(double a, double b) {
        System.out.println("Ответ: " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Ответ: " + (a * b));
    }

    public void division(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            System.out.println("Ответ: " + (a / b));
        }
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен.");
        while (true) {
            System.out.println("Введите действие (например: 2+4):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт.");
                break;
            }
            String[] parts = input.split("\\s*[-+*/]\\s*");
            if (parts.length != 2) {
                System.out.println("Введите корректное действие.");
                continue;
            }
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            if (input.contains("+")) {
                summ(a, b);
            } else if (input.contains("-")) {
                minus(a, b);
            } else if (input.contains("*")) {
                multiply(a, b);
            } else if (input.contains("/")) {
                division(a, b);
            } else {
                System.out.println("Введите корректное действие.");
            }
        }
    }
}
