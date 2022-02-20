public class Conta {
    private String titular;
    private String nConta;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(String titular, String nConta, double saldo) {
        this.titular = titular;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    public Boolean Depositar(double a){
        this.saldo = this.saldo + a;
        return true;
    }

    public Boolean Sacar(double a){
        if (this.saldo >= a){
            this.saldo -= a;
            return true;
        }
        return false;
    }

    public Boolean Transferir(Conta b, double a){
        if (this.saldo >= a){
            b.Depositar(a);
            return this.Sacar(a);
        }
        return false;
    }

    public String Consultar(){
        return "Nome: " + this.titular + "\nSaldo: " + this.saldo + "\nNº da Conta: " + this.nConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
