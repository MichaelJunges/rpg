package atividade;

/*
autor: Michael Junges
 */
public class Conta {
    private int conta;
    private String nome;
    private String cidade;
    private String telefone;
    private double valorConta;
    private double chequeEspecial;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public boolean credito(double valorTransferencia){
        if(valorTransferencia <= valorConta + chequeEspecial){
            this.valorConta -= valorTransferencia;
            System.out.println("Transferência realizada.");
            return true;
        }else{
            System.out.println("Transferência não realizada.");
            return false;
        }
    }
    
    public void debito(double valor){
        this.valorConta += valor;
    }
    
    @Override
    public String toString(){
        return "Conta: " + conta + "\nNome: " + nome + "\nSaldo: " + valorConta + "\nCidade: " + cidade + "\nTelefone: " + telefone + "\nLimite: " + chequeEspecial +"\n---------------";
    }
}
