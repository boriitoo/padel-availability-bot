package nl.xx1.padel.api.messaging.infrastructure.adapter;

import nl.xx1.padel.api.messaging.application.SendTextMessage;
import org.springframework.stereotype.Component;

@Component
public class WhatsappNotificationAdapter implements SendTextMessage {
  @Override
  public void sendMessage(String userId, String message) {}
}
