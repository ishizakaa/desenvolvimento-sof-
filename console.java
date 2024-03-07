import java.util.Scanner;

public class console {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um texto");
        String texto = leitor.nextLine();
        System.out.println("texto digitado:" + texto);

        System.out.println("Digite um numero inteiro:");
        int numero = leitor.nextInt();
        System.out.println("numero digitado" + numero);
    }
    
}
