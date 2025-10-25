package nl.xx1.padel.api.club.infrastructure.persistence;

import nl.xx1.padel.api.club.domain.Club;
import nl.xx1.padel.api.club.domain.ClubRepository;
import org.springframework.stereotype.Component;

@Component
public class ClubRepositoryAdapter implements ClubRepository {

  private final ClubRepository clubRepository;

  @Override
  public Club save(Club club) {
    return null;
  }
}
