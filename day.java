/*
 * WAP to print day name of a week day number starting sunday as day 1.
 * Devloped by Km Banti Chauhan
 */
import java.util.Scanner;
public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option of  day==");
        int day = sc.nextInt();
        sc.close();
        switch(day){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Teusday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thusday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
           default : System.out.println("Enter the correct option from 1-7");

        }
    }
}
