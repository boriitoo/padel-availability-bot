package nl.xx1.padel.api.club.infrastructure.persistence.repository;

import nl.xx1.padel.api.club.infrastructure.persistence.entity.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClubEntityRepository extends JpaRepository<ClubEntity, UUID> {}
