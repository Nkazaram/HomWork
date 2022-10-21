package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign() {
        int varA = 4;
        int varB = 5;
        int result = varA + varB;
        System.out.println(result);

        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        if (result <= 0) {
            System.out.println("Сумма отрицательная");
        }

    }

    private static void printColor() {
        int value = 12;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 1 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 101) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 7;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }

    }

}
