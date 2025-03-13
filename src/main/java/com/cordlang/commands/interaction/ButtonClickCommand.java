package com.cordlang.commands.interaction;

import net.dv8tion.jda.api.entities.Message;
import com.cordlang.commands.Command;

public class ButtonClickCommand implements Command {
    @Override
    public void execute(Message message) {
        message.getChannel().sendMessage("Se ha hecho click en un botón.").queue();
    }
}
