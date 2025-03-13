package com.cordlang.commands;

import net.dv8tion.jda.api.entities.Message;
import com.cordlang.commands.Command;

public class NomentionCommand implements Command {
    @Override
    public void execute(Message message) {
        message.getChannel().sendMessage("[Nomention] No se enviarán menciones.").queue();
    }
}
