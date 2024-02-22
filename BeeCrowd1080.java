import java.util.Random;
import java.util.Scanner;

public class BeeCrowd1080 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		    
            int maior = 0;
		    int posi = 1;
		    int x;
		    
            for (int i = 1; i <= 100; i++) {
			    x = sc.nextInt();
			    
                if (i == 1) {
				    maior = x;
				    posi = 1;
			    }else if(x > maior) {
				    maior = x;
				    posi = i;
			}
		}
		System.out.println(maior);
		System.out.println(posi);

        sc.close();

    }
    
}
