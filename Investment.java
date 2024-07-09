import java.util.Scanner;
import java.text.*;
public class Investment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the buying price per share: ");
        double buy = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat twDecimalFormat = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Enter the closing price for day" + day + " (Any negative value will leave )");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) {
                break;
            }
            double earnings = closingPrice - buy;
            if (earnings > 0) {
                System.out.println("After the day" + day + ", you earned" + twDecimalFormat.format(earnings) + "per share");
            }
            else if (earnings < 0.0) {
                System.out.println(" After day " + day + "You lost" + twDecimalFormat.format(-earnings) + "per share");
            }
            else{
                System.out.println("After day " + day + " you earned nothing");
            }
            day ++;
        }
        scan.close();
    }
}
