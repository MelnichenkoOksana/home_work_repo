//4.	Написать функциональный интерфейс с методом, который принимает число
//        и возвращает булево значение. Написать реализацию такого интерфейса
//        в виде лямбда-выражения, которое возвращает true, если переданное
//        число делится без остатка на 13.


public class Thirteen {
    public static void main(String[] args) {

    MyPredicate divisibleByThirteen = j -> {
        if (j % 13 != 0) {
            System.out.println("не делится на 13(");
                return false;
                      } else {
            System.out.println("делится на 13 без остатка!");
                return true;
            }
    };

        System.out.println(divisibleByThirteen.test(20));

    }



    @FunctionalInterface
    interface MyPredicate {
        boolean test(Integer i);
}

}