import java.util.Scanner;
import java.util.InputMismatchException;

public class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            boolean validInput = false;
            System.out.print("Enter the first value: ");
            int firstVal = sc.nextInt();

            System.out.print("Enter The Second Value: ");
            int secondVal = sc.nextInt();

            System.out.print("Enter The Operater: ");
            char op = sc.next().charAt(0);

            while (validInput == true) {

                if (firstVal == 0 || secondVal == 0) {

                    System.out.println("Please Enter Valid Input");
                } else {
                    validInput = true;
                }
            }

            if (op == '+') {
                int Result = firstVal + secondVal;
                System.out.println("Addition Of First and Second Vale Is " + Result);

            } else if (op == '-') {
                int Result = firstVal - secondVal;
                System.out.println("Substraction Of First and Second Vale Is " + Result);

            } else if (op == '*' || op == 'X' || op == 'x') {

                int Result = firstVal * secondVal;
                System.out.println("Multiplication Of First and Second Vale Is " + Result);

            } else if (op == '/') {
                int Result = firstVal / secondVal;
                System.out.println("Division Of First and Second Vale Is " + Result);

            } else if (op == '%') {
                int Result = firstVal % secondVal;
                System.out.println("Modulas Of First and Second Vale Is " + Result);

            } else {
                System.out.println("Enter A Proper Operater");
                sc.close();

            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Proper Numerics");

        }

    }

}
