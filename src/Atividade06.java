import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {

        int quantidadeNumero = 0;
        double soma = 0;
        int numero;
        double media = 0;

        System.out.println("Digite a quantidade de numeros: ");
        Scanner sc = new Scanner(System.in);
        quantidadeNumero = sc.nextInt();


        for(int i =0; i < quantidadeNumero; i++){
            System.out.println("Digite os numeros: " + (i +1) );
            numero = sc.nextInt();

            soma += numero;
        }

        media = soma / quantidadeNumero;

        System.out.println("A media é:" + media);



    }
}
