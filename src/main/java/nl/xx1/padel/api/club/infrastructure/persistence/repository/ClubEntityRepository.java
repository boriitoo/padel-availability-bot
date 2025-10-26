package nl.xx1.padel.api.club.infrastructure.persistence.repository;

import java.util.UUID;
import nl.xx1.padel.api.club.infrastructure.persistence.entity.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubEntityRepository extends JpaRepository<ClubEntity, UUID> {}
