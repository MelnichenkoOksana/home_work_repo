import java.util.Scanner;

//10.	Дано три разных целых числа. Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел.

public class MaxOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        Numbers maxOfThree = (a, b, c) -> Math.max(Math.max(a,b), Math.max(b,c));

        System.out.println(maxOfThree.test(firstNumber,secondNumber,thirdNumber));

    }
    @FunctionalInterface
    interface Numbers{
        int test (int a, int b, int c);
    }
}
