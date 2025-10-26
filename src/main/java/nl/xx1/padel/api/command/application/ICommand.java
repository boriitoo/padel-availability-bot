package nl.xx1.padel.api.command.application;

import org.springframework.util.ClassUtils;

public interface ICommand {
  void execute(ICommandContext context);

  void validate(ICommandContext context);
}
