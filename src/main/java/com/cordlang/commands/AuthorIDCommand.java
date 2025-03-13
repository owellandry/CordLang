package com.cordlang.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import com.cordlang.commands.Command;

public class AuthorIDCommand implements Command {
    @Override
    public void execute(Message message) {
        User author = message.getAuthor();
        message.getChannel().sendMessage("Tu ID es: " + author.getId()).queue();
    }
}
