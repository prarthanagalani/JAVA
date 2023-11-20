import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year (4 digits): ");
        int year = sc.nextInt();

       
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4-digit year.");
            return;
        }

        
        boolean isLeapYear = false;

        // My logic: divisible by 4 but not divisible by 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        
        sc.close();
    }
}
