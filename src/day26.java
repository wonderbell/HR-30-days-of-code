import java.util.Calendar;
import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar[] dates = new Calendar[2];
        int dateReturned=0, dateDue=1;

        for(int i=0; i<2; i++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            dates[i] = Calendar.getInstance();
            dates[i].set(year, month - 1, day);
        }

        int fine = getFine(dates[dateDue], dates[dateReturned]);
        System.out.println(fine);
    }

    private static int getFine(Calendar dateDue, Calendar dateReturned) {
        int diff = dateReturned.compareTo(dateDue);

        if(diff <= 0){
            return 0;
        }

        if(dateDue.get(Calendar.MONTH) == dateReturned.get(Calendar.MONTH) &&
            dateDue.get(Calendar.YEAR) == dateReturned.get(Calendar.YEAR)){
            int dayDiff = dateReturned.get(Calendar.DATE)- dateDue.get(Calendar.DATE);
            return 15 * dayDiff;
        }

        if(dateDue.get(Calendar.YEAR) == dateReturned.get(Calendar.YEAR)){
            int monthDiff = dateReturned.get(Calendar.MONTH) - dateDue.get(Calendar.MONTH);
            return 500 * monthDiff;
        }

        return 10000;
    }
}
