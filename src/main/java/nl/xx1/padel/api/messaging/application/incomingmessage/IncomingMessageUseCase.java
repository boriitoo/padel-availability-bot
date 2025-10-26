package nl.xx1.padel.api.messaging.application.incomingmessage;

import nl.xx1.padel.api.UseCase;
import nl.xx1.padel.api.command.application.ICommandContext;
import nl.xx1.padel.api.command.application.factory.CommandFactory;
import nl.xx1.padel.api.command.application.factory.CommandFactoryParameters;

@UseCase(
    title = "Incoming Message",
    description = "This use case handles an incoming message received on our registered webhook.")
public class IncomingMessageUseCase {
  private final CommandFactory commandFactory;

  public IncomingMessageUseCase(CommandFactory commandFactory) {
    this.commandFactory = commandFactory;
  }

  public void execute(IncomingMessageParameters parameters) {
    var factoryParameters = new CommandFactoryParameters(parameters.body());

    var command = commandFactory.create(factoryParameters);

    if (command == null) {
      return;
    }

    var context = ICommandContext.of(parameters);
    command.execute(context);
  }
}
