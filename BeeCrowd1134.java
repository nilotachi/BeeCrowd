import java.util.Scanner;

public class BeeCrowd1134 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    // 1.Alcool 2.Gasolina 3.Diesel 4.Fim ...
        
        int codigo = 0, gasolina=0, alcool=0, diesel=0;
        int fim = 4;

        while(codigo != 4){
            System.out.println("Aperte 1.Álcool 2.Gasolina"
            + " 3.Diesel 4.Fim ");
            codigo = teclado.nextInt();
            if (codigo == 1){
                alcool ++;
            }else if(codigo ==2){
                gasolina ++;
            }else if(codigo == 3){
                diesel ++;
            }
        }System.out.println("MUITO OBRIGADO");
            System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool,gasolina,diesel );
            teclado.close();


        
            

    }
}
