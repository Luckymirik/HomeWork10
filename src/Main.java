import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName+" "+middleName+" "+lastName;
        System.out.println("ФИО сотрудника—" + fullName);

    }
}