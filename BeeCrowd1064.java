import java.util.Scanner;

public class BeeCrowd1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valores [] = new double[6];
        double soma = 0, media;
        int total =0;

        for(int i =0; i< valores.length; i++){
            valores[i] = input.nextDouble();
            if(valores[i] >= 0 ){
                total +=1;
                soma += valores[i];
            }
        } media = soma / total;
            input.close();
        
        System.out.println(total + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}

/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
 Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, 
 com um dígito após o ponto decimal. */