public class Conta_Poupanca extends Conta{

    public Conta_Poupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public Conta_Poupanca(String titular, String nConta, double saldo) {
        super(titular, nConta, saldo);
    }

    public void Rendimento(){

    }

    public String Consultar(){
        return "Nome: " + getTitular() + "\nSaldo: " + getSaldo();
    }
}
