package nl.xx1.padel.api.command.application.help;

import nl.xx1.padel.api.command.application.Command;
import nl.xx1.padel.api.command.application.ICommand;
import nl.xx1.padel.api.command.application.ICommandContext;

@Command(
    title = "!help",
    description = "This will display all relevant information to get you up and running.")
public class HelpCommand implements ICommand {

  @Override
  public void execute(ICommandContext context) {
  }

  @Override
  public void validate(ICommandContext context) {}
}
