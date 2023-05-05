import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();



    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 1");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 2");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 3");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}