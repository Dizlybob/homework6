public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        for (byte a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        //Task 2
        System.out.println("Task 2");
        for (byte b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //Task 3
        System.out.println("Task 3");
        for (byte c = 0; c < 17; c = (byte) (c + 2)) {
            System.out.println(c);
        }
        //Task 4
        System.out.println("Task 4");
        for (byte d = 10; d >=-10; d--) {
            System.out.println(d);
        }
        //Task 5
        System.out.println("Task 5");
        for (short leapYear = 1904; leapYear <= 2096; leapYear = (short) (leapYear + 4)) {
            System.out.println(leapYear + " год является високосным");
        }
        //Task 6
        System.out.println("Task 6");
        for (byte e = 7; e <=98; e = (byte) (e+7)) {
            System.out.println(e);
        }
        //Task 7
        System.out.println("Task 7");
        for (short f = 1; f<=512; f = (short) (f*2)) {
            System.out.println(f);
        }
        //Task 8
        System.out.println("Task 8");
        int totalOne = 0;
        short salary = 29000;
        for (byte g = 1; g <=12; g++) {
            totalOne = totalOne + salary;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + totalOne + " рублей.");
        }
        //Task 9
        System.out.println("Task 9");
        int totalTwo = 0;
        for (byte i = 1; i <=12; i++) {
            totalTwo = totalTwo + totalTwo /100;
            totalTwo = totalTwo + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTwo + " рублей.");
        }
        //Task 10
        System.out.println("Task 10");
        for (byte h = 1; h <=10; h++) {
            System.out.println("2*"+h+"="+(h*2));
        }
    }
}