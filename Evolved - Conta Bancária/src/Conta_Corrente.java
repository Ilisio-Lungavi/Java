public class Conta_Corrente extends Conta{

    public Conta_Corrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public Conta_Corrente(String titular, String nConta, double saldo) {
        super(titular, nConta, saldo);
    }
}
