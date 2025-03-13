package com.cordlang.bot.core;

import com.cordlang.commands.Command;
import java.util.HashMap;
import java.util.Map;

public class CommandRegistry {
    private static CommandRegistry instance;
    private Map<String, Command> commands = new HashMap<>();

    private CommandRegistry() {}

    public static CommandRegistry getInstance() {
        if (instance == null) {
            instance = new CommandRegistry();
        }
        return instance;
    }

    public void registerCommand(String name, Command command) {
        commands.put(name, command);
        System.out.println("Comando registrado: " + name);
    }

    public Map<String, Command> getCommands() {
        return commands;
    }
    
    public void registerDefaultCommands() {
        // TODO: Registrar comandos por defecto
        System.out.println("Comandos por defecto registrados.");
    }
}
