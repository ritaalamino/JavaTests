/**
 * aula_LP_2405
 */
/**
 * Conta
 */
class Conta {
    private int numero;
    private String titular;
    private double saldo;   
    private String endereco;
    private String cpf;
    private String batata;
    private static int totalContas;
    
    Conta(){
        //this.titular = titular;
        Conta.totalContas = Conta.totalContas + 1;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public static int getContas(){
        return Conta.totalContas;
    }

    public String getTitulo(){
        return this.titular;
    }

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
        Conta minhaConta2 = new Conta();
        System.out.println(Conta.getContas());
    }
}
