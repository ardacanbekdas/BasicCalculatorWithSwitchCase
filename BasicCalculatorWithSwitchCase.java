package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class BasicCalculatorWithSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2;
        int select;

        System.out.print("Please enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Please enter second number: ");
        number2 = input.nextDouble();

        System.out.println("Please choose one of the following actions.");

        System.out.println("(1)-Addition\n(2)-Subtraction\n(3)-Multiplication\n(4)-Division");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Result is = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result is = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is = " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Result is = " + (number1 / number2));
                } else {
                    System.out.println("Result is undefined");
                }
                break;
            default:
                System.out.println("You made the wrong choice");
                break;
        }
    }
}
