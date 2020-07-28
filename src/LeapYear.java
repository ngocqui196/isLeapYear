import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean check = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    check = true;
                }
            }else {
                check = true;
            }
        }
        if (check){
            System.out.printf("%d is leap year", year);
        }else {
            System.out.printf("%d is not leap year", year);
        }
    }
}
