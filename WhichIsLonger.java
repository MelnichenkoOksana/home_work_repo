import java.util.Scanner;

//5.	Написать функциональный интерфейс с методом, который принимает
//        две строки и возвращает тоже строку. Написать реализацию такого
//        интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.

public class WhichIsLonger {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstString = scanner.nextLine();
        System.out.println("Введите первую строку");
        String secondString = scanner.nextLine();


        Words whichIsLonger = (String a, String b) -> {
            if (a.length() > b.length()) return a;
            else if (b.length() > a.length()) return b;
            else return "Строки одинаковой длинны";

        };
        System.out.println(whichIsLonger.test(firstString, secondString));
    }
    @FunctionalInterface
    interface Words{
       String test(String a, String b);
    }
}
