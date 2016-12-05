import java.util.*;

public class day28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        List<String> arr = new ArrayList<>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();

            if(emailID.contains("@gmail.com")){
                arr.add(firstName);
            }
        }

        Collections.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
