import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite O Numero da Conta");
        int numero = scanner.nextInt();
        System.out.println("Digite sua  Agencia");
        String agencia = scanner.next();
        System.out.println("Digite seu Nome");
        String nomecliente = scanner.next();
        System.out.println("Digite seu Saldo");
        double saldo = scanner.nextDouble();

        ContaTerminal pessoa1 = new ContaTerminal(numero,agencia,nomecliente,saldo);

        pessoa1.Imprimir();

    }
}