import java.util.Scanner;

public class BeeCrowd1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, pares =0, impar =0, positivo =0, negativo =0;
        int valores [] = new int[5];

        for(i = 0; i < valores.length; i++){
            valores[i] = input.nextInt();
            
            if(valores[i] % 2 == 0) pares +=1;
            if(valores[i]> 0) positivo +=1;
            if(valores[i] < 0) negativo +=1;
            if(valores[i] % 2 != 0) impar +=1;
        }
            

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
            
            
    }
}
 /*if(number > 0 ){
     posNeg = "POSITIVE";
        if(number % 2 == 0){
            parImpar = "P";
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
                        parImpar = ""; */