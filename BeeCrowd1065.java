import java.util.Scanner;

public class BeeCrowd1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, par =0, total =0;

        for (int i = 0; i<5; i++){
            num = input.nextInt();
            if(num % 2 == 0){
                num = par;
                total +=1;
            }
        }System.out.println(total + " valores pares");

            input.close();
    }
}
