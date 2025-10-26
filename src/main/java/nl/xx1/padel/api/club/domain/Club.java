package nl.xx1.padel.api.club.domain;

import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

@Getter
@Setter
public class Club {
  private UUID id;
  private String name;
  private Instant createdAt;
  private ClubProvider provider;
  private boolean isActive;

  public Club(String name, ClubProvider provider) {
    Assert.notNull(name, "Name can't be null.");
    Assert.notNull(provider, "Provider must be set.");
    this.name = name;
    this.provider = provider;
    this.createdAt = Instant.now();
    this.isActive = true;
  }

  public void deactivate() {
    this.isActive = false;
  }
}
