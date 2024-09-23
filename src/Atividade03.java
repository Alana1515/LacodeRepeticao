import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {

        int numero;
        int fatorial = 1;
        int multiplica = 1;

        System.out.println("Digite um numero" );
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        do {

            fatorial *= multiplica;
            multiplica++;

        }while (multiplica <= numero);

        System.out.println("Fatorial de " + numero + " = " + fatorial);

    }
}
