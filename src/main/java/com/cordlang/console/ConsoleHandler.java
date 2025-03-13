package com.cordlang.console;

import java.util.Scanner;

public class ConsoleHandler {
    public void handle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese comandos para CordLang (escriba 'exit' para salir):");
        while (true) {
            System.out.print(">> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            System.out.println("Comando ingresado: " + input);
        }
        scanner.close();
    }
}
