import java.util.Scanner;

public class Evolved_Conta_Bancaria {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Conta_Corrente AccountC = new Conta_Corrente("Kevin", "190056", 10000);
        Conta_Poupanca AccountP = new Conta_Poupanca("João", "002319", 100000);

        System.out.println(AccountC.Transferir(AccountP, 10000)+"\n");

        System.out.println(AccountC.Consultar()+"\n");
        System.out.println(AccountP.Consultar());

    }
}