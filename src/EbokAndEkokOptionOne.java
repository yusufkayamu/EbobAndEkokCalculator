import java.util.Scanner;

public class EbokAndEkokOptionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give number for N1=");
        int n1 = input.nextInt();

        System.out.print("Give number for N2=");
        int n2 = input.nextInt();
        int ebob = 1;

        while (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB=" + ebob);
            break;
        }
        while (n2 < n1) {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB=" + ebob);
            break;
        }
        System.out.println("EKOK=" + (n1 * n2) / (ebob));
    }
}




