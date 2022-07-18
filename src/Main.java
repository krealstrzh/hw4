public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println( );
        for (int k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
        System.out.println( );
        // Задание 2
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня -- пятница, " + friday + "-е число. Необходимо подготовить отчет!");
        }
        // Задание 3
        int year = 2022;
        int pastYearPeriod = 200;
        int pastYear = year - pastYearPeriod;
        int futureYearPeriod = 100;
        int futureYear = year + futureYearPeriod;
        int cometPeriod = 79;
        for (int cometFlyYear = 0; cometFlyYear <= futureYear; cometFlyYear = cometFlyYear + cometPeriod) {
            if (cometFlyYear >= pastYear && cometFlyYear <= futureYear) {
                System.out.println("Год пролета кометы -- " + cometFlyYear);
            }
        }
        // Задание 4
        for (int a = 1; a <= 30; a++) {
            System.out.print(a + ": ");
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print("ping pong");
                System.out.println(" ");
            } else if (a % 5 == 0) {
                System.out.print("pong ");
                System.out.println(" ");
            } else if (a % 3 == 0) {
                System.out.print("ping");
                System.out.println(" ");
            } else {
                System.out.println(" ");
            }
        }
        // Задание 5
        int fibonacciFirst = 0;
        int fibonacciSecond = 1;
        int fibonacciSum = 0;
        for (int counter = 1; counter <= 8; counter++) {
            fibonacciSum = fibonacciFirst + fibonacciSecond;
            System.out.print(fibonacciSum + " ");
            fibonacciFirst = fibonacciSecond;
            fibonacciSecond = fibonacciSum;
        }
    }
}