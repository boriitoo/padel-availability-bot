package nl.xx1.padel.api.command.application;

public interface ICommand {
  void execute(ICommandContext context);

  void validate(ICommandContext context);
}
