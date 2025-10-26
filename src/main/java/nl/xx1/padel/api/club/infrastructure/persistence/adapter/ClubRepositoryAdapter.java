package nl.xx1.padel.api.club.infrastructure.persistence.adapter;

import nl.xx1.padel.api.club.domain.Club;
import nl.xx1.padel.api.club.domain.ClubRepository;
import nl.xx1.padel.api.club.infrastructure.persistence.repository.ClubEntityRepository;
import org.springframework.stereotype.Component;

@Component
public class ClubRepositoryAdapter implements ClubRepository {

  private final ClubEntityRepository clubEntityRepository;

  public ClubRepositoryAdapter(ClubEntityRepository clubEntityRepository) {
    this.clubEntityRepository = clubEntityRepository;
  }

  @Override
  public Club save(Club club) {
    return null;
  }
}
