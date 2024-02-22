import java.util.Scanner;
public class BeeCrowd1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        float  N1, N2, N3, media;

        for(int i = 0; i < N; i++){
            N1 = sc.nextFloat();
            N2 = sc.nextFloat();
            N3 = sc.nextFloat();

            media = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10;

            System.out.format("%.1f\n", media);
        }
        sc.close();
    }
}
