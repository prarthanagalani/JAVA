public class PowerOfTwo {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Provide argument in command line");
            return;
        }

       
        int n = Integer.parseInt(args[0]);

        
        if (n < 0 || n >= 31) {
            System.out.println("n should be between 0 and 30 (inclusive).");
            return;
        }

       
        System.out.println("Powers of 2 up to 2^" + n + ":");
        for (int i = 0; i <= n; i++) {
            int ans = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + ans);
        }
    }
}
