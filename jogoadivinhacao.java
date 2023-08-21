import java.util.Scanner;

public class jogoadivinhacao {
    
    public static void main(String[] args) {
        
         while(true) { 
         double n = 1 + Math.random() * (6-1);
         int res = (int) n;
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite um numero de 1 a 5: ");
         int valor = scanner.nextInt();
         String result = (valor==res)? "Acertou!":"Errou!";
         System.out.println(result + " eu pensei no valor: " + res);

        if (valor == 0) {
            System.out.print("Obrigado por jogar! Ate a proxima.");
            break;
        }
    }

    }
   }

