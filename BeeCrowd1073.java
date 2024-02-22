import java.util.Scanner;

public class BeeCrowd1073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int c = 1;
        int resultado = 0;

        for(int i = 0; i <= n; i++){
            if(c % 2 == 0 && c <= n){
                resultado = (int)Math.pow(c,2);
                System.out.println(c + "^2 = " + resultado );
            }else{
                c++;
            }if (c % 2 == 0 && c <= n){
                resultado = (int)Math.pow(c,2);
                System.out.println(c + "^2 = " + resultado );
            }c++;
        } input.close();
    } 
    
}
