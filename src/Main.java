import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the triangle length:");
                    int triLength = sc.nextInt();
                    for (int i = 1; i <= triLength; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the square length:");
                    int squareLength = sc.nextInt();
                    for (int i = 1; i <= squareLength; i++) {
                        for (int j = 1; j <= squareLength * 2; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the rectangle height:");
                    int recHeight = sc.nextInt();
                    System.out.println("Enter the rectangle width:");
                    int recWidth = sc.nextInt();
                    for (int i = 1; i <= recHeight; i++) {
                        for (int j = 1; j <= recWidth; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }

        }
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
}