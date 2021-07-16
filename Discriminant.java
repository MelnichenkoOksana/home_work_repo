import java.util.Scanner;

//Написать функциональный интерфейс с методом, который принимает
//        три дробных числа: а, Ь, с и возвращает тоже дробное число. Написать
//        реализацию такого интерфейса в виде лямбда-выражения, которое
//        возвращает дискриминант.

public class Discriminant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите число b");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите число c");
        double thirdNumber = scanner.nextDouble();

        Numbers discriminant = (a, b, c)-> b*b-4*a*c;

        System.out.println(discriminant.test(firstNumber, secondNumber, thirdNumber));

    }

    @FunctionalInterface
    interface Numbers{
        double test (double a, double b, double c);
    }
}
