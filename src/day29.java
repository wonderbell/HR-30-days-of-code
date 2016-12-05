import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            int ans = findMaxAndLtK(n,k);
            System.out.println(ans);
        }
    }

    private static int findMaxAndLtK(int n, int k) {
        int maxYet = 0;


        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int iAndJ = i & j;

                if(iAndJ<k){
                    maxYet = maxYet > iAndJ ? maxYet : iAndJ;
                }
            }
        }

        return maxYet;
    }

}
