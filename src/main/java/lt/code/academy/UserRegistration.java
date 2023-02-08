package lt.code.academy;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();


        String action = new String();
        do {
            userRegistration.menu();
            action = sc.nextLine();

        } while (!action.equals("3"));


    }

    private void userInput(Scanner sc, String action) {
        switch (action) {
            case "1" -> insertUser(sc);
            case "2" -> System.out.println("Atspausdinkite vartotojus");
            case "3" -> System.out.println("Exit");
            default -> System.out.println("Tokio pasirinkimo nėra");
        }
    }

    private String insertUser(Scanner scanner) {
        System.out.println("Iveskite varda: ");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde: ");
        String surname = scanner.nextLine();
        System.out.println("Iveskite asmens koda: ");
        int id = scanner.nextInt();

        return new Student (name, surname, id);
    }

    private void menu() {
        System.out.println("""
                1. Iveskite vartotoja
                2. Atspausidnkite vartotoja
                3. Iseiti is programos 
                """);
    }
}
