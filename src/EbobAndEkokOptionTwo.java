import java.util.Scanner;

public class EbobAndEkokOptionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give number for N1=");
        int n1 = input.nextInt();

        System.out.print("Give number for N2=");
        int n2 = input.nextInt();
        int ebob = 1;

        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB=" + ebob);
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB=" + ebob);
        }
        System.out.println("EKOK=" +  (n1*n2) / (ebob));
    }
}


