import java.util.Scanner;

public class menor {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero :");
        int num1 = leitor.nextInt();
        
        System.out.println("digite um numero :");
        int num2 = leitor.nextInt();

        if(num1 < num2){
            System.out.println("o menor numero e :" + num1);
        }

        else {
            System.out.println("o menor numero e :" + num2);
        }

    }

    
}
