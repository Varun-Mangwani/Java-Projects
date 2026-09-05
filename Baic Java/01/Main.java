import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Name: ");
        String Name = scan.nextLine();
        int[] Marks = new int[5];
        System.out.print("Enter The Physics Marks: ");
        Marks[0] = scan.nextInt();
        System.out.print("Enter The Chemistry Marks: ");
        Marks[1] = scan.nextInt();
        System.out.print("Enter The Maths Marks: ");
        Marks[2] = scan.nextInt();
        System.out.print("Enter The English Marks: ");
        Marks[3] = scan.nextInt();
        System.out.print("Enter The Computer Marks: ");
        Marks[4] = scan.nextInt();
        int Total = Marks[0] + Marks[1] + Marks[2] + Marks[3] + Marks[4];
        System.out.println("Total Marks Obtained Is" + Total);
        System.out.println("Percentage Is " + (Total / 5) + "%");

        
        scan.close();
    }
 }