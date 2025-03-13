package com.cordlang.commands;

import net.dv8tion.jda.api.entities.Message;
import com.cordlang.commands.Command;

public class ReplyCommand implements Command {
    private String replyMessage;
    private String allowedUserIDs;

    public ReplyCommand(String replyMessage, String allowedUserIDs) {
        this.replyMessage = replyMessage;
        this.allowedUserIDs = allowedUserIDs;
    }

    @Override
    public void execute(Message message) {
        // TODO: Implementar lógica para allowedUserIDs si es necesario
        message.getChannel().sendMessage(replyMessage).queue();
    }
}
