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
    }
}