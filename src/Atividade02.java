import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        while (numero >= 0) {
            System.out.println("Numero: " + numero);
            numero--;
        }


    }
}
