
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;



public class BeeCrowd01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A, B,C, aux;
            
            A = input.nextDouble();
            B = input.nextDouble();
            C = input.nextDouble();
            
        if(B > A && B > C){
            aux = A;
            A = B;
            B = aux;
        }else if(C > A){
            aux = A;
            A= C;
            C = aux;
        }
            
        if(A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
            if(A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
            if(A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && A == C ) System.out.println("TRIANGULO EQUILATERO");
            if((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOCELES");
            } input.close();
        }
}



/*Quad 1 = a> 0 && b > 0
 * Quad 2 = x < 0 && y > 0
 * Quad 3 = x < 0 && y < 0
 * Quad 4 = x > 0 && y <0
 * Y = B && X = A
 */

//Exercicios Beecrowd 

/*int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt(); */
    
    /*se B for maior do que C e se D for maior do que A, e a soma de C com D for maior
    que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for
    par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos" */
        
    /* if((B>C) && (D>A) && (C + D > A + B) && (C >=1)&& (D >=1) && (A% 2 == 0)){
    
        System.out.println("Valores aceitos");
    } else{
        System.out.println("Valores nao aceitos");
        }
        input.close(); */

//Excercicio X

/* int hsInicio, hsTermino, duracaoHs;

        hsInicio = input.nextInt();
        hsTermino = input.nextInt();
        

        if (hsInicio < hsTermino){

            duracaoHs = hsInicio - hsTermino;
            System.out.println("O JOGO DUROU "+ duracaoHs + " HORA(S)");
        }else {

            duracaoHs = 24 - hsInicio + hsTermino;
            System.out.println("O JOGO DUROU "+ duracaoHs + " HORA(S)");
            
        }  input.close();  */

//ex----
        /* for (int codigo = 1; codigo <= 100; codigo++){
                if (codigo %2 == 0){
                    System.out.println( codigo);;
            }
            }  */ 

//ex------
/* int [] valor = new int [3];
        

            // conseguir os 3 valores
            for(int i = 0; i < valor.length; i++){
                valor[i] = input.nextInt();
            }
            Arrays.sort(valor);
            for(int num : valor){
                System.out.println(num + " ");
            } input.close();  */

//Ex---------
/*  int tamanho = input.nextInt();
        int [] valor = new int [tamanho];
        

            // conseguir os 3 valores
            for(int i = 1; i <= valor.length && valor.length <=1000; i++){
                
                if( i % 2 == 1){
                    System.out.println(i);
                }
            }input.close();  */
//Ex---------
/*
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();
        
        
        
        
        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            
            double perimetro = lado1 + lado2 +lado3;
            System.out.println("Perimetro = %.1f\n", perimetro);
        }else{
            double area = ((lado1 + lado2) * lado3) /2;
            System.out.println("Area = %.1f\n", area);
        } 
        
        input.close();  */
//Ex-------

        /* double cQuente = 4.00, xSalada = 4.50, xBacon = 5.00, torrada = 2.00, refri = 1.50;
        int quantidade;
        
        

        int codigo = input.nextInt();
        
        switch(codigo){
            case 1:

                System.out.println("");     
                break;
            case 2:
   
                System.out.println("");
                break;
            case 3:

                System.out.println("";
                break;
            case 4:

                System.out.println("");
                break;
            case 5:

                System.out.println(""
                break;
        }
        input.close();  */
//Ex-------------------------
/* int numero = input.nextInt();

      switch(numero){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11: 
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
           }
            input.close(); */
//Ex 1040
/* int A, B;
        
        A = input.nextInt();
        B = input.nextInt();

        if (A % B == 0 ){
            System.out.println("Sao Multiplos");
        }else if (B % A == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }  */
//Ex 1050-------
/*  int codigo = input.nextInt();
        
        switch(codigo){
            case 61:
                System.out.println("Brasilia");     
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break; 
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default: 
                System.out.println("DDD nao cadastrado");
                break;
        }
        input.close();   */
    //Ex 1049--------------
    /*  String tipoVert, tipoAnim, tipoAlim;
        
      tipoVert = input.nextLine();
      tipoAnim = input.nextLine();
      tipoAlim = input.nextLine();
      
        if(tipoVert.equals("vertebrado")){
          if(tipoAnim.equals("ave")){
            if(tipoAlim.equals("carnivoro")){
              System.out.println("aguia");
            }else{
              System.out.println("pomba");
            }
          }else{
            if(tipoAlim.equals("onivoro")){
              System.out.println("homem");
            }else{
              System.out.println("vaca");
            }
          }
        }else if(tipoVert.equals("invertebrado")){
          if(tipoAnim.equals("inseto")){
            if(tipoAlim.equals("hematofago")){
              System.out.println("pulga");
            }else{
              System.out.println("lagarta");
            }
          }else{
            if(tipoAlim.equals("hematofago")){
              System.out.println("sanguessuga");
            }else{
              System.out.println("minhoca");
            }
          }
        }input.close();  */
//Ex--------------
        /*double salario = input.nextDouble();

        if(salario >= 0 && salario <=400){
            double reajuste = (salario * 0.15);
            salario = reajuste + salario;
            System.out.format("Novo salario: %.2f\n", salario);
            System.out.format("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual 15 %");
        }else if(salario >400 && salario <= 800){
            double reajuste = (salario * 0.12);
            salario = reajuste + salario;
            System.out.format("Novo salario: %.2f\n", salario);
            System.out.format("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual 12 %");
        }else if(salario >800 && salario <=1200){
            double reajuste = (salario * 0.10);
            salario = reajuste + salario;
            System.out.format("Novo salario: %.2f\n", salario);
            System.out.format("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual 10 %");
        }else if(salario >1200 && salario <=2000){
            double reajuste = (salario * 0.07);
            salario = reajuste + salario;
            System.out.format("Novo salario: %.2f\n", salario);
            System.out.format("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual 7 %");
        }else{
            double reajuste = (salario * 0.04);
            salario = reajuste + salario;
            System.out.format("Novo salario: %.2f\n", salario);
            System.out.format("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual 4 %");

        }input.close(); */
//Ex -------------
/*Scanner input = new Scanner(System.in);
        
        int x, y;
        
        String quadStr = "";
        
        for(int i = 0; quadStr != null; i++){
            x = input.nextInt();
            y = input.nextInt(); 

            if( x > 0 && y > 0 ){
                quadStr = "primeiro";
                System.out.println(quadStr);
            }else if(x < 0 && y > 0){
                quadStr = "segundo";
                System.out.println(quadStr);
            }else if(x < 0 && y < 0){
                quadStr = "terceiro";
                System.out.println(quadStr);
            }else if(x > 0 && y < 0){
                quadStr = "quarto";
                System.out.println(quadStr);
            }else{
                quadStr = null;
            }
        }input.close(); */
      