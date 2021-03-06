/*
  Copyright (c) 2022 Daniel McCoy Stephenson
  Apache License 2.0
 */
package dansapps.dcwa.commands;

import preponderous.ponder.system.abs.ApplicationCommand;
import preponderous.ponder.system.abs.CommandSender;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Daniel McCoy Stephenson
 * @since February 1st, 2022
 */
public class HelpCommand extends ApplicationCommand {

    public HelpCommand() {
        super(new ArrayList<>(Arrays.asList("help")), new ArrayList<>(Arrays.asList("epa.help")));
    }

    @Override
    public boolean execute(CommandSender sender) {
        sender.sendMessage("=== Example Ponder Application Commands ===");
        sender.sendMessage("help - View a list of useful commands.");
        sender.sendMessage("info - View information about the application.");
        sender.sendMessage("quit - Quit the application.");
        return true;
    }

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        return execute(sender);
    }
}