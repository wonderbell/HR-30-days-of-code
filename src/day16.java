import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        try{
            int converted = Integer.parseInt(s);
            System.out.println(converted);
        }
        catch (Exception ex){
            System.out.println("Bad String");
        }
    }
}
