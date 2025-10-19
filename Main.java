import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter The Number: ");
        Scanner sn = new Scanner(System.in);
        try {

            int num = sn.nextInt();
            if (num == 0) {
                System.out.println("Number Is 0");
            } else if (num % 2 == 0) {
                System.out.println("Number Is ");
            } else {
                System.out.println("Number Is Odd ");
            }

        } catch (Exception e) {
            System.out.println("Please Provide Proper Number");

        }

    }

}