import java.util.Scanner;

public class BeeCrowd1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int sequencia = 0;

        while(sequencia < 6){
            if(n1 % 2 == 1){
                System.out.println(n1);
                sequencia++;
            }
            n1++;
        } input.close();
    }
}
