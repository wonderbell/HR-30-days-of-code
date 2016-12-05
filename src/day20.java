import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int totalSwaps = 0;
        for(int i=0; i<n; i++) {
            int loopSwaps = 0;
            for(int j=0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    loopSwaps ++;
                }
            }

            if(loopSwaps == 0){
                break;
            }

            totalSwaps+=loopSwaps;
        }

        System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d\n", a[n-1]);
    }
}
