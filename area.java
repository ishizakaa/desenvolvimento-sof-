import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite a altura do triangulo:");
        int altura = leitor.nextInt();

        System.out.println("digite a largura do triangulo:");
        int largura = leitor.nextInt();
         
       // int area = leitor.nextInt();
        int Area = altura*largura; 

       // System.out.println("area do triangulo e:" + (altura*largura));
       System.out.println("area do triangulo e:" + Area);

    }
    
}
