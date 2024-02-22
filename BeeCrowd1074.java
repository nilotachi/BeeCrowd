import java.util.Scanner;

public class BeeCrowd1074{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        String parImpar , posNeg;
          
        for(int i = 0; i < N; i++){
                int number = sc.nextInt();
                    if(number > 0 ){
                            posNeg = "POSITIVE";
                        if(number % 2 == 0){
                            parImpar = "EVEN";
                        }else{
                            parImpar =  "ODD";
                        }
                    }else if(number < 0){
                            posNeg = "NEGATIVE";
                        if(number % 2 == 0){
                                parImpar = "EVEN";
                            }else{
                                parImpar =  "ODD";
                            }
                    }else{
                        posNeg = "NULL";
                        parImpar = "";
                    }

                    if (parImpar.isEmpty()) {
                        System.out.println(posNeg);
                    } else {
                        System.out.println(parImpar + " " + posNeg);
                    }
        } 
        
        sc.close();
    }
}
/*
 *  par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE).
 *  No caso do valor ser igual a zero (0) NULL.
 */