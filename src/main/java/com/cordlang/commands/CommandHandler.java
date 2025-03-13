package com.cordlang.commands;

import java.util.HashMap;
import java.util.Map;
import net.dv8tion.jda.api.entities.Message;

public class CommandHandler {
    private Map<String, Command> commands = new HashMap<>();

    public void register(String name, Command command) {
        commands.put(name, command);
    }

    public void handleCommand(String name, Message message) {
        if (commands.containsKey(name)) {
            commands.get(name).execute(message);
        } else {
            message.getChannel().sendMessage("Comando desconocido: " + name).queue();
        }
    }
}
