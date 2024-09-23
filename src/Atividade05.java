import java.util.Random;
import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
        int tentativa = 0;
        int palpite = -1;


        Scanner sc = new Scanner(System.in);

        while (palpite != numeroAleatorio) {
            System.out.println("Digite um numero (0 para sair): " );
            palpite = sc.nextInt();

            tentativa++;

            if (palpite == 0) break;
        }

        System.out.println("O numero é  " + numeroAleatorio);

    }
}
