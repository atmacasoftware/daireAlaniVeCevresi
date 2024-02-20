import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r, a;
        double alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap : ");
        r = input.nextInt();

        System.out.print("Merkez Açısı : ");
        a = input.nextInt();

        if (r <= 0 || a <= 0) {
            System.out.println("Negatif değer girildiği için program sonlandırıldı.");
        } else {
            cevre = pi * r * r;
            alan = (pi * (r * r) * a) / 360;
            System.out.println("Çevre : " + cevre);
            System.out.println("Alan : " + alan);
        }


    }
}