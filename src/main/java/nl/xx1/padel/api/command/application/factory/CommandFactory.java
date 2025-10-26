package nl.xx1.padel.api.command.application.factory;

import java.util.List;
import java.util.Optional;
import nl.xx1.padel.api.command.application.CommandDescription;
import nl.xx1.padel.api.command.application.ICommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

@Component
public class CommandFactory {
  private final List<ICommand> commands;
  private final String prefix;

  public CommandFactory(List<ICommand> commands, @Value("${whatsapp.prefix}") String prefix) {
    this.commands = commands;
    this.prefix = prefix;
  }

  public ICommand create(CommandFactoryParameters parameters) {
    String[] split = parameters.body().split(" ");

    if (split.length == 0) {
      throw new RuntimeException("Unable to fetch command.");
    }

    String first = split[0];

    if (!first.startsWith(prefix)) {
      return null;
    }

    Optional<ICommand> optional =
        commands.stream()
            .filter(
                command -> {
                  Class<?> userClass = ClassUtils.getUserClass(command);
                  CommandDescription annotation = userClass.getAnnotation(CommandDescription.class);
                  return annotation != null && annotation.title().equalsIgnoreCase(first);
                })
            .findFirst();

    return optional.orElse(null);
  }
}
