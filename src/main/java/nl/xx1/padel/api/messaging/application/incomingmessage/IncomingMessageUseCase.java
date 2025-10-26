package nl.xx1.padel.api.messaging.application.incomingmessage;

import nl.xx1.padel.api.UseCase;

@UseCase(
    title = "Incoming Message",
    description = "This use case handles an incoming message received on our registered webhook.")
public class IncomingMessageUseCase {
  public void execute(IncomingMessageParameters parameters) {}
}
