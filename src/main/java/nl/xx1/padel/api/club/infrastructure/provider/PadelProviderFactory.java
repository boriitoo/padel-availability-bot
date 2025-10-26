package nl.xx1.padel.api.club.infrastructure.provider;

import jdk.jshell.spi.ExecutionControl;
import nl.xx1.padel.api.club.application.AvailabilityProvider;
import nl.xx1.padel.api.club.domain.Club;
import nl.xx1.padel.api.club.infrastructure.provider.playtomic.PlaytomicClient;

public class PadelProviderFactory {
  public static AvailabilityProvider create(Club club) {
    return switch (club.getProvider()) {
      case PLAYTOMIC -> new PlaytomicClient();
      case BOOK_NOW -> throw new ExecutionControl.NotImplementedException("");
    };
  }
}
