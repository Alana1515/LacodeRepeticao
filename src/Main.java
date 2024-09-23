import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                int numero;
                int soma;

                Scanner sc = new Scanner(System.in);
                System.out.println("Informe o numero da Tabuada desejada ");
                numero = sc.nextInt();
                for (int i = 0; i <= 10; i++) {

                    soma = numero * i;

                    System.out.println("Tabuada " + i + ": " + soma);
                }

            }
        }
