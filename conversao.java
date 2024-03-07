import java.util.Scanner;

public class conversao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite sua quantidade de dinheiro em real :");
        double real = leitor.nextFloat();

        double dolar = real*5.17;
        double euro = real*6.14;
        double peso = real*0.05;
        
        System.out.println("a conversao de real para dolar e :" + dolar);
        System.out.println("a conversao de real para euro e :" + euro);
        System.out.println("a conversao de real para peso argentino e :" + peso);

    }
    
}
