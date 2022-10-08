import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        A = input.nextInt();
        System.out.println("Informe o limite: ");
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        int count = 1;
        while (N >= A) {
          System.out.println(A * count); 
          count++;          
        }
    }
}
