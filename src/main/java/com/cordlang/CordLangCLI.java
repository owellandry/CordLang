package com.cordlang;

import java.io.File;
import java.util.Scanner;

public class CordLangCLI { // Updated class name
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: cordlang [init|run]");
            return;
        }
        String command = args[0];
        if (command.equalsIgnoreCase("init")) {
            initProject();
        } else if (command.equalsIgnoreCase("run")) {
            runProject();
        } else {
            System.out.println("Comando desconocido: " + command);
        }
    }
    
    private static void initProject() {
        System.out.println("Vamos a crear un bot de Discord!");
        System.out.println("CordLang v1.0");
        System.out.println();
        System.out.println("Datos del bot:");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String name = scanner.nextLine().trim();
        System.out.print("Token: ");
        String token = scanner.nextLine().trim();
        
        // Crear archivo de configuración con el token
        try {
            File configFile = new File("src/main/java/com/cordlang/config/bot_config.json");
            if (configFile.createNewFile()) {
                System.out.println("Archivo de configuración creado: " + configFile.getAbsolutePath());
                // Aquí podrías escribir el token y otros datos en el archivo
            }
        } catch (Exception e) {
            System.err.println("Error al crear el archivo de configuración: " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("Iniciando creación del bot \"" + name + "\"...");
        // TODO: Lógica de creación de archivos y carpetas.
        
        System.out.println("¡Bot creado correctamente!");
        scanner.close();
    }
    
    private static void runProject() {
        // TODO: Lógica para interpretar main.cxl y arrancar el bot de Discord.
        System.out.println("Ejecutando el bot...");
    }
}