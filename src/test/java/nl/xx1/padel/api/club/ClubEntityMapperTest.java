package nl.xx1.padel.api.club;

import nl.xx1.padel.api.club.domain.Club;
import nl.xx1.padel.api.club.domain.ClubProvider;
import nl.xx1.padel.api.club.infrastructure.persistence.entity.ClubEntity;
import nl.xx1.padel.api.club.infrastructure.persistence.mapper.ClubEntityMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClubEntityMapperTest {
  @Test
  public void shouldMapClubEntityToDomain() {
    // arrange
    ClubEntity clubEntity = new ClubEntity();
    clubEntity.setId(UUID.randomUUID());
    clubEntity.setName("Club Name");
    clubEntity.setActive(true);
    clubEntity.setProvider(ClubProvider.PLAYTOMIC);
    clubEntity.setCreatedAt(Instant.now());

    // act
    Club domain = ClubEntityMapper.INSTANCE.toDomain(clubEntity);

    // assert
    assertThat(domain).isNotNull();
    assertThat(domain.getName()).isEqualTo("Club Name");
    assertThat(domain.isActive()).isTrue();
    assertThat(domain.getProvider()).isEqualTo(ClubProvider.PLAYTOMIC);
    assertThat(domain.getCreatedAt()).isNotNull();
  }

  @Test
  public void shouldMapDomainToEntity() {
    // arrange
    Club club = new Club("example club", ClubProvider.PLAYTOMIC);

    // act
    ClubEntity clubEntity = ClubEntityMapper.INSTANCE.toEntity(club);

    // assert
    assertThat(clubEntity).isNotNull();
    assertThat(clubEntity.getName()).isEqualTo("example club");
    assertThat(clubEntity.getProvider()).isEqualTo(ClubProvider.PLAYTOMIC);
    assertThat(clubEntity.getCreatedAt()).isEqualTo(club.getCreatedAt());
  }
}
