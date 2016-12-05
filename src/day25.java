import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        int[] input = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            input[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < testCases; i++) {
            boolean isPrime = isPrime(input[i]);

            System.out.println(isPrime ? "Prime" : "Not prime");
        }
    }

    private static boolean isPrime(int n) {
        if(n==1){
            return false;
        }

        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
