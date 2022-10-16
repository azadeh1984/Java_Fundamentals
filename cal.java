package se.lexicon;

import java.util.Scanner;

public class cal {

    public static void main(String[] args) {
        while(true) {
            double result = 0;
            double a;
            System.out.println("Enter the first number :: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextDouble();
            double b;
            System.out.println("Enter the second number :: ");
            Scanner sc1 = new Scanner(System.in);
            b = sc1.nextDouble();
            System.out.println("Enter the OPT :: ");
            Scanner sc2 = new Scanner(System.in);
            char c = sc2.next().charAt(0);
            if( c == 'n')
                break;
            //System.out.println("Enter the OPT :: " + c);
            switch (c) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    System.out.println("The operation is not supported ");
                    break;
            }
            System.out.println(result);
        }
    }
}


