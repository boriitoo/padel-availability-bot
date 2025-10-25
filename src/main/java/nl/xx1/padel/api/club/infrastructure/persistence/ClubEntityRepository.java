package nl.xx1.padel.api.club.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClubEntityRepository extends JpaRepository<ClubEntity, UUID> {}
