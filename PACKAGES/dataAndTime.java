package PACKAGES;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class dataAndTime {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);
        if(date1.isAfter(date2)){
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);
        sc.close();
    }
}
