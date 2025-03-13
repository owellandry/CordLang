package com.cordlang.bot;

import com.cordlang.bot.core.CommandRegistry;
import java.io.File;

public class BotRunner {
    public static void run(String[] args) {
        if (args.length > 0 && args[0].equals("init")) {
            System.out.println("Inicializando estructura del bot...");
            initializeBotStructure();
        } else {
            System.out.println("BotRunner: Iniciando el bot...");
            CommandRegistry.getInstance().registerDefaultCommands();
            // TODO: Iniciar conexión a Discord y demás lógica
        }
    }

    private static void initializeBotStructure() {
        try {
            // Crear directorios necesarios
            new File("src/main/java/com/cordlang/bot/core").mkdirs();
            new File("src/main/java/com/cordlang/commands").mkdirs();
            new File("src/main/java/com/cordlang/config").mkdirs();

            // Crear archivos de configuración (ejemplo)
            File configFile = new File("src/main/java/com/cordlang/config/bot_config.json");
            if (configFile.createNewFile()) {
                System.out.println("Archivo de configuración creado: " + configFile.getAbsolutePath());
            }

            System.out.println("Estructura del bot inicializada correctamente.");
        } catch (Exception e) {
            System.err.println("Error al inicializar la estructura del bot: " + e.getMessage());
        }
    }
}