package nl.xx1.padel.api.messaging.infrastructure.http;

import nl.xx1.padel.api.messaging.application.incomingmessage.IncomingMessageParameters;
import nl.xx1.padel.api.messaging.application.incomingmessage.IncomingMessageUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messaging")
public class IncomingMessageAction {
  private final IncomingMessageUseCase incomingMessageUseCase;

  public IncomingMessageAction(IncomingMessageUseCase incomingMessageUseCase) {
    this.incomingMessageUseCase = incomingMessageUseCase;
  }

  @PostMapping
  public ResponseEntity<Void> handleIncomingMessage(@RequestBody IncomingMessageRequest request) {
    var parameters = IncomingMessageParameters.of(request);
    System.out.println(request);
    incomingMessageUseCase.execute(parameters);
    return ResponseEntity.ok().build();
  }
}
