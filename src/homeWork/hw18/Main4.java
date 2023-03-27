package homeWork.hw18;

public class Main4 {
    public static class OverloadedMethod {
        public void print() {
            System.out.println("Я пустой");
        }

        public void print(String message) {
            System.out.println(message);
        }

        public void print(String[] messages) {
            System.out.println(String.join(" ", messages));
        }

        public void print(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);
        }

        public void print(int number, String message) {
            System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + number);
        }
    }
    public static void main(String[] args) {
        OverloadedMethod example = new OverloadedMethod();
        example.print();
        example.print("Какое-то сообщение");

        String[] messages = {"Строка1", "Строка2", "Строка3", "Строка4"};
        example.print(messages);

        int[] numbers = {1, 2, 3, 8768765, 0, 34};
        example.print(numbers);

        example.print(42, "Ответ на главный вопрос жизни, " +
                "вселенной и всего такого?");
    }

}
