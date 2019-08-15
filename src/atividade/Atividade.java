package atividade;

import java.util.Scanner;

/*
Autor: Michael Junges
 */
public class Atividade {
    
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        System.out.println("Saldo Inicial:");
        
        conta1.setConta(1);
        conta1.setNome("Michael");
        conta1.setCidade("Capitão");
        conta1.setTelefone("(51)99599-9999");
        conta1.setValorConta(500.00);
        conta1.setChequeEspecial(1000.00);

        System.out.println(conta1); 

        conta2.setConta(2);
        conta2.setNome("Vinícius");
        conta2.setCidade("Lajeado");
        conta2.setTelefone("(51)99999-9999");
        conta2.setValorConta(1000.00);
        conta2.setChequeEspecial(300.00);

        System.out.println(conta2);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pra quem deseja transferir: ");
        int pessoa = teclado.nextInt();
        System.out.println("Conta selecionada: " + pessoa);
        System.out.println("Valor da transferência: R$");
        double valorTransferencia = teclado.nextDouble();
        System.out.println("---------------");
        if (pessoa == 1){
            if(conta2.credito(valorTransferencia)){
            conta1.debito(valorTransferencia);
            }
        }
        if(pessoa == 2){
            if(conta1.credito(valorTransferencia)){
            conta2.debito(valorTransferencia);
            }
        }
        System.out.println("Saldo Atualizado:");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}