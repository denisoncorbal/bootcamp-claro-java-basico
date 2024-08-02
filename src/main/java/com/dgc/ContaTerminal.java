package com.dgc;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Número do Cliente!");
        int clientNumber = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Por favor, digite o Número da Agência!");
        String agencyNumber = scanner.nextLine();
        
        System.out.println("Por favor, digite o Nome do Cliente!");
        String clientName = scanner.nextLine();
        
        System.out.println("Por favor, digite o Saldo do Cliente!");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", clientName, agencyNumber, clientNumber, balance);

        scanner.close();
    }
}