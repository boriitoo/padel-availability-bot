package nl.xx1.padel.api.command.application;

import java.util.Arrays;
import java.util.List;
import nl.xx1.padel.api.messaging.application.incomingmessage.IncomingMessageParameters;

public record ICommandContext(List<String> arguments, String messageId, String body, String from) {
  public static ICommandContext of(IncomingMessageParameters parameters) {
    List<String> arguments = Arrays.stream(parameters.body().split(" ")).toList();
    return new ICommandContext(
        arguments, parameters.messageId(), parameters.body(), parameters.from());
  }
}
