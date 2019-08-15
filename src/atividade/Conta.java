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
    
    @Override
    public String toString(){
        return "Conta: " + this.conta + "\nNome: " + this.nome + "\nSaldo: " + this.valorConta + "\n---------------";
    }
}
