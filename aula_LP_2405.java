/**
 * aula_LP_2405
 */
/**
 * Conta
 */
class Conta {
    int numero;
    String titular;
    double saldo;
    
    public void saca(Conta destino, double quantidade) {
        double novoSaldo = destino.saldo - quantidade;        
        destino.saldo = novoSaldo;
    }

    public void deposita(Conta destino, double quantidade) {
        double novoSaldo = destino.saldo + quantidade;
        destino.saldo = novoSaldo;
    }
}

public class aula_LP_2405 {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.titular = "Goku";
        minhaConta.saldo = 1000.00;
        minhaConta.saca(minhaConta,80.00);
        System.out.println("Saldo atual: "+ minhaConta.saldo);
    }
}
