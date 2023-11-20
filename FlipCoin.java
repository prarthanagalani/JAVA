import java.util.Scanner;
import java.util.Random;

public class FlipCoin{
 
       public static void main(String[] args){

              Scanner sc = new Scanner(System.in);

              System.out.println("Enter the number of times to flip the coin: ");
              int n = sc.nextInt();

              if(n <= 0){
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

       
        Random random = new Random();

        
        for (int i = 0; i < n; i++) {
            
            double random_val = random.nextDouble();

            
            if (random_val < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
 
        double headsPercentage = (double) heads / n * 100;
        double tailsPercentage = (double) tails / n * 100;

       
        System.out.println("Heads count: " + heads);
        System.out.println("Tails count: " + tails);
        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");

       
        sc.close();
      }

}