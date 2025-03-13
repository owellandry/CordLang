package com.cordlang.commands;

import net.dv8tion.jda.api.entities.Message;

public interface Command {
    void execute(Message message);
}
