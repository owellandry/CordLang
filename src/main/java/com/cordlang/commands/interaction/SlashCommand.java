package com.cordlang.commands.interaction;

import net.dv8tion.jda.api.entities.Message;
import com.cordlang.commands.Command;

public class SlashCommand implements Command {
    @Override
    public void execute(Message message) {
        message.getChannel().sendMessage("Comando slash ejecutado.").queue();
    }
}
