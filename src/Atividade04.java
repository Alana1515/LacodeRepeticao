import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

        }while(idade <= 0);
        System.out.println("Idade é: " + idade);
    }
}
