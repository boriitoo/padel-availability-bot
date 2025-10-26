package nl.xx1.padel.api.club.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import nl.xx1.padel.api.club.domain.ClubProvider;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "clubs")
@Getter
@Setter
public class ClubEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "is_active", nullable = false)
  private boolean isActive;

  @Column(name = "provider", nullable = false)
  @Enumerated(EnumType.STRING)
  private ClubProvider provider;

  @Column(name = "created_at", nullable = false)
  private Instant createdAt;
}
