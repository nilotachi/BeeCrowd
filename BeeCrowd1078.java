import java.util.Scanner;

public class BeeCrowd1078 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int num, tabuadaMult, multiplicador; 
        num = input.nextInt();
           

        for(int i = 1; i <= 10; i++){
            multiplicador = i;
            tabuadaMult = num *i;
          System.out.println(i + " x " + num + " = " + tabuadaMult);
        }
        input.close();
    }
}
