public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        short salary = 15000;
        int total = 0;
        short a = 0;
        while (total < 2_459_000) {
            total = total + salary;
            a++;
        }
        System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей.");
        //Task 2
        System.out.println("Task 2");
        byte b = 1;
        while (b <=10) {
            System.out.print(b+" ");
            b++;
        }
        b--;
        System.out.println();
        for (;b>=1;b--) {
            System.out.print(b+" ");
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        int countryPopulation = 12_000_000;
        byte birthRate = 17;
        byte deathRate = 8;
        for (byte c = 1; c <=10; c++) {
            int newBirths = countryPopulation * birthRate/1000;
            int newDeaths = countryPopulation * deathRate/1000;
            countryPopulation = countryPopulation + newBirths - newDeaths;
            System.out.println("Год " + c + ", численность населения составляет " + countryPopulation);
        }
        //Task 4
        System.out.println("Task 4");
        int deposit = 0;
        short money = 15000;
        byte month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit *7/100;
            deposit = deposit + money;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей.");
        }
        //Task 5
        System.out.println("Task 5");
        int depositFiveTask = 0;
        short moneyFiveTask = 15000;
        byte monthFiveTask = 1;
        while (depositFiveTask <= 12_000_000) {
            depositFiveTask = depositFiveTask + depositFiveTask *7/100;
            depositFiveTask = depositFiveTask + moneyFiveTask;
            monthFiveTask++;
            if (monthFiveTask %6==0) {
                System.out.println("Месяц " + monthFiveTask + ", сумма накоплений равна " + depositFiveTask + " рублей.");
            }
        }
        //Task 6
        System.out.println("Task 6");
        int depositSixTask = 0;
        short moneySixTask = 15000;
        byte monthSixTask = 1;
        while (monthSixTask <= 108) {
            depositSixTask = depositSixTask + depositSixTask *7/100;
            depositSixTask = depositSixTask + moneySixTask;
            monthSixTask++;
            if (monthSixTask %6==0) {
                System.out.println("Месяц " + monthSixTask + ", сумма накоплений равна " + depositSixTask + " рублей.");
            }
        }
        //Task 7
        System.out.println("Task 7");
        int firstFriday = 6;
        for (int date = firstFriday; date <= 31; date = date + 7) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
        }
        //Task 8
        System.out.println("Task 8");
        byte cometYear = 79;
        int year = 0;
        for (;year <= 2125; year = year + cometYear) {
            if (year >= 1825 && year <= 2125) {
                System.out.println(year);
            }
        }
    }
}