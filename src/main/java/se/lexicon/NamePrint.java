package se.lexicon;

import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {
        boolean status = true;

        while (status){
            System.out.println("What is your name :: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Hello " + name);

            System.out.println("Do you want to continue? (yes/no)");
            String cnt = scanner.nextLine();
            if (cnt.equalsIgnoreCase("no")) {
                status = false;
            }

        }

    }
}
