package nl.xx1.padel.api.messaging.application.incomingmessage;

import nl.xx1.padel.api.messaging.infrastructure.http.IncomingMessageRequest;
import org.springframework.util.Assert;

public record IncomingMessageParameters(
    String messageId, String body, String from, Boolean isForwarded) {
  public IncomingMessageParameters {
    Assert.notNull(messageId, "Message ID can't be null.");
    Assert.notNull(body, "Body can't be null.");
    Assert.notNull(from, "From can't be null.");

    if (isForwarded == null) {
      isForwarded = false;
    }
  }

  public static IncomingMessageParameters of(IncomingMessageRequest request) {
    return new IncomingMessageParameters(
        request.messageId(), request.body(), request.from(), request.isForwarded());
  }
}
