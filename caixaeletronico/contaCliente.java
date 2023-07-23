package caixaeletronico;

import java.util.Scanner;

public class contaCliente {

    Scanner tec = new Scanner(System.in);
    int opcao;
    double valor = 0;
    double saldo = 10000;
    double sxaldoAtual = saldo;
    System.out.println("\tMENU");
    System.out.println("1 - Saque.");
    System.out.println("2 - Depósito.");
    System.out.println("3 - Saldo.");
    System.out.println("4 - Extrato."); // falta recursos para implementar...
    System.out.println("5 - Sair.");
    System.out.println("Selecione a opção desejada:");
    opcao = tec.nextInt();
    while(opcao!=5) {
        switch(opcao){
            case 1:System.out.print("Informe o valor do saque.");
            valor = tec.nextDouble();
                double saldoAtual;
                while(valor > 2000 || valor>saldoAtual) {
                System.out.print("Saque não permitido.");
                System.out.print("Informe um valor menor.");
                valor = tec.nextDouble(); 
            }
            saldoAtual = saldoAtual - valor;
            break;
            case 2:System.out.print("Informe o valor a depositar:");
            valor = tec.nextDouble();
            while(valor > 5000){
                System.out.print("Depósito não permitido.");
                System.out.print("Informe um valor menor.");
                valor = tec.nextDouble();
            }
            saldoAtual = saldoAtual + valor;
            break;
            case 3:System.out.print("Seu saldo atual é R$:" + saldoAtual);
            break;
            case 4: //Em construção...
            break;
        }
        System.out.println("\tMENU");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saldo");
        System.out.println("4 - Extrato"); //Estou em processo de desenvolvimento.
        System.out.println("5 - Sair");
        System.out.println("Escolha a opção desejada.");
        opcao = tec.nextInt();
    }
    tec.close();
    }

}