/**
 * aula_LP_3105
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

class Funcionario{
    private String nome;
    protected String cpf;
    protected double salario;

    Funcionario(){
        this.salario = 1000;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}

class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    Gerente(){
        senha = 00000;
        numeroDeFuncionariosGerenciados = 0;
    }

    public boolean autentica(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        }
        else {
            System.out.println("Acesso negado");
            return false;
        }
    }
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
}

class ControleDeBonificacoes{
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario){
        this.totalDeBonificacoes = funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}

public class aula_LP_3105 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Edivaldo");
        gerente.setSenha(4321);
        gerente.setSalario(5000.0);

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(5000.0);
        controle.registra(gerente);
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);
        controle.registra(funcionario);
        //System.out.println(funcionario.getBonificacao());
        System.out.println(controle.getTotalDeBonificacoes());
    }
}