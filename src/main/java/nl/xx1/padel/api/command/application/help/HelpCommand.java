package nl.xx1.padel.api.command.application.help;

import java.util.Set;
import nl.xx1.padel.api.command.application.CommandDescription;
import nl.xx1.padel.api.command.application.ICommand;
import nl.xx1.padel.api.command.application.ICommandContext;
import nl.xx1.padel.api.messaging.application.SendTextMessage;
import org.reflections.Reflections;

@CommandDescription(
    title = "!help",
    description = "This will display all relevant information to get you up and running.")
public class HelpCommand implements ICommand {

  private final SendTextMessage sendTextMessage;

  public HelpCommand(SendTextMessage sendTextMessage) {
    this.sendTextMessage = sendTextMessage;
  }

  @Override
  public void execute(ICommandContext context) {
    StringBuilder stringBuilder = new StringBuilder("My commands are: \n");
    Set<Class<? extends ICommand>> commands = new Reflections().getSubTypesOf(ICommand.class);
    commands.forEach(
        command -> {
          CommandDescription annotation = command.getAnnotation(CommandDescription.class);
          stringBuilder.append("%s: %s".formatted(annotation.title(), annotation.description()));
        });

    sendTextMessage.sendMessage(context.from(), stringBuilder.toString());
  }

  @Override
  public void validate(ICommandContext context) {}
}
