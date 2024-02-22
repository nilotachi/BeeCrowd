import java.util.Scanner;


public class BeeCrowd1072 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int qtd = input.nextInt();
        int in = 0;
        int out = 0;
        int num = 0;

        for(int i =0; i < qtd; i++){
            num = input.nextInt();
            if(num >=10 && num <=20){
                in ++;
            }else{
                out++;
            }
            
        }System.out.println(in + " in");
        System.out.println(out + " out");

            input.close();
    }
    
}
