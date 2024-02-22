import java.util.Scanner;

public class BeeCrowd1160 {
  
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);

      int PA ,PB, tempo;
      double G1, G2;
      
      System.out.println("Digite a quantidade de casos de teste desejados");
      int quantidadeTeste =  sc.nextInt();

      for(int i = 0; i < quantidadeTeste; i++){
        
          tempo = 0;
          //descobrir info pop e porcentagem crescimento.
          System.out.println("Populacao ");
          PA = sc.nextInt();
          PB = sc.nextInt();
        
          System.out.println("Porcentagem");
          G1 = sc.nextDouble();
          G2 = sc.nextDouble();
        
          //descobrir tempo para a cidade passar em pop a outra.
          while( PB >= PA){
              PA += (PA * G1) / 100;
              PB += (PB * G2) / 100;
              tempo ++ ;
              if(tempo > 100){
                      break;
              }
          }
          if(tempo > 100){
                System.out.println("Mais de 1 seculo.");
          }else{
                System.out.println(tempo + " anos.");
          }
    } sc.close();
  }
}
/* if(tempo >100){
            System.out.println("Mais de 1 seculo.");
          } */
/*for(int i = 0; i <= quantidadeTeste; i++){
        PA = sc.nextInt();
        PB = sc.nextInt();
        System.out.printf(PA + "\n" + PB); 
    }
    int tempoInt = (int) tempo;*/

/*
 * A primeira linha da entrada contém um único inteiro T, indicando o número de casos de teste (1 ≤ T ≤ 3000).
 *  Cada caso de teste contém 4 números: dois inteiros PA e PB (100 ≤ PA < 1000000, PA < PB ≤ 1000000) indicando respectivamente 
 * a população de A e B, e dois valores G1 e G2 (0.1 ≤ G1 ≤ 10.0, 0.0 ≤ G2 ≤ 10.0, G2 < G1) com um digito após o ponto decimal cada,
 *  indicando respectivamente o crescimento populacional de A e B (em percentual).
 */