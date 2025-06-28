import java.util.*;

public class day_1_sum_of_sqs_of_prime_nums_in_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the beginning of the range: ");
        int beg = sc.nextInt();

        System.out.println("Enter the end of the range: ");
        int end = sc.nextInt();

        int sum = 0;

        for(int i = beg; i <= end; i++) {
            boolean prime = true;

            if(i <= 1) {
                prime = false;
            } else {
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if(prime) {
                int sq = i * i;
                sum += sq;
            }
        }

        System.out.println("Sum of squares of prime numbers in range: " + sum);
        sc.close();
    }
}
